<%@ page import="com.pos.pioo.web.viewmodels.AnimalViewModel"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.pos.pioo.infra.ConstantesOperacoes"%>

<%
AnimalViewModel animal = (AnimalViewModel) request.getAttribute("animalViewModel");
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Cadastro de animal</title>
</head>
<body>
	<div class="container">
		<h1 id="titulo-page">CADASTRAR ANIMAIS</h1>
		<form class="form-horizontal" id="formAnimal" method="post">
			<div id="container-id" class="form-group">
				<label class="col-sm-2 control-label">Id</label>
				<div class="col-sm-10">
					<input type="text" name="id" class="form-control input-style"
						id="idAnimal" placeholder="Id" value="<%=animal.getId()%>">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Classe</label>
				<div class="col-sm-10">
					<select class="form-select select-style" name="tipo" id="tipo">
						<%
						for (int i = 0; i < animal.getTiposAnimais().size(); i++) {
						%>
						<%
						if (animal.getTiposAnimais().get(i).getId() == animal.getTipo()) {
						%>
						<option value="<%=animal.getTiposAnimais().get(i).getId()%>"
							selected><%=animal.getTiposAnimais().get(i).getNome()%></option>
						<%
						} else {
						%>
						<option value="<%=animal.getTiposAnimais().get(i).getId()%>"><%=animal.getTiposAnimais().get(i).getNome()%></option>
						<%
						}
						%>
						<%
						}
						%>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Nome Comum</label>
				<div class="col-sm-10">
					<input type="text" class="form-control input-style" id="subTipo"
						placeholder="Digite o nome do animal..." name="subTipo"
						value="<%=animal.getSubTipo() != null && !animal.getSubTipo().isEmpty() ? animal.getSubTipo() : ""%>">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Tamanho</label>
				<div class="col-sm-10">
					<input type="text" class="form-control input-style" id="tamanho"
						placeholder="Digite o tamanho..." name="tamanho"
						value="<%=animal.getTamanho()%>">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10">
					<br> <input type="submit" value="Cadastrar" id="btnSumit"
						class="form-control input-style" /> <br>
						
				</div>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous">
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
		integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
		crossorigin="anonymous">
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
		integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
		crossorigin="anonymous">
	</script>
	<script type="text/javascript">
		var action = "<%=animal.getAction()%>";
		var constAction = {
				Create: '<%=ConstantesOperacoes.getCriacao()%>',
				Update: '<%=ConstantesOperacoes.getAlteracao()%>',
				Delete: '<%=ConstantesOperacoes.getDelete()%>'
		};
	</script>
	<script type="text/javascript"
		src="ScriptsGenerics/jquery-3.6.0.min.js"></script>
		<script type="text/javascript"
		src="ScriptsGenerics/jquery.mask.js"></script>
	<script type="text/javascript" src="Animal/Form.js"></script>
</body>

</html>