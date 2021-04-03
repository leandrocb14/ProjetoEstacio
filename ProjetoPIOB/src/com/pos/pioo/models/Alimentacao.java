package com.pos.pioo.models;

import java.util.List;

public class Alimentacao {
	private String nome;
	private List<Animal> animais;

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
