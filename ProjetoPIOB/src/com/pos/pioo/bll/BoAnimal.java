package com.pos.pioo.bll;

import java.sql.SQLException;

import com.pos.pioo.dispatcher.DispatcherAnimal;
import com.pos.pioo.dispatcher.IDispatcherAnimal;
import com.pos.pioo.models.Animal;

public class BoAnimal {
	private IDispatcherAnimal dspAnimal;
	
	public BoAnimal() throws ClassNotFoundException, SQLException {
		dspAnimal = new DispatcherAnimal();
	}
	
	public void CriarAnimal(Animal animal) throws SQLException {
		dspAnimal.Create(animal);
	}
}
