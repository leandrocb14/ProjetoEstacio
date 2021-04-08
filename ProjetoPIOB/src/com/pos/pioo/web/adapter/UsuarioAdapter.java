package com.pos.pioo.web.adapter;

import com.pos.pioo.models.Usuario;
import com.pos.pioo.web.viewmodels.LoginViewModel;

public class UsuarioAdapter {
	public static Usuario ConvertLoginViewModelToUsuarioDsp(LoginViewModel viewModel) {
		Usuario usuario = null;
		if(viewModel != null) {
			usuario = new Usuario();
			usuario.setEmail(viewModel.getEmail());
			usuario.setSenha(viewModel.getSenha());
		}
		return usuario;
	}
}
