package br.com.thiago.teste;

import br.com.thiago.dominio.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.setIdade(31);
		pessoa.setNome("Thiago");

		System.out.println("Nome:  " + pessoa.getNome() + " - " + "Idade: " + pessoa.getIdade());
	}// fim main
}// fim classe
