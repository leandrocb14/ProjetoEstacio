package Models;

public class Mamifero extends Animal{
	public Mamifero() {
		var alimentacao = new Alimentacao();
		alimentacao.setNome("Leite");
		this.setAlimentacao(alimentacao);
	}
}
