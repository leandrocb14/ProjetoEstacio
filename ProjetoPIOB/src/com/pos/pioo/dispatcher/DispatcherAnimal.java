package com.pos.pioo.dispatcher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pos.pioo.factory.ConnectionDAO;
import com.pos.pioo.models.Animal;
import com.pos.pioo.models.TipoAnimal;

public class DispatcherAnimal extends ConnectionDAO implements IDispatcherAnimal {

	public DispatcherAnimal() throws SQLException, ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public long Create(Animal model) throws SQLException {
		String sql = "INSERT INTO Animal(tamanho,tipoanimal,subtipo)" + " VALUES(?,?,?)";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		pstm.setDouble(1, model.getTamanho());
		pstm.setInt(2, model.getTipo());
		pstm.setString(3, model.getSubTipo());
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
	public void Update(Animal model) throws SQLException {
		String sql = "UPDATE Animal SET Tamanho = ?, TipoAnimal = ?, Subtipo = ? WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setDouble(1, model.getTamanho());
		pstm.setInt(2, model.getTipo());
		pstm.setString(3, model.getSubTipo());
		pstm.setInt(4, model.getId());
		pstm.execute();
		pstm.close();
		con.close();
	}

	@Override
	public void Delete(int id) throws SQLException {
		String sql = "DELETE FROM Animal WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		pstm.execute();
		pstm.close();
		con.close();
	}

	@Override
	public Animal Read(int id) throws SQLException {
		String sql = "SELECT * FROM Animal WHERE Id = ?";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Animal animal = null;
		if (rs.next()) {
			animal = new Animal();
			animal.setId(rs.getInt("id"));
			animal.setTamanho(rs.getDouble("tamanho"));
			animal.setTipo(rs.getInt("tipoanimal"));
			animal.setSubTipo(rs.getString("subtipo"));
		}
		return animal;
	}

	@Override
	public List<Animal> ReadAll() throws SQLException {
		List<Animal> animais = new ArrayList<Animal>();
		String sql = "SELECT * FROM Animal AS A JOIN TipoAnimal AS T ON A.TipoAnimal = T.Id";
		var con = getCon();
		PreparedStatement pstm = con.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			Animal animal = new Animal();
			animal.setId(rs.getInt("A.Id"));
			animal.setTamanho(rs.getDouble("A.tamanho"));
			animal.setTipo(rs.getInt("A.tipoanimal"));
			animal.setSubTipo(rs.getString("A.subtipo"));
			TipoAnimal tipoAnimal = new TipoAnimal();
			tipoAnimal.setId(rs.getInt("T.Id"));
			tipoAnimal.setNome(rs.getString("T.Nome"));
			animal.setTipoAnimal(tipoAnimal);
			animais.add(animal);
		}
		rs.close();
		pstm.close();
		con.close();
		return animais;
	}
}
