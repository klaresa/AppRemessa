<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Detalhe: Cadastro do responsavel</title>
</head>
<body>

<div class=container>
<font color="red">${msg}</font>
	
<form action="/responsavel" method="post">
  <div class="form-group">
    <label for="nome">Nome</label>
    <input type="text" class="form-control" id="nome" name="nome">
  </div>
  
  <div class="form-group">
    <label for="celular">Celular</label>
    <input type="text" class="form-control" id="celular" name="celular">
  </div>
  
    <div class="form-group">
    <label for="email">Email</label>
    <input type="text" class="form-control" id="email" name="email">
  </div>

  <input type="submit" class="btn btn-primary" value="Cadastrar">
</form>
</div>
</body>
</html>