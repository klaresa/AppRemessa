<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </head>
<body>
<div class="container">

	<div>
		Olá, ${user}!!!
	</div>
	
	<ul class="nav nav-tabs" id="myTab" role="tablist">
	  <li class="nav-item">
	    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Responsavel</a>
	  </li>
	  <li class="nav-item">
	    <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Plantas</a>
	  </li>
	  <li class="nav-item">
	    <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Remessa</a>
	  </li>
	</ul>
	
	<div class="tab-content" id="myTabContent">
	  <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
	  		<h4><a href="/responsaveis">Listagem de responsaveis</a></h4> 
			<h4><a href="/responsavel">Cadastro de responsaveis</a></h4>
			
			<a href="responsavel/detalhe.jsp"></a>
	  </div>
	  
	  
	  <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
	  	<h4><a href="/plantas">lista de plantas</a></h4>
		<h4><a href="/planta">cadastro de planta</a></h4>
	  </div>
	  
	  
	  <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
  		<h4><a href="/remessas">lista de remessas</a></h4>
		<h4><a href="/remessa">cadastro remessa</a></h4>
	  </div>
	</div>
	
</div>
</body>
</html>