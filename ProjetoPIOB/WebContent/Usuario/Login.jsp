<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="/ProjetoPIOB/Controller?command=PostLogin" method="post">
		<label>Email:</label>
		<input name="email" type="email"/>
		<label>Senha:</label>
		<input name="senha" type="password"/>
		<input type="submit" value="Entrar"/>
	</form>
</body>
</html>