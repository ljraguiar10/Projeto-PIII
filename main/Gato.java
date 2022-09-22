package main;

public class Gato extends Pet {
	
	public Gato(String nome, double peso, int idade, String pelo) {
		super(nome, peso, idade, pelo);
	}

	@Override
	public String getMessage() {
		return "VAMOS CRIAR O CADASTRO DO SEU GATO!";
	}

	@Override
	public String getSizeMessage() {
		return "Digite o tamanho do seu gato(cm): ";
	}

	@Override
	public int getMinSize() {
		return 7;
	}

	@Override
	public int getMaxSize() {
		return 40;
	}

}

