package com.pos.pioo.models;

public class Cachorro extends Mamifero {
	public Cachorro() {
		Alimentacao alimentacao = new Alimentacao();
		alimentacao.setNome("Ra��o");
		this.setAlimentacao(alimentacao);
	}
}
