<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
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
				<li class="active"><a href="Login.jsp">Se connecter</a></li>
				<li><a href="#">About us</a></li>
			</ul>
			</nav>
		</div>
	</div>
	<div class="container">
		<form class="form-signin" method="post" action="LoginPage">
			<h2 class="form-signin-heading">Veuillez entrer vos identifiants</h2>
			<label class="sr-only" for="pseudoConseiller">Pseudo
				Conseiller</label> <input id="pseudoConseiller" name="login"
				class="form-control" placeholder="Votre pseudo" required=""
				autofocus="" type="text"> <label class="sr-only"
				for="mdpConseiller">Mot de passe</label> <input id="mdpConseiller"
				name="pwd" class="form-control" placeholder="Mot de passe"
				required="" autofocus="" type="password">
			<button class="btn btn-lg btn-primary btn-block" type="submit">Se
				connecter</button>
		</form>
	</div>
	<div class="footer">
		<p>
			&copy; Copyright AMM - Tous droits réservés<br /> <a href="#">Nous
				contacter !</a>
		</p>
	</div>

</body>
</html>