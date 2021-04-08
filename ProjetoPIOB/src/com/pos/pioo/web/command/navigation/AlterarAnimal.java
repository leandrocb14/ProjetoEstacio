package com.pos.pioo.web.command.navigation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoAnimal;
import com.pos.pioo.bll.BoTipoAnimal;
import com.pos.pioo.dispatcher.DispatcherAnimal;
import com.pos.pioo.dispatcher.IDispatcherAnimal;
import com.pos.pioo.infra.ConstantesOperacoes;
import com.pos.pioo.web.adapter.AnimalAdapter;
import com.pos.pioo.web.command.Command;
import com.pos.pioo.web.viewmodels.AnimalViewModel;

public class AlterarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			String paramId = request.getParameter("id");
			var id = Integer.parseInt(paramId);
			var requestDispatcher = request.getRequestDispatcher("/Animal/Form.jsp");
			BoAnimal boAnimal = new BoAnimal();
			var animal = boAnimal.BuscarAnimal(id);
			AnimalViewModel animalViewModel = AnimalAdapter.ConvertAnimalDspToViewModel(animal);
			BoTipoAnimal boTipoAnimal = new BoTipoAnimal();
			var lista = boTipoAnimal.ListaTiposAnimais();
			animalViewModel.setTiposAnimais(lista);
			animalViewModel.setAction(ConstantesOperacoes.getAlteracao());
			request.setAttribute("animalViewModel", animalViewModel);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
