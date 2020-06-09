<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Alerta umidade do solo</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="hello.js"></script>
    
</head>
<body>
<c:import url="Menu.jsp"/>
	<div class="container row center-block">
	<div class=" col-md-12"  style="margin: 100px auto 0 auto; ">
	<div class="alert alert-danger text-center text-uppercase">
	<h2>Umidade do solo na mini estufa:  ${umidSolo} </h2>
	</div>
	<div class="text-center alert alert-warning">
	<h3> Umidade do solo ideal mínima:  ${umidSoloMin} </h3>
    </div>
    <div class="text-center alert alert-warning">
    <h3> Umidade do solo ideal máxima:  ${umidSoloMax} </h3>
    </div>
	</div>
	</div>
	
	<script type="text/javascript">
	setTimeout(function(){window.top.location="AlertaUmidSolo.do?umidSoloMin=${umidSoloMin}&umidSoloMax=${umidSoloMax }"} , 5000);
	</script>

</body>
</html>