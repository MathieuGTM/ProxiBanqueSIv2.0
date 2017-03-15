<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modification client</title>
</head>
<body>
<h1> Modifier les champs souhaités du client ${client.nom} :</h1>
		<form method="post" action="ModifClient">
			<fieldset>
				<input type="hidden" name="idcli" value="${client.idClient}">
				Nom : <input type = "text" name="nom"  "/> <br/>
				Prenom : <input type = "text" name="prenom" /> <br/>
				Email: <input type = "email" name="email" /> <br/>
				Adresse : <input type = "text" name="adresse"/> <br/>
				Ville : <input type = "text" name="ville" /> <br/>
				Code Postal : <input type = "text" name="codepostal" /> <br/>
				<br/>
				<input type="submit" value="Modifier"/>
				
		
			</fieldset>
		</form>
</body>
</html>