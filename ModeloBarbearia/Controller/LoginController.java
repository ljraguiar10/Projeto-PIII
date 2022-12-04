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

		String nome = view.getTextUsuario().getText();
		String senha = view.getTextSenha().getText();	

		// pegar um usuario da view

		Usuário usuário = helper.obterModelo();
		UsuárioDAO usuárioDAO = new UsuárioDAO();
		Usuário usuárioAutenticado = usuárioDAO.selectPorNomeESenha(usuário);

		if(usuárioAutenticado != null) {
           MenuPrincipal menu = new MenuPrincipal();
		   menu.setVisible(true);
		   this.view.dispose();
		} else {
			view.exibeMensagem("Usuario ou senha inválidos");
		}
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