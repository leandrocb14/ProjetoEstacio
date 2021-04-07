package com.pos.pioo.web.command.navigation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoAnimal;
import com.pos.pioo.web.adapter.AnimalAdapter;
import com.pos.pioo.web.command.Command;
import com.pos.pioo.web.viewmodels.AnimalViewModel;

public class PostAlterarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			var animalViewModel = new AnimalViewModel();
			animalViewModel.setId(Integer.parseInt(request.getParameter("id")));
			animalViewModel.setTipo(Integer.parseInt(request.getParameter("tipo")));
			animalViewModel.setTamanho(Double.parseDouble(request.getParameter("tamanho")));
			animalViewModel.setSubTipo(request.getParameter("subTipo"));
			animalViewModel.setNomeAlimentacoes(request.getParameter("alimentacoes"));
			var animal = AnimalAdapter.ConvertAnimalViewModelToAnimalDsp(animalViewModel);
			BoAnimal boPedido = new BoAnimal();
			boPedido.AlterarAnimal(animal);
			response.sendRedirect("/ProjetoPIOB/Controller?command=ListarAnimal");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
