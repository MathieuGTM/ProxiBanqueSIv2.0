<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Créer un compte client</title>
</head>
	<body>
		<h1> Créer un nouveau compte client :</h1>
		<form method="post" action="NouveauClient">
			<fieldset>
				
				Nom : <input type = "text" name="nom"  required="required"/> <br/>
				Prenom : <input type = "text" name="prenom" required="required"/> <br/>
				Email: <input type = "email" name="email" required="required"/> <br/>
				Adresse : <input type = "text" name="adress" required="required"/> <br/>
				Ville : <input type = "text" name="ville" required="required"/> <br/>
				Code Postal : <input type = "text" name="codepostal" required="required"/> <br/>
				<br/>
				<input type="submit" value="Créer"/>
				
		
			</fieldset>
		</form>



	</body>
</html>