package Models;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String nome;
	private double tamanho;
	private List<Alimentacao> alimentacoes;
	
	public Animal() {
		alimentacoes = new ArrayList<Alimentacao>();
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
	public List<Alimentacao> getAlimentacoes() {
		return alimentacoes;
	}
	public void setAlimentacao(Alimentacao alimentacao) {
		this.alimentacoes.add(alimentacao);
	}
}
