package com.pos.pioo.web.command.navigation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.web.command.Command;

public class CriarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			var requestDispatcher = request.getRequestDispatcher("/Animal/FormCadastrar.jsp");
			requestDispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
