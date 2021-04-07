package com.pos.pioo.web.command.navigation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoAnimal;
import com.pos.pioo.web.command.Command;

public class ListarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			BoAnimal boAnimal = new BoAnimal();
			var animais = boAnimal.ListarTodosAnimais();
			var requestDispatcher = request.getRequestDispatcher("/Animal/ListarAnimais.jsp");
			request.setAttribute("animais", animais);
			requestDispatcher.forward(request, response);
		} catch (SQLException | ServletException | IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
