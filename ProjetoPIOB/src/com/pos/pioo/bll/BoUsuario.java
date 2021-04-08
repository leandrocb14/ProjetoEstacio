package com.pos.pioo.bll;

import java.sql.SQLException;

import com.pos.pioo.dispatcher.DispatcherUsuario;
import com.pos.pioo.dispatcher.IDispatcherUsuario;
import com.pos.pioo.models.Usuario;

public class BoUsuario {
	private IDispatcherUsuario dspUsuario;
	public BoUsuario() throws ClassNotFoundException, SQLException {
		dspUsuario = new DispatcherUsuario();
	}
	
	public Usuario ObterUsuario(Usuario pUsuario) throws SQLException {
		return dspUsuario.obterInformacoesUsuario(pUsuario);
	}
}
