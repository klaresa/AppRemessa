<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App Remessa - Orquidea</title>
<link rel="stylesheet" type="text/css" href="/style.css"></head>
<body>
<div id="container">
	<div id="bubble">
	<h3>Adicionar orquideas</h3>

	<div>
		<form class="formulario" action="/orquidea" method="post">
			<label for="nome" >
				<input id="nome" name="nome" placeholder="Nome"></input>
			</label>
			
			<label for="categoria">
				<input id="categoria" name="categoria" placeholder="Categoria"></input>
			</label>
			
			<label for="descricao" >
				<input id="descricao" name="descricao" placeholder="descricao"></input>
			</label>
			
			
			<div class="inline"><label><input type="checkbox" name="epifita"/> Epifita?</label></div>
			
			
			<label for="ambiente">
				<input id="ambiente" name="ambiente" placeholder="ambiente"></input>
			</label>
			<input type="submit" value="Adicionar">
		</form>
	</div>
	
	<h3>Orquideas</h3>
	
		<c:forEach var="rem" items="${ orquideas }">
			<div class="lista_b">
				${ rem.nome }
				<p>${ rem.categoria }<a href="/orquidea/${rem.id}">remover</a></p>
				<p>Detalhe: ${ rem.descricao }</p>
				
				Desenvolvimento: <c:choose>
				    <c:when test="${rem.epifita==true}">
				        Epifita
				    </c:when>    
				    <c:otherwise>
				        Nao epifita 
				    </c:otherwise>
				</c:choose>
			</div>
		</c:forEach>
		<p><a href="/remessas">voltar</a></p>
	
	</div>
</div>
</body>
</html>