package com.pos.pioo.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pos.pioo.infra.ConstantesActions;
import com.pos.pioo.infra.ConstantesSession;
import com.pos.pioo.web.command.ICommand;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			var stringCommand = request.getParameter("command");
			var usuarioEstaLogado = request.getSession().getAttribute(ConstantesSession.getUsuarioLogado()) != null;
			var commandFiltrado = TratarFiltroCommand(stringCommand, usuarioEstaLogado);
			if (!stringCommand.equals(commandFiltrado)) {
				if (usuarioEstaLogado)
					response.sendRedirect("/ProjetoPIOB/Controller?command=ListarAnimal");
				else
					response.sendRedirect("/ProjetoPIOB/Controller?command=Login");

			} else {
				ICommand comando = (ICommand) Class.forName("com.pos.pioo.web.command.navigation." + commandFiltrado)
						.newInstance();
				comando.execute(request, response);
			}

		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	private String TratarFiltroCommand(String pCommand, boolean usuarioAutenticado) {
		var isAnonymous = CommandAllowAnonymous(pCommand);
		if (!isAnonymous && !usuarioAutenticado)
			return ConstantesActions.getCommandLogin();
		else if (isAnonymous && usuarioAutenticado)
			return ConstantesActions.getCommandListarAnimal();

		return pCommand;
	}

	private boolean CommandAllowAnonymous(String pCommand) {
		boolean isAnonymous = false;
		for (String nameCommandAnonymous : ListCommandAllowAnonymous()) {
			if (pCommand.equals(nameCommandAnonymous)) {
				isAnonymous = true;
				break;
			}
		}
		return isAnonymous;
	}

	private List<String> ListCommandAllowAnonymous() {
		List<String> listaCommands = new ArrayList<String>();
		listaCommands.add(ConstantesActions.getCommandLogin());
		listaCommands.add(ConstantesActions.getCommandPostLogin());
		return listaCommands;
	}

}
