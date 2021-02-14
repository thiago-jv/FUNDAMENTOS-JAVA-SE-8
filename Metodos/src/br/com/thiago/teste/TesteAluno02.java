package br.com.thiago.teste;

import java.time.LocalDate;

import br.com.thiago.dominio.Aluno;

public class TesteAluno02 {

	// classe main
	public static void main(String[] args) {
		
		// utilizando o construtor da classe para passar valoress
		Aluno a = new Aluno(1, "Thiago Henrique", LocalDate.of(2020, 1, 10));

		// nesse exemplo estamos passando 4 valores
		a.adicionaNotas(7.0, 8.0, 8.5, 9.0);

		// exibi os dados utilizando o primeiro m�todo 
		a.imprime();

		System.out.println("________________\n\n");
		
		// nesse exemplo passamos apenas 3 valores, logo o m�todo ir� sobrescrever o m�todo anterior
		a.adicionaNotas(7.0, 8.0, 8.5);

		// exibi os dados utilizando o m�todo sobrescrito
		a.imprime();
	}

}
