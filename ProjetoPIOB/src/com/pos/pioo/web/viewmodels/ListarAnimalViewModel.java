package com.pos.pioo.web.viewmodels;

import java.util.ArrayList;
import java.util.List;

public class ListarAnimalViewModel {
	private List<Animal> animais;
	
	public ListarAnimalViewModel() {
		animais = new ArrayList<Animal>();
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
}
