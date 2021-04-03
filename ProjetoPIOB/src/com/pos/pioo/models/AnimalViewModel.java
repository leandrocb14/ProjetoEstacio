package com.pos.pioo.models;

public class AnimalViewModel extends ViewModel {
	private int id;	
	private String nome;
	private double tamanho;
	private int tipo;
	private String subTipo;
	private String nomeAlimentacoes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
}
