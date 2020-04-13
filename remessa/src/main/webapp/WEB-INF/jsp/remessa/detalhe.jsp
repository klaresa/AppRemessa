<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Detalhe: Cadastro de Remessa</title>
</head>
<body>

<div class="container">
<font color="red">${msg}</font>
	
<form action="/remessa" method="post">
	
	<div class="form-group">
	    <label for="nome">Nome</label>
	    <input type="text" class="form-control" id="responsavel.nome" name="responsavel.nome">
  	</div>
  
    <div class="form-group">
	    <label for="celular">Celular</label>
	    <input type="text" class="form-control" id="responsavel.celular" name="responsavel.celular">
  	</div>
  
    <div class="form-group">
	    <label for="email">Email</label>
	    <input type="text" class="form-control" id="responsavel.email" name="responsavel.email">
  	</div>

<div>

	<div class="form-group">
	    <label for="nome">Nome</label>
	    <input type="text" class="form-control" id="suculenta.nome" name="nome">
  	</div>
    <div class="form-group">
	    <label for="categoria">Categoria</label>
	    <input type="text" class="form-control" id="suculenta.categoria" name="categoria">
  	</div>
    <div class="form-group">
	    <label for="descricao">Descricao</label>
	    <input type="text" class="form-control" id="suculenta.descricao" name="descricao">
  	</div>
  	    <div class="form-group">
	    <label for="raridade">raridade</label>
	    <input type="text" class="form-control" id="suculenta.raridade" name="raridade">
  	</div>
    <div class="form-group">
	    <label for="matriz">matriz</label>
	    <input type="checkbox" class="form-control" id="suculenta.matriz" name="matriz">
  	</div>

</div>

<div>
    <div class="form-group">
	    <label for="venda">Venda</label>
	    <input type="checkbox" class="form-control" id="venda" name="venda">
  	</div>
	
	<div class="form-group">
	  <label for="qtd">Quantidade</label>
	  <input type="number" class="form-control" id="quantidadePlantas" name="quantidadePlantas">
	</div>
	
	<div class="form-group">
	  <label for="participantes">Participantes</label>
	  <input type="number" class="form-control" id="numeroParticipantes" name="numeroParticipantes">
	</div>
	
	<div class="form-group">
	  <label for="valor">Valor total</label>
	  <input type="number" class="form-control" id="valorTotal" name="valorTotal">
	</div>
</div>
	<input type="submit" class="btn btn-primary" value="Cadastrar">
</form>

</div>
</body>
</html>