<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Houseplant</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <div class="containerindex">
        <section class="card">
            <div class="plant">
                <img class="img" src="img/flower.png">
            </div>
            <div class="principal">
                <h1 class="title">
                    <span class="title-house">HOUSE</span>
                    <span class="title-plant">PLANT</span>
                </h1>
                <a href="listar_plantas.do"><button class="button">Minhas plantas</button> </a>
                
            </div>
        </section>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>