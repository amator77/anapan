<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Magazin</title>

<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container">

		<form class="form-horizontal" method="post">
			<fieldset>

				<!-- Form Name -->
				<label class="label label-info" style="font-size: large;">Comanda Noua</label>
				

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="item">Produs</label>
					<div class="col-md-4">
						<input id="item" name="item" type="text" placeholder="nume"
							class="form-control input-md" required=""> <span
							class="help-block">Nume produs</span>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="quantity">Cantitate</label>
					<div class="col-md-4">
						<input id="quantity" name="quantity" type="text"
							placeholder="cantitate" class="form-control input-md" required="">
						<span class="help-block">Cantitate produs</span>
					</div>
				</div>

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="save">Salveaza</label>
					<div class="col-md-4">
						<button id="save" name="save" class="btn btn-primary">Salveaza</button>
					</div>
				</div>

			</fieldset>
		</form>
		<button class="btn btn-primary" onclick="javascrip:window.location = 'orders'">Vezi Comenzi</button>

	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>