package Models;

public class Cachorro extends Mamifero {
	public Cachorro() {
		Alimentacao alimentacao = new Alimentacao();
		alimentacao.setNome("Ra��o");
		this.setAlimentacao(alimentacao);
	}
}
