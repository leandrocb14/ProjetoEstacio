package com.pos.pioo.web.command.navigation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.web.command.Command;

public class Login implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			var requestDispatcher = request.getRequestDispatcher("/Usuario/Login.jsp");
			requestDispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
