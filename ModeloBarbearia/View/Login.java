package View;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.LoginController;

public class Login extends javax.swing.JFrame {

	private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {
		this.controller.fizTarefa();
		System.out.println(TextUsuario.getText()); // usuario
		System.out.println(TextSenha.getText()); // senha
	}

	private final LoginController controller;
	private Login view;

	public Login() {
		initComponents();
		controller = new LoginController(this.view);
	}

	private void initComponents() {

	}

	private javax.swing.JPasswordField TextSenha;
	private javax.swing.JTextField TextUsuario;

	public void exibeMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}

	public JPasswordField getTextSenha() {
		return TextSenha;
	}

	public void setTextSenha(JPasswordField TextSenha) {
		this.TextSenha = TextSenha;
	}

	public JTextField getTextUsuario() {
		return TextUsuario;
	}

	public void setTextUsuario(JTextField TextUsuario) {
		this.TextUsuario = TextUsuario;
	}

}
