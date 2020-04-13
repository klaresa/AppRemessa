<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App Remessa - Responsaveis</title>
<link rel="stylesheet" type="text/css" href="/style.css"></head>
<body>
<div id="container">

	<div id="bubble">
		<h3>Cadastrar</h3>
	
		<form class="formulario" action="/responsavel" method="post">
			<label for="nome" >
				<input id="nome" name="nome" placeholder="Nome" />
			</label>
			
			<label for="email" >
				<input id="email" name="email" placeholder="Email" />
			</label>
			
			<label for="celular">
				<input id="celular" name="celular" placeholder="Celular" />
			</label>
		
			<input type="submit" value="Adicionar">
		</form>
	</div>
	
	<div id="bubble">
		<h3>Responsaveis</h3>
			<c:forEach var="rem" items="${ responsaveis }">
				<div class="lista_b">
					<p>${ rem.nome }</p>
					<p>${ rem.email }<a href="/responsavel/${rem.id}">remover</a></p>
					<p>tel: ${ rem.celular }</p>
				</div>
			</c:forEach>
	</div>
			<p><a href="/remessas">voltar</a></p>
	
</div>
</body>
</html>