<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Comenzi</title>

<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../css/signin.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container">
		
		<label class="label label-info" style="font-size: large;">Comenzi</label>
		
		<table class="table table-striped table-bordered table-condensed">                
          <tr>                         
             <th>Nume produs</th>
             <th>Cantitate</th>
             <th>Data</th>
          </tr>

          <c:forEach items = "${orders}" var="order">
	          <tr>             
	             <td>${order.item}</td>
	             <td>${order.quantity}</td>
	             <td>${order.date}</td>             
	          </tr>
          </c:forEach>

       </table>
		<button class="btn btn-primary" onclick="javascrip:window.location = 'shop'">Adauga Commanda</button>
		<button class="btn btn-primary" onclick="javascrip:window.location = 'export'">Exel Export</button>
	</div>
	<!-- /container -->
	
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>