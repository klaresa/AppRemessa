<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App Remessa - Suculentas</title>
<link rel="stylesheet" type="text/css" href="/style.css"></head>
<body>
<div id="container">
	<div id="bubble">
	<h3>Adicionar suculentas</h3>
	<div>
		<form class="formulario" action="/suculenta" method="post">
			<input id="nome" name="nome" placeholder="Nome"></input>
			<input id="categoria" name="categoria" placeholder="Categoria"></input>
			<input id="descricao" name="descricao" placeholder="Descricao"></input>
			<div class="inline"><label><input type="checkbox" name="matriz"/> Matriz?</label></div>
			<input id="raridade" name="raridade" placeholder="Raridade"></input>
			<input type="submit" value="Adicionar">
		</form>
	</div>
	
	<h3>Suculentas</h3>
	
		<c:forEach var="rem" items="${ suculentas }">
			<div class="lista_b">
				${ rem.nome }
				<p>${ rem.categoria }<a href="/suculenta/${rem.id}">remover</a></p>
				<p>Detalhe: ${ rem.descricao }</p>
				
				Desenvolvimento: <c:choose>
				    <c:when test="${rem.matriz==true}">
				        Matriz
				    </c:when>    
				    <c:otherwise>
				        Muda 
				    </c:otherwise>
				</c:choose>
			</div>
		</c:forEach>
			<p><a href="/remessas">voltar</a></p>
	</div>
</div>
</body>
</html>