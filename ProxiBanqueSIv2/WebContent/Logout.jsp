<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logout</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/login.css">
<link href="css/justified-nav.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="text-muted">ProxiBanqueSIv2</h3>
			<nav>
			<ul class="nav nav-justified">
				<li><a href="index.html">Accueil</a></li>
				<li class="active"><a href="login.jsp">Se d�connecter</a></li>
				<li><a href="about.html">About us</a></li>
			</ul>
			</nav>
		</div>
	</div>
	<div class="container">
		<form class="form-signin" method="post" action="LogoutPage">
			<h2 class="form-signin-heading">Etes vous s�r de vouloir partir
				?</h2>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Se
				d�connecter</button>
		</form>
		<form class="form-signin">
			<a href="AccueilConseiller.jsp"><button
					class="btn btn-lg btn-primary btn-block" type="button">
					Annuler</button></a>
		</form>
	</div>
	<div class="footer">
		<p>
			&copy; Copyright AMM - Tous droits r�serv�s<br /> <a href="#">Nous
				contacter !</a>
		</p>
	</div>
</body>
</html>