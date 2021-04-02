package thiago.basico.interfaces;

/*
 * Essa interface será o nosso contrato de autenticação
 */
public interface PermitirAcesso {
	
	/*
	 * Sobrecarga de método
	 */
	public boolean autenticar(String login, String senha);

}
