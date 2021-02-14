package br.com.thiago.dominio;

// trabalhando com encapsulamento dos dados, utilizando os modificadores de acesso

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa() {
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
