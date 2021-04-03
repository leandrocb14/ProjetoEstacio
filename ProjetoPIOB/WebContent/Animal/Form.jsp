<%@ page import="com.pos.pioo.models.AnimalViewModel"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pos.pioo.infra.ConstantesOperacoes"%>

<%
	AnimalViewModel animal = (AnimalViewModel) request.getAttribute("animalViewModel");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Cadastro de animal</title>
</head>
<body>
	<script type="text/javascript">
		var action = "<%=animal.getAction()%>"
		var constAction = {
				Create: '<%=ConstantesOperacoes.Criacao%>',
				Update: '<%=ConstantesOperacoes.Alteracao%>',
				Delete: '<%=ConstantesOperacoes.Delete%>'
		};
	</script>
	<script type="text/javascript" src="ScriptsGenerics/jquery-3.6.0.min.js"></script>
	<script type="text/javascript" src="Animal/Form.js"></script>
</body>
</html>