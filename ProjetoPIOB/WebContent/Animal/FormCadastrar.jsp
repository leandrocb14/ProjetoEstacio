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
	<h1>CADASTRAR ANIMAIS</h1>
		<form class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">Id</label>
				<div class="col-sm-10">
					<input type="text" class="form-control input-style" id="id" placeholder="Id">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Tipo</label>
				<div class="col-sm-10">
					<input type="text" class="form-control input-style" id="Tipo" placeholder="Mamífero">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">subTipo</label>
				<div class="col-sm-10">
					<input type="text" class="form-control input-style" id="subTipo" placeholder="Cachorro">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Tamanho</label>
				<div class="col-sm-10">
					<input type="text" class="form-control input-style" id="Tamanho" placeholder="Tamanho">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">Alimentacoes (Separados por ;)</label>
				<div class="col-sm-10">
					<input type="text" class="form-control input-style" id="Alimentacoes" placeholder="Alimentacoes">
				</div>
			</div>
		</form>
		<br>
		<button type="button" class="btn btn-outline-primary">Cadastrar</button>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
		integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
		integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
		crossorigin="anonymous"></script>
</body>

</html>