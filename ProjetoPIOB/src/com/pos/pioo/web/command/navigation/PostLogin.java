package com.pos.pioo.web.command.navigation;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.bll.BoUsuario;
import com.pos.pioo.infra.ConstantesSession;
import com.pos.pioo.models.Usuario;
import com.pos.pioo.web.adapter.UsuarioAdapter;
import com.pos.pioo.web.command.ICommand;
import com.pos.pioo.web.viewmodels.LoginViewModel;

public class PostLogin implements ICommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			LoginViewModel viewModel = new LoginViewModel();
			viewModel.setEmail(request.getParameter("email"));
			viewModel.setSenha(request.getParameter("senha"));
			Usuario model = UsuarioAdapter.ConvertLoginViewModelToUsuarioDsp(viewModel);
			BoUsuario boUsuario = new BoUsuario();
			Usuario usuario = boUsuario.ObterUsuario(model);
			if (usuario != null) {
				request.getSession().setAttribute(ConstantesSession.getUsuarioLogado(), usuario);
				response.sendRedirect("/ProjetoPIOB/Controller?command=ListarAnimal");
			} else {
				response.sendRedirect("/ProjetoPIOB/Controller?command=Login");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
