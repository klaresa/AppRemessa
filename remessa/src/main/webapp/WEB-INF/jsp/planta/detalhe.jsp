<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Detalhe: Cadastro de Plantas</title>
</head>
<body>

<div id="myDiv" onclick="clicke()">
  	<form action="/suculenta" method="post">
		<div class="form-group">
		    <label for="nome">Nome</label>
		    <input type="text" class="form-control" id="nome" name="nome">
	  	</div>
	  
	    <div class="form-group">
		    <label for="categoria">Categoria</label>
		    <input type="text" class="form-control" id="categoria" name="categoria">
	  	</div>
	  
	    <div class="form-group">
		    <label for="descricao">Descricao</label>
		    <input type="text" class="form-control" id="descricao" name="descricao">
	  	</div>
	  	
	    <div class="form-group">
		    <label for="raridade">Raridade</label>
		    <input type="text" class="form-control" id="raridade" name="raridade">
	  	</div>
	  	
	  	<div class="form-group">
		    <label for="matriz">Matriz</label>
		    <input type="checkbox" class="form-control" id="matriz" name="matriz">
	  	</div>
	  	
		<input type="submit" class="btn btn-primary" value="Cadastrar">
	</form>
</div>
<div>
  	<form action="/orquidea" method="post">
		<div class="form-group">
		    <label for="nome">Nome</label>
		    <input type="text" class="form-control" id="nome" name="nome">
	  	</div>
	  
	    <div class="form-group">
		    <label for="categoria">Categoria</label>
		    <input type="text" class="form-control" id="categoria" name="categoria">
	  	</div>
	  
	    <div class="form-group">
		    <label for="descricao">Descricao</label>
		    <input type="text" class="form-control" id="descricao" name="descricao">
	  	</div>
	  	
	    <div class="form-group">
		    <label for="ambiente">ambiente</label>
		    <input type="text" class="form-control" id="ambiente" name="ambiente">
	  	</div>
	  	
	  	<div class="form-group">
		    <label for="epifita">epifita</label>
		    <input type="checkbox" class="form-control" id="epifita" name="epifita">
	  	</div>
	  	
		<input type="submit" class="btn btn-primary" value="Cadastrar">
	</form>
</div>	

</body>
</html>