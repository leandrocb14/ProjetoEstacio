package com.pos.pioo.dispatcher;

import java.sql.SQLException;

import com.pos.pioo.models.Usuario;

public interface IDispatcherUsuario extends IBasicCrud<Usuario>{
	Usuario obterInformacoesUsuario(Usuario usuario) throws SQLException;
}
