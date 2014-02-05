package com.anapan.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anapan.entity.Order;
import com.anapan.service.OrderService;

@Controller
@RequestMapping("/export")
public class ExportController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(method = RequestMethod.GET)
	public HttpEntity<byte[]> exportOrders() throws IOException {

	    byte[] documentBody = this.createExportFile(orderService.getOrders());

	    HttpHeaders header = new HttpHeaders();
	    header.setContentType(new MediaType("application", "xls"));
	    header.setContentLength(documentBody.length);
	    header.setContentDispositionFormData("export", "comenzi.xls");
	    
	    return new HttpEntity<byte[]>(documentBody, header);
	}

	private byte[] createExportFile(List<Order> orders) {
				
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Comenzi");

		HSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("Nume produs");
		header.createCell(1).setCellValue("Cantitate");
		header.createCell(2).setCellValue("Data");
		
		int rowNum = 1;
		for (Order order : orders) { 
			HSSFRow row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(order.getItem());
			row.createCell(1).setCellValue(order.getQuantity());
			row.createCell(2).setCellValue(order.getDate());
		}
				
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			workbook.write(bos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return bos.toByteArray();
	}
}
