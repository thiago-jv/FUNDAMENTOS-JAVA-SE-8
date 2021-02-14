package br.com.thiago.dominio;

public class Tecnico extends Pessoa {

	protected String cpf;

	public void seApresentar() {
		// acesando o método de outra classe
		super.seApresentar();
		System.out.println("Cpf: " + cpf);
	}

	public Tecnico() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
