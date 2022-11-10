package ModeloBarbearia;

import java.util.Date;

public class Usuário extends Pessoa {

	protected String senha;
	protected String nivelAcesso;

	public Usuário(int id, String nome, String senha) {
		super(id, nome);
		this.senha = senha;

	}

	public Usuário(String senha, String nivelAcesso, int id, String nome, char sexo, String dataNascimento,
			String telefone, String email, String rg) {
		super(id, nome, sexo, dataNascimento, telefone, email, rg);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

}