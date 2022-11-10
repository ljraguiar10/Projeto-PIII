package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuário;
import View.Login;

public class LoginController {

	private final Login view;
	private LoginHelper helper;

	public LoginController(Login view) {
		this.view = view;
		this.helper = new LoginHelper(view);
	}

	public void entrarNoSistema() {

		// pegar um usuario da view

		Usuário usuário = helper.obterModelo();

		// pesquisar Usuario no banco
		// se o usuário da view tiver mesmo usuário e senha que usuário do banco,
		// direcionar para menu principal
		// senão mostrar uma mensagem ao usuário "Usuário ou senha inválidos"

	}

	public void fizTarefa() {
		System.out.println("Busquei algo do banco de dados");

		this.view.exibeMensagem("Executei o fiz tarefa");

	}

}