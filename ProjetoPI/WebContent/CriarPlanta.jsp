<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Criar Planta</title>

            <link href="css/bootstrap.min.css" rel="stylesheet">
            <link href="css/style.css" rel="stylesheet">
        </head>

        <body>
                <!-- Barra superior com os menus de navegacao -->
				<c:import url="Menu.jsp"/>
			    <!-- Container Principal -->
    			<div id="main" class="container">
      				 <h3 class="page-header">Criar Planta</h3>
        
       				 <!-- Formulario para inclusao de plantas -->
       			 	<form action="ManterPlanta.do" method="post">
          			 	 <!-- area de campos do form -->
          			  	<div class="row">
                			<div class="form-group col-md-12">
                   				 <label for="nome">Nome da Planta:</label>
                    			<input type="text" class="form-control" name="nome" id="nome" required maxlength="100" placeholder="nome completo" >
                    		</div>
                        </div>
                        <div class="row">
                            <div class="form-group col-md-6">
                                <label for="tempMin">Temperatura Mínima: </label>
                   				 <input type="text" class="form-control" name="tempMin" id="tempMin" maxlength="20" placeholder="MIN">              				 
                            </div>
                             <div class="form-group col-md-6">
                                <label for="tempMax">Temperatura Máxima: </label>
                   				 <input type="text" class="form-control" name="tempMax" id="tempMax" maxlength="20" placeholder="MAX">              				 
                            </div>
                            </div>
							
                            
                            <div class="row">
                            <div class="form-group col-md-6">
                    			<label for="umidSoloMin">Umididade do Solo Mínima:</label>
								 <input type="text" class="form-control" name="umidSoloMin" id="umidSoloMin" maxlength="20" placeholder="MIN">
               				 </div>
               				 
               				  <div class="form-group col-md-6">
                                <label for="umidSoloMax">Umidade do Solo Máxima: </label>
                   				 <input type="text" class="form-control" name="umidSoloMax" id="umidSoloMax" maxlength="20" placeholder="MAX">              				 
                            </div>               				 
                        </div>
                        
                        <div class="row">
                            <div class="form-group col-md-6">
                                <label for="descricao">Comentários: </label>
                   				 <textarea id="descricao" name="descricao" rows="3" cols="75" placeholder="Escreva um comentário aqui."></textarea>
                   			</div>
                   			</div>
                   			
                   			
                        <hr />
                        <div id="actions" class="row">
                            <div class="col-md-12">
                                <button type="submit" class="btn btn-primary" name="acao" value="Criar">Salvar</button>
                                <a href="ListarPlantas.jsp" class="btn btn-default">Cancelar</a>
                            </div>
                        </div>
                    </form>
                </div>
                <script src="js/jquery.min.js"></script>
                <script src="js/bootstrap.min.js"></script>
        </body>

        </html>