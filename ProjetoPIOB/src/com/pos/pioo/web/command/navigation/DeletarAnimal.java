package com.pos.pioo.web.command.navigation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.dispatcher.DispatcherAnimal;
import com.pos.pioo.dispatcher.IDispatcherAnimal;
import com.pos.pioo.infra.ConstantesOperacoes;
import com.pos.pioo.models.AnimalViewModel;
import com.pos.pioo.web.adapter.AnimalAdapter;
import com.pos.pioo.web.command.Command;

public class DeletarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			String paramId = request.getParameter("id");
			var id = Integer.parseInt(paramId);
			var requestDispatcher = request.getRequestDispatcher("/Animal/Form.jsp");
			IDispatcherAnimal dispatcherAnimal = new DispatcherAnimal();
			var animal = dispatcherAnimal.Read(id);
			AnimalViewModel animalViewModel = AnimalAdapter.ConvertAnimalDspToViewModel(animal);
			animalViewModel.setAction(ConstantesOperacoes.Delete);
			request.setAttribute("animalViewModel", animalViewModel);
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
