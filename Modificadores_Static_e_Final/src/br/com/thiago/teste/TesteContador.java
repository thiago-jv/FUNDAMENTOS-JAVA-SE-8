package br.com.thiago.teste;

import br.com.thiago.dominio.Contador;

public class TesteContador {

	// classe main
	public static void main(String[] args) {

		// acessamos diretamente atraves da classe e incrementando
		// Contador.COUNT = 5;

		// buscando o que foi incrementado e atribuindo a variável valorIncrementado
		// int valorIncrementado = Contador.count;

		// imprimindo valorIncrementado
		// System.out.println("Valor: " +valorIncrementado);

		Contador c = new Contador();
		c.incrementar();
		System.out.println(Contador.COUNT);

		Contador.COUNT++;
		System.out.println(Contador.COUNT);

		Contador.imprimirContador();
	}// fim main
}// fim classe
