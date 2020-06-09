<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Visualizar Planta</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Barra superior com os menus de navegação -->
		<c:import url="Menu.jsp"/>
        <!-- Container Principal -->
        <div id="main" class="container">
            <h3 class="page-header">Planta Cadastrada com Sucesso! #${planta.id}</h3>
            <div class="row">
                <div class="col-md-12">
                    <p><strong>Nome</strong>
                    </p>
                    <p>
                        ${planta.nome}
                    </p>
                </div>
            </div>
             <div class="row">
                <div class="col-md-12">
                    <p><strong>TempMin</strong>
                    </p>
                    <p>
                        ${planta.tempMin}
                    </p>
                </div>
                <div class="col-md-12">
                    <p><strong>TempMax</strong>
                    </p>
                    <p>
                        ${planta.tempMax}
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <p><strong>UmidSoloMin</strong>
                    </p>
                    <p>
                        ${planta.umidSoloMin}
                    </p>
                </div>
                <div class="col-md-12">
                    <p><strong>UmidSoloMax</strong>
                    </p>
                    <p>
                        ${planta.umidSoloMax}
                    </p>
                </div>
            </div>
            
            
            <div class="row">
                <div class="col-md-12">
                    <p><strong>Comentários</strong>
                    </p>
                    <p>
                        ${planta.descricao}
                    </p>
                </div>
            </div>
            
            
            <hr/>
            <div id="actions" class="row">
                <div class="col-md-12">
                    <a href="index.jsp" class="btn btn-default">Voltar</a>
                </div>
            </div>
        </div>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>

</body>
</html>