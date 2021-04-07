package com.pos.pioo.web.viewmodels;

public class Animal {
	private int id;
	private double tamanho;
	private String tipo;
	private String subTipo;
	private String nomeAlimentacoes;
	
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
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
}
