package main;

public class Pessoa {
    
    private String nome;
    private String status;
    private int númeroCadastro;

    public Pessoa (String nome, String status, int númeroCadastro) {
        this.nome = nome;
        this.status = status;
        this.númeroCadastro = númeroCadastro;
    }
    public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.nome = status;
	}
    public int getNúmeroCadastro() {
		return this.númeroCadastro;
	}
	
	public void setNúmeroCadastro(int númeroCadastro) {
		this.númeroCadastro = númeroCadastro;
	}

    @Override
     public String toString (){
        return "Nome: " + this.nome + " Status: " + this.status + " Codigo: " + this.númeroCadastro;
    }

}
