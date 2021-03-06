package com.pos.pioo.web.command.navigation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoTipoAnimal;
import com.pos.pioo.infra.ConstantesOperacoes;
import com.pos.pioo.web.command.ICommand;
import com.pos.pioo.web.viewmodels.AnimalViewModel;

public class CriarAnimal implements ICommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			var requestDispatcher = request.getRequestDispatcher("/Animal/Form.jsp");
			AnimalViewModel animalViewModel = new AnimalViewModel();
			BoTipoAnimal boTipoAnimal = new BoTipoAnimal();
			var lista = boTipoAnimal.ListaTiposAnimais();
			animalViewModel.setTiposAnimais(lista);
			animalViewModel.setAction(ConstantesOperacoes.getCriacao());
			request.setAttribute("animalViewModel", animalViewModel);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
