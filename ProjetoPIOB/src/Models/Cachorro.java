package Models;

public class Cachorro extends Mamifero {
	public Cachorro() {
		Alimentacao alimentacao = new Alimentacao();
		alimentacao.setNome("Ração");
		this.setAlimentacao(alimentacao);
	}
}
