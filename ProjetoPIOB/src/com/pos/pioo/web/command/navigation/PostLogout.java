package com.pos.pioo.web.command.navigation;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.infra.ConstantesSession;
import com.pos.pioo.web.command.ICommand;

public class PostLogout implements ICommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			System.out.println("logout");
			request.getSession().setAttribute(ConstantesSession.getUsuarioLogado(), null);
			response.sendRedirect("/ProjetoPIOB/Controller?command=Login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
