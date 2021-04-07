package com.pos.pioo.dispatcher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pos.pioo.factory.ConnectionDAO;
import com.pos.pioo.models.TipoAnimal;

public class DispatcherTipoAnimal extends ConnectionDAO implements IDispatcherTipoAnimal {

	public DispatcherTipoAnimal() throws SQLException, ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long Create(TipoAnimal model) throws SQLException {
		String sql = "INSERT INTO TipoAnimal(nome)" + " VALUES(?)";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, model.getNome());
		pstm.execute();
		long id = 0;
		ResultSet rs = pstm.getGeneratedKeys();
		if(rs.next())
			id = rs.getLong(1);
		pstm.close();
		con.close();
		return id;
	}

	@Override
	public void Update(TipoAnimal model) throws SQLException {
		String sql = "UPDATE TipoAnimal SET Nome = ? WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, model.getNome());
		pstm.setInt(2, model.getId());
		pstm.execute();
		pstm.close();
		con.close();
	}

	@Override
	public void Delete(int id) throws SQLException {
		String sql = "DELETE FROM TipoAnimal WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		pstm.execute();
		pstm.close();
		con.close();
	}

	@Override
	public TipoAnimal Read(int id) throws SQLException {
		String sql = "SELECT * FROM TipoAnimal WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		TipoAnimal tipoAnimal = null;
		if(rs.next()) {
			tipoAnimal = new TipoAnimal();
			tipoAnimal.setId(rs.getInt("id"));
			tipoAnimal.setNome(rs.getString("nome"));
		}
		return tipoAnimal;
	}

	@Override
	public List<TipoAnimal> ReadAll() throws SQLException {
		List<TipoAnimal> tipoAnimais = new ArrayList<TipoAnimal>();
		String sql = "SELECT * FROM TipoAnimal";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while(rs.next()) {
			TipoAnimal tipoAnimal = new TipoAnimal();
			tipoAnimal.setId(rs.getInt("Id"));
			tipoAnimal.setNome(rs.getString("nome"));
			tipoAnimais.add(tipoAnimal);
		}
		rs.close();
		pstm.close();
		con.close();
		return tipoAnimais;
	}

	
}
