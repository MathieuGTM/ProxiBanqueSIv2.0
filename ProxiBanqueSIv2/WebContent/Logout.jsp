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
				<li><a href="AccueilConseiller.jsp">Accueil</a></li>
				<li class="active"><a href="Logout.jsp">Se déconnecter</a></li>
				<li><a href="#">About us</a></li>
			</ul>
			</nav>
		</div>
	</div>
	<div class="container">
		<form class="form-signin" method="post" action="LogoutPage">
			<h2 class="form-signin-heading">Etes vous sûr de vouloir partir
				?</h2>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Se
				déconnecter</button>
		</form>
		<div class="row">
			<div
				class="col-xs-12 col-sm-6 col-sm-offset-3 col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3">
				<nav>
				<ul class="nav nav-justified">
					<li><a href="AccueilConseiller.jsp">Annuler</a></li>
				</ul>
				</nav>
			</div>
		</div>
	</div>
	<div class="footer">
		<p>
			&copy; Copyright AMM - Tous droits réservés<br /> <a href="#">Nous
				contacter !</a>
		</p>
	</div>
</body>
</html>