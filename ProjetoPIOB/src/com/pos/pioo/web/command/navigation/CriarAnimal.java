package com.pos.pioo.web.command.navigation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.dispatcher.DispatcherTipoAnimal;
import com.pos.pioo.dispatcher.IDispatcherTipoAnimal;
import com.pos.pioo.infra.ConstantesOperacoes;
import com.pos.pioo.models.AnimalViewModel;
import com.pos.pioo.web.command.Command;

public class CriarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {

			var requestDispatcher = request.getRequestDispatcher("/Animal/Form.jsp");
			AnimalViewModel animalViewModel = new AnimalViewModel();
			IDispatcherTipoAnimal dispatcherTipoAnimal = new DispatcherTipoAnimal();
			var lista = dispatcherTipoAnimal.ReadAll();
			System.out.println(lista.size());
			animalViewModel.setTiposAnimais(lista);
			animalViewModel.setAction(ConstantesOperacoes.Criacao);
			request.setAttribute("animalViewModel", animalViewModel);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
