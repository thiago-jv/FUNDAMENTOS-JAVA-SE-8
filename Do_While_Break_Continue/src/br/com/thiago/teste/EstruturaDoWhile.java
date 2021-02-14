package br.com.thiago.teste;

import java.util.Scanner;

public class EstruturaDoWhile {

	// classe main
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int valor = 0;
		int soma = 0;

		// faça
		do {
			System.out.println("Digite 0 para sair ou qualquer numero para somar: ");
			valor = entrada.nextInt();

			soma += valor;
			System.out.println("Soma: " + soma);
		// enquanto
		} while (valor != 0);

		entrada.close();
	}// fim main
}// fim classe
