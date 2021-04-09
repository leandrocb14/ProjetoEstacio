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
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link href="Style/style.css" rel="stylesheet" type="text/css" />
<title>Lista de animais</title>
</head>
<body>
	<h1>Lista de animais</h1>
	<table>
		<tr>
			<th>Id</th>
			<th>Classe</th>
			<th>Nome Comum</th>
			<th>Tamanho</th>
			<th>Alterar</th>
			<th>Deletar</th>
		</tr>
		<%
		for (int i = 0; i < viewModel.getAnimais().size(); i++) {
		%>
		<tr>
			<th><%=viewModel.getAnimais().get(i).getId()%></th>
			<th><%=viewModel.getAnimais().get(i).getTipo()%></th>
			<th><%=viewModel.getAnimais().get(i).getSubTipo()%></th>
			<th><%=viewModel.getAnimais().get(i).getTamanho()%></th>
			<th><a
				href="/ProjetoPIOB/Controller?command=AlterarAnimal&id=<%=viewModel.getAnimais().get(i).getId()%>">Alterar</a></th>
			<th><a
				href="/ProjetoPIOB/Controller?command=DeletarAnimal&id=<%=viewModel.getAnimais().get(i).getId()%>">Deletar</a></th>
		</tr>
		<%
		}
		%>
	</table>
	
	<br>
	<div class="container">
		<form class="form-horizontal" action="/ProjetoPIOB/Controller?command=CriarAnimal" method="post">
			<div class="form-group">
				<div class="col-sm-10">
					<input type="submit" class="form-control input-style" value="Criar Animal">
				</div>
			</div>
		</form>
	</div>
	
</body>
</html>