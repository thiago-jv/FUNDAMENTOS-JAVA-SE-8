package br.com.thiago.dominio;

public class Pessoa {

	protected String nome;

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void seApresentar() {
		System.out.println("Nome: " + nome);
	}

}
