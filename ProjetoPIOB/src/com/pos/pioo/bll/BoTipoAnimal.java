package com.pos.pioo.bll;

import java.sql.SQLException;
import java.util.List;

import com.pos.pioo.dispatcher.DispatcherTipoAnimal;
import com.pos.pioo.dispatcher.IDispatcherTipoAnimal;
import com.pos.pioo.models.TipoAnimal;

public class BoTipoAnimal {
	private IDispatcherTipoAnimal dspTipoAnimal;
	public BoTipoAnimal() throws ClassNotFoundException, SQLException {
		dspTipoAnimal = new DispatcherTipoAnimal();
	}
	public List<TipoAnimal> ListaTiposAnimais() throws SQLException{
		return dspTipoAnimal.ReadAll();
	}
}
