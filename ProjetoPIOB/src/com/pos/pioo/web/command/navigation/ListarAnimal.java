package com.pos.pioo.web.command.navigation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoAnimal;
import com.pos.pioo.web.adapter.AnimalAdapter;
import com.pos.pioo.web.command.ICommand;
import com.pos.pioo.web.viewmodels.ListarAnimalViewModel;

public class ListarAnimal implements ICommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			BoAnimal boAnimal = new BoAnimal();
			
			var animais = boAnimal.ListarTodosAnimais();
			ListarAnimalViewModel viewModel = AnimalAdapter.ConvertAnimaisDspToListarAnimalViewModel(animais);
			var requestDispatcher = request.getRequestDispatcher("/Animal/ListarAnimais.jsp");
			request.setAttribute("viewModel", viewModel);
			requestDispatcher.forward(request, response);
		} catch (SQLException | ServletException | IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
