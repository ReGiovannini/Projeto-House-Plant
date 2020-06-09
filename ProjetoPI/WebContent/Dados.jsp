<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Dados</title>

            <link href="css/bootstrap.min.css" rel="stylesheet">
            <link href="css/style.css" rel="stylesheet">

        </head>
<body>
        <!-- Barra superior com os menus de navegacao -->
			<c:import url="Menu.jsp"/>
				<h1 class="text-center align-middle" style="margin-top: 40px;">Dados </h1>
				<div  class="table-responsive col-md-12" >
				<table  class="table  table-striped table-hover " cellspacing="0" cellpadding="0" style="margin-top: 30px;">
				<tr>
				<td> <iframe width="430" height="270" style="border: 1px solid #cccccc;" src="https://thingspeak.com/channels/1049229/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line"></iframe>
				</td>
				<td><iframe width="430" height="270" style="border: 1px solid #cccccc;" src="https://thingspeak.com/channels/1049229/charts/2?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"></iframe>
				</td>
				<td><iframe width="430" height="270" style="border: 1px solid #cccccc;" src="https://thingspeak.com/channels/1049229/charts/3?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"></iframe>
				</td>
				</tr>
				</table>
				</div>

</body>
</html>