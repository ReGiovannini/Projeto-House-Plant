<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Alterar Planta</title>

            <link href="css/bootstrap.min.css" rel="stylesheet">
            <link href="css/style.css" rel="stylesheet">
        </head>

        <body>
                <!-- Barra superior com os menus de navegacao -->
				<c:import url="Menu.jsp"/>
			    <!-- Container Principal -->
    			<div id="main" class="container">
      				 <h3 class="page-header">Alterar Planta</h3>
        
       				 <!-- Formulario para alteracao de plantas -->
       			 	<form action="ManterPlanta.do" method="post">
          			 	 <!-- area de campos do form -->
          			 	 <input type="hidden" name="id" value="${planta.id }" />
          			  	<div class="row">
                			<div class="form-group col-md-12">
                   				 <label for="nome">Nome da Planta:</label>
                    			<input type="text" class="form-control" name="nome" id="nome" required maxlength="100" placeholder="nome completo" value="${planta.nome }">
                    		</div>
                        </div>
                        <div class="row">
                            <div class="form-group col-md-6">
                                <label for="tempMin">TempMin </label>
                   				 <input type="text" class="form-control" name="tempMin" id="tempMin" maxlength="20" placeholder="MIN" value="${planta.tempMin }">
                   			</div>
                   				 
                   				 
                   		    <div class="form-group col-md-6">
                                <label for="tempMax">TempMax</label>
                                <input type="text" class="form-control" name="tempMax" id="tempMax" maxlength="20" placeholder="MAX" value="${planta.tempMax }">
                            </div>
                            </div>
                            
                            <div class="row">
                            <div class="form-group col-md-6">
                                <label for="umidSoloMin">UmidSoloMin </label>
                   				 <input type="text" class="form-control" name="umidSoloMin" id="umidSoloMin" maxlength="20" placeholder="MIN" value="${planta.umidSoloMin }">
                   			</div>
                   				 
                   				 
                   		    <div class="form-group col-md-6">
                                <label for="umidSoloMax">UmidSoloMax</label>
                                <input type="text" class="form-control" name="umidSoloMax" id="umidSoloMax" maxlength="20" placeholder="MAX" value="${planta.umidSoloMax }">
                            </div>
                            </div>
                            
                            <div class="row">
                            <div class="form-group col-md-6">
                                <label for="descricao">Comentários: </label> <br>
                   				 <textarea id="descricao" name="descricao" rows="3" cols="75" placeholder="Escreva um novo comentário aqui."></textarea>
                   			</div>
                   			</div>

                        <hr />
                        <div id="actions" class="row">
                            <div class="col-md-12">
                                <button type="submit" class="btn btn-primary" name="acao" value="Alterar">Salvar</button>
                                <a href="listar_plantas.do" class="btn btn-default">Cancelar</a>
                            </div>
                        </div>
                    </form>
                </div>
                <script src="js/jquery.min.js"></script>
                <script src="js/bootstrap.min.js"></script>
        </body>

        </html>