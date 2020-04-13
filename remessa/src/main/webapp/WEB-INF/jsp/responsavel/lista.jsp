<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Lista: Responsaveis</title>
</head>
<body>

	<div class="container">
		<h3>Listagem de responsaveis:</h3>
		<div class="container">
			<c:forEach var="responsavel" items="${responsavelLista}">
				<h5>${responsavel.nome} (${responsavel.celular})
					<p>${responsavel.email}
					<a href="/responsavel/excluir/${responsavel.id}"> excluir</a></p>
				</h5>
			</c:forEach>
		</div>
		<a href="/responsavel"><input type="submit" class="btn btn-primary" value="Voltar"></a>
	</div>
</body>
</html>