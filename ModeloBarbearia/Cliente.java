package ModeloBarbearia;

import java.util.Date;

public class Cliente extends Pessoa {

	private String endereço;
	private String cep;

	public Cliente(String endereço, String cep, int id, String nome, char sexo, String dataNascimento, String telefone,
			String email, String rg) {
		super(id, nome, sexo, dataNascimento, telefone, email, rg);
		this.endereço = endereço;
		this.cep = cep;
	}

	public Cliente(int id, String nome, String endereço, String cep) {
		super(id, nome);
		this.endereço = endereço;
		this.cep = cep;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}