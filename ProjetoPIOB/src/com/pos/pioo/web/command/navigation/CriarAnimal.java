package com.pos.pioo.web.command.navigation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoTipoAnimal;
import com.pos.pioo.infra.ConstantesOperacoes;
import com.pos.pioo.web.command.Command;
import com.pos.pioo.web.viewmodels.AnimalViewModel;

public class CriarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			var requestDispatcher = request.getRequestDispatcher("/Animal/Form.jsp");
			AnimalViewModel animalViewModel = new AnimalViewModel();
			BoTipoAnimal boTipoAnimal = new BoTipoAnimal();
			var lista = boTipoAnimal.ListaTiposAnimais();
			animalViewModel.getAnimal().setTiposAnimais(lista);
			animalViewModel.setAction(ConstantesOperacoes.Criacao);
			request.setAttribute("animalViewModel", animalViewModel);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
