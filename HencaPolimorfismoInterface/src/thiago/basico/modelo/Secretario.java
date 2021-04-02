package thiago.basico.modelo;

import thiago.basico.interfaces.PermitirAcesso;

/*
 * Subclasse
 */

public class Secretario extends Pessoa implements PermitirAcesso {

	// modificdor de visibilidade private
	// variável registroEducacao do tipo String, onde String é uma classe
	private String registro;

	// modificdor de visibilidade private
	// atributo nivelCargo do tipo String, onde String é uma classe
	private String nivelCargo;

	// modificdor de visibilidade private
	// atributo experiencia do tipo String, onde String é uma classe
	private String experiencia;

	// modificdor de visibilidade private
	// atributo login do tipo String, onde String é uma classe
	private String login;

	// modificdor de visibilidade private
	// atributo senha do tipo String, onde String é uma classe
	private String senha;

	public Secretario() {
	}

	public Secretario(Long id, String nome, int idade, String dataNascimento, String registroGeral, int numeroCpf,
			String nomePai, String registro, String nivelCargo, String experiencia, String login, String senha) {
		super(id, nome, idade, dataNascimento, registroGeral, numeroCpf, nomePai);
		this.registro = registro;
		this.nivelCargo = nivelCargo;
		this.experiencia = experiencia;
		this.login = login;
		this.senha = senha;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}

	/*
	 * Método do contrato de autenticação
	 */
	@Override
	public boolean autenticar(String login, String senha) {
		return login.equals("admin") && senha.equals("admin");
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString()).append(", Registro: ").append(registro)
				.append(", Nivel Cargo: ").append(nivelCargo).append(", Experiencia").append(experiencia);
		return builder.toString();

	}

}
