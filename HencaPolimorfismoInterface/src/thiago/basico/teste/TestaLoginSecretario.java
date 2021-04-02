package thiago.basico.teste;

import javax.swing.JOptionPane;
import thiago.basico.modelo.Secretario;

public class TestaLoginSecretario {

	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		/*
		 * trabalhando diretamente com o  objeto
		 */
		Secretario secretario = new Secretario();
	//	secretario.setLogin(login);
	//	secretario.setSenha(senha);
	
	//	PermitirAcesso secretario = new Secretario();
		
		if(secretario.autenticar(login, senha)) {
			System.out.println("Acessou");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso negado!");
		}

	}

}
