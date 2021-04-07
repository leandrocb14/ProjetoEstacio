package com.pos.pioo.models;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private int id;
	private double tamanho;
	private int tipo;
	private String subTipo;
	private TipoAnimal tipoAnimal;
	private List<Alimentacao> alimentacoes;
	
	public Animal() {
		alimentacoes = new ArrayList<Alimentacao>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getSubTipo() {
		return subTipo;
	}

	public void setSubTipo(String subTipo) {
		this.subTipo = subTipo;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public List<Alimentacao> getAlimentacoes() {
		return alimentacoes;
	}
	public void setAlimentacao(Alimentacao alimentacao) {
		this.alimentacoes.add(alimentacao);
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
}
