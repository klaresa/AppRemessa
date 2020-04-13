<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="d" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App Remessa</title>
<link rel="stylesheet" type="text/css" href="/style.css"></head>
</head>
<body>
<div id="container">

	<div id="bubble">
	<h3>Adicionar Remessa</h3>
	<p><a href="/responsaveis">Para adicionar responsaveis</a></p>
	<p><a href="/suculentas">Para adicionar suculentas</a></p>
	<p><a href="/orquideas">Para adicionar orquideas</a></p>
	
			<form class="formulario" action="/remessa" method="post">
	
				<input  type="number" name="quantidadePlantas" placeholder="Quantidade de Plantas"></input>
				<input type="number" name="valorTotal" placeholder="Valor Total"></input>
				<input type="number" name="numeroParticipantes" placeholder="Numero de Participantes"></input>
				<div class="inline"><label for="venda"><input id="venda" type="checkbox" name="venda" >Venda?</input></label></div>
			
			<div class="inline">
			Responsavel pela remessa:
				<select name="${ responsaveis }">
				<c:forEach var="rem" items="${ responsaveis }">
					<option value="${ rem.nome }">${ rem.nome }</option>
				</c:forEach>
				</select>
			</div>
			
			<p>Adicionar plantas: </p>
			
			<div class="inline">
				<p><c:forEach var="rem" items="${ plantas }">
					<label><input type="checkbox" value="${ plantas }" name="${ plantas }"> ${ rem.categoria } - ${ rem.nome }</input></label>
				</c:forEach></p>
			</div>
			
				<input type="submit" value="Adicionar">

		</form>
	</div>


	
	<d:forEach var="rem" items="${ rems }">
		<div class="lista_b">
			<p>${ rem.valorTotal }</p>
			<p>${ rem.numeroParticipantes }<a href="/remessa/${rem.id}">remover</a></p>
		</div>
	</d:forEach>
		


	
	
</div>
</body>
</html>