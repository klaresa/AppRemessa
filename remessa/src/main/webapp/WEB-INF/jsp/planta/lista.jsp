<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mvc: lista da plantas</title>
</head>
<body>
	<div class="container">
		<h3>Listagem de plantas:</h3>
		<div class="container">
			<c:forEach var="planta" items="${plantaLista}">
				<h5>Nome: ${planta.nome} - Categoria: ${planta.categoria}
					<p>Descricao: ${planta.descricao}
					<a href="/planta/excluir/${planta.id}"> excluir</a></p>
				</h5>
			</c:forEach>
		</div>
		<a href="/planta"><input type="submit" class="btn btn-primary" value="Voltar"></a>
	</div>
</body>
</html>
</body>
</html>