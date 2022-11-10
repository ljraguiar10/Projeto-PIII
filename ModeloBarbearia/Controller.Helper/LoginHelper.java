package Controller.Helper;

import Model.Usuário;
import View.Login;

public class LoginHelper {

	private final Login view;

	public LoginHelper(Login view) {
		this.view = view;
	}

	public Usuário obterModelo() {

		String nome = view.getTextUsuario().getText();
		String senha = view.getTextSenha().getText();

		Usuário modelo = new Usuário(0, nome, senha);

		return modelo;

	}

	public void setarModelo(Usuário modelo) {

		String nome = modelo.getNome();
		String senha = modelo.getSenha();
		
		view.getTextUsuario().setText(nome);
		view.getTextSenha().setText(senha);
	}
	
	public void limparTela() {
		
		view.getTextUsuario().setText("");
		view.getTextSenha().setText("");
		
	}

}