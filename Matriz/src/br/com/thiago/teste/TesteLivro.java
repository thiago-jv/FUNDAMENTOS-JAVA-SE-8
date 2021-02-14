package br.com.thiago.teste;

import br.com.thiago.dados.Dados;
import br.com.thiago.dominio.Livro;

public class TesteLivro {

	public static void main(String[] args) {
		Livro[] livros = Dados.getLivros();
		
		// lista livros
		// Percorrendo método 1
		for(Livro v : livros) {
			System.out.println("Nome: " +v.getNome());
		}
		
		System.out.println();
		//Percorrendo método 2
		for(int i = 0; i < livros.length; i++) {
			System.out.println("Nome: " +livros[i].getNome());
		}
		

	}

}
