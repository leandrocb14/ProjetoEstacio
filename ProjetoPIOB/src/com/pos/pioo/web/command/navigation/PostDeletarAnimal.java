package com.pos.pioo.web.command.navigation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoAnimal;
import com.pos.pioo.web.command.Command;

public class PostDeletarAnimal implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			Integer id =  Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			BoAnimal boAnimal = new BoAnimal();
			boAnimal.ExcluirAnimal(id);
			response.sendRedirect("/ProjetoPIOB/Controller?command=ListarAnimal");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
