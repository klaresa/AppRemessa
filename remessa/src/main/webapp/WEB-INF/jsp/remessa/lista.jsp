<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista: Responsaveis</title>
</head>
<body>

	<div class="container">
		<h3>Listagem de remessas:</h3>
		<div class="container">
			<c:forEach var="remessa" items="${remessaLista}">
				<h5>Valor total: ${remessa.valorTotal} - Participantes: ${remessa.numeroParticipantes}
					<p>Numero de plantas: ${remessa.quantidadePlantas}
					<a href="/remessa/excluir/${remessa.id}"> excluir</a></p>
				</h5>
			</c:forEach>
		</div>
		<a href="/remessa"><input type="submit" class="btn btn-primary" value="Voltar"></a>
	</div>
</body>
</html>


