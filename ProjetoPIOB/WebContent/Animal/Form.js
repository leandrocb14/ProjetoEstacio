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
	$('#btnSumit').attr('value', 'Cadastrar')
	$('#titulo-page').text('CADASTRAR ANIMAL');
	$('#formAnimal').attr('action', '/ProjetoPIOB/Controller?command=PostCriarAnimal');
}

function CarregaEventosUpdate() {
	$('#idAnimal').attr('readonly', 'true');
	$('#btnSumit').attr('value', 'Alterar');
	$('#titulo-page').text('ALTERAR ANIMAL');
	$('#formAnimal').attr('action', '/ProjetoPIOB/Controller?command=PostAlterarAnimal');
}

function CarregaEventosDelete() {
	$('#idAnimal').attr('readonly', 'true');
	$('#tipo').attr('disabled', 'true');
	$('#subTipo').attr('disabled', 'true');
	$('#tamanho').attr('disabled', 'true');
	$('#alimentacoes').attr('disabled', 'true');
	$('#btnSumit').attr('value', 'Deletar');
	$('#titulo-page').text('DELETAR ANIMAL');
	$('#formAnimal').attr('action', '/ProjetoPIOB/Controller?command=PostDeletarAnimal');
}