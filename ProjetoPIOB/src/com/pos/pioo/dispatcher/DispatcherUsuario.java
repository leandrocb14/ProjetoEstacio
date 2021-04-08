package com.pos.pioo.dispatcher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.pos.pioo.factory.ConnectionDAO;
import com.pos.pioo.models.Animal;
import com.pos.pioo.models.TipoAnimal;
import com.pos.pioo.models.Usuario;

public class DispatcherUsuario extends ConnectionDAO implements IDispatcherUsuario {

	public DispatcherUsuario() throws SQLException, ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long Create(Usuario model) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Usuario(email,senha)" + " VALUES(?,?)";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		pstm.setString(1, model.getEmail());
		pstm.setString(2, model.getSenha());
		pstm.execute();
		long id = 0;
		ResultSet rs = pstm.getGeneratedKeys();
		if (rs.next())
			id = rs.getLong(1);
		pstm.close();
		con.close();
		return id;
	}

	@Override
	public void Update(Usuario model) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE Usuario SET email = ?, senha = ? WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, model.getEmail());
		pstm.setString(2, model.getSenha());
		pstm.setInt(3, model.getId());
		pstm.execute();
		pstm.close();
		con.close();
	}

	@Override
	public void Delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Usuario WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		pstm.execute();
		pstm.close();
		con.close();
	}

	@Override
	public Usuario Read(int id) throws SQLException {
		String sql = "SELECT * FROM Usuario WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Usuario usuario = null;
		if (rs.next()) {
			usuario = new Usuario();
			usuario.setId(rs.getInt("id"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
		}
		return usuario;
	}

	@Override
	public List<Usuario> ReadAll() throws SQLException {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "SELECT * FROM Usuario";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			Usuario usuario = new Usuario();
			usuario.setId(rs.getInt("Id"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
			usuarios.add(usuario);
		}
		rs.close();
		pstm.close();
		con.close();
		return usuarios;
	}

	@Override
	public Usuario obterInformacoesUsuario(Usuario usuario) throws SQLException {
		String sql = "SELECT * FROM usuario WHERE email = ? and senha = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, usuario.getEmail());
		pstm.setString(2, usuario.getSenha());
		ResultSet rs = pstm.executeQuery();
		Usuario model = null;
		if (rs.next()) {
			model = new Usuario();
			model.setId(rs.getInt("id"));
			model.setEmail(rs.getString("email"));
			model.setSenha(rs.getString("senha"));
		}
		return model;
	}

}
