<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil conseiller</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/styleIndex.css">
<link href="css/justified-nav.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="text-muted">ProxiBanqueSIv2</h3>
			<nav>
			<ul class="nav nav-justified">
				<li class="active"><a href="AccueilConseiller.jsp">Accueil</a></li>
				<li><a href="Logout.jsp">Se déconnecter</a></li>
				<li><a href="about.html">About us</a></li>
			</ul>
			</nav>
		</div>
	</div>
	<div class="container">
		<div class="jumbotron">
			<div class="row">
				<div
					class="col-xs-12 col-sm-6 col-sm-offset-3 col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3">
					<h3>Bienvenue sur ProxiBanque ${conseiller.login}</h3>
				</div>
			</div>
			<div class="row">
				<div
					class="col-xs-12 col-sm-6 col-sm-offset-3 col-md-6 col-md-offset-3 col-lg-6 col-lg-offset-3">
					<h4>
						Nous sommes le
						<%=new Date()%></h4>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<p>Choisissez un client dans la liste déroulante et cliquez
						ensuite sur l'action à effectuer</p>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-3 col-lg-3">
					<select name="client">
						<c:forEach var="client" items="${listClient}">
							<option value="${client.idClient}">${client.idClient}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-xs-12 col-sm-12 col-md-9 col-lg-9">
					<nav>
					<ul class="nav nav-justified">
						<li><a href="Modifier.jsp">Editer client</a></li>
						<li><a href="ListComptes.jsp">Lister comptes client</a></li>
						<li><a href="Virement.jsp">Effectuer un virement</a></li>
					</ul>
					</nav>
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-3 col-lg-3">
					<nav>
					<ul class="nav nav-justified">
						<li><a href="NewClient.jsp">Créer un nouveau client</a></li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
</body>
</html>