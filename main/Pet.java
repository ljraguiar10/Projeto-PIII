package main;

public abstract class Pet {
	
	private String nome;
	private double peso;
	private int idade;
    private String pelo;
	
    public Pet(String nome, double peso, int idade, String pelo) {
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
        this.pelo = pelo;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPelo() {
        return this.pelo;
    }
    public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public void ficha() {
		System.out.println("------FICHA DO SEU PET------");
		System.out.println("NOME: "+this.getNome());
		System.out.println("IDADE: "+this.getIdade()+" anos");
		System.out.println("PESO: "+this.getPeso()+" kg");
        System.out.println("");
	}
	
	public String getMessage() {
		return "";
	}
	public String getSizeMessage() {
		return "";
	}
	public int getMinSize(){
		return 0;
	}
	public int getMaxSize(){
		return 0;
	}
}
