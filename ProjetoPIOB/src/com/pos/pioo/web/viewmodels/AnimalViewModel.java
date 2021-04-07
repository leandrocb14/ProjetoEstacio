package com.pos.pioo.web.viewmodels;

import java.util.List;

import com.pos.pioo.models.TipoAnimal;

public class AnimalViewModel {
	private int id;
	private double tamanho;
	private int tipo;
	private String subTipo;
	private String nomeAlimentacoes;
	private List<TipoAnimal> tiposAnimais;
	private String action;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
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

	public String getNomeAlimentacoes() {
		return nomeAlimentacoes;
	}

	public void setNomeAlimentacoes(String nomeAlimentacoes) {
		this.nomeAlimentacoes = nomeAlimentacoes;
	}

	public List<TipoAnimal> getTiposAnimais() {
		return tiposAnimais;
	}

	public void setTiposAnimais(List<TipoAnimal> tiposAnimais) {
		this.tiposAnimais = tiposAnimais;
	}
}
