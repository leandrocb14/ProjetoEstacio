$(document).ready(function() {
	CarregaEventos();
});

function CarregaEventos() {
	if (action == constAction.Create)
		CarregaEventosCreate();
	else if (action == constAction.Update)
		CarregaEventosUpdate();
	else if (action == constAction.Delete)
		CarregaEventosDelete();
}

function CarregaEventosCreate() {
	$('#container-id').hide();
	$('#btn-submit').text('Cadastrar')
	$('#titulo-page').text('CADASTRAR ANIMAL');
}

function CarregaEventosUpdate() {
	$('#id').attr('disabled', 'true');
	$('#btn-submit').text('Alterar');
	$('#titulo-page').text('ALTERAR ANIMAL');
}

function CarregaEventosDelete() {
	$('#id').attr('disabled', 'true');
	$('#Tipo').attr('disabled', 'true');
	$('#SubTipo').attr('disabled', 'true');
	$('#Tamanho').attr('disabled', 'true');
	$('#Alimentacoes').attr('disabled', 'true');
	$('#btn-submit').text('Deletar');
	$('#titulo-page').text('DELETAR ANIMAL');
}