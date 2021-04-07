package com.pos.pioo.bll;

import java.sql.SQLException;
import java.util.List;

import com.pos.pioo.dispatcher.DispatcherAnimal;
import com.pos.pioo.dispatcher.IDispatcherAnimal;
import com.pos.pioo.models.Animal;

public class BoAnimal {
	private IDispatcherAnimal dspAnimal;

	public BoAnimal() throws ClassNotFoundException, SQLException {
		dspAnimal = new DispatcherAnimal();
	}

	public void CriarAnimal(Animal animal) throws SQLException {
		var id = dspAnimal.Create(animal);
		System.out.println(id);
	}

	public List<Animal> ListarTodosAnimais() throws SQLException {
		return dspAnimal.ReadAll();
	}

	public Animal BuscarAnimal(int id) throws SQLException {
		return dspAnimal.Read(id);
	}

	public void ExcluirAnimal(int id) throws SQLException {
		dspAnimal.Delete(id);
	}
	
	public void AlterarAnimal(Animal animal) throws SQLException {
		dspAnimal.Update(animal);
	}
}
