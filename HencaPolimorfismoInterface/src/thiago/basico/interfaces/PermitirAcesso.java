package thiago.basico.interfaces;

/*
 * Essa interface ser� o nosso contrato de autentica��o
 */
public interface PermitirAcesso {
	
	/*
	 * Sobrecarga de m�todo
	 */
	public boolean autenticar(String login, String senha);

}
