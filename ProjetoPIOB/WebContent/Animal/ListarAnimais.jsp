<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.pos.pioo.web.viewmodels.ListarAnimalViewModel"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

<%
ListarAnimalViewModel viewModel = (ListarAnimalViewModel) request.getAttribute("viewModel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de animais</title>
</head>
<body>
	<h1>Lista de animais</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Tipo</th>
			<th>Subtipo</th>
			<th>Tamanho</th>
		</tr>
		<%
		for (int i = 0; i < viewModel.getAnimais().size(); i++) {
		%>
		<tr>
			<th><%=viewModel.getAnimais().get(i).getId()%></th>
			<th><%=viewModel.getAnimais().get(i).getTipo()%></th>
			<th><%=viewModel.getAnimais().get(i).getSubTipo()%></th>
			<th><%=viewModel.getAnimais().get(i).getTamanho()%></th>
			<th><a href="/ProjetoPIOB/Controller?command=AlterarAnimal&id=<%=viewModel.getAnimais().get(i).getId()%>">Alterar</a></th>
			<th><a href="/ProjetoPIOB/Controller?command=DeletarAnimal&id=<%=viewModel.getAnimais().get(i).getId()%>">Deletar</a></th>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>