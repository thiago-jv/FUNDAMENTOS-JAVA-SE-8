package br.com.thiago.teste;

import java.util.Scanner;

public class PagamentoIPVA {

	// classe main
	public static void main(String[] args) {

		// Classe Scanner para entrada de dados
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o final da placa: ");
		int finalPlaca = sc.nextInt();

		//
		switch (finalPlaca) {
		// caso seja informado o valor 1, o systema irá exibir a informação abaixo
		case 1:
			System.out.println("Vencimento dia 11 de Janeiro");
		// Utilizando break para sair do código
			break;
		case 2:
		// caso seja informado o valor 2, o systema irá exibir a informação abaixo
			System.out.println("Vencimento dia 12 de Janeiro");
		// Utilizando break para sair do código
			break;
		// Caso e informação informada não esteja dentro das condições do switch, a mensagem default, será exibida
		default:
			System.out.println("Vencimento sem data, desculpe!");
		}

		sc.close();// fim scanner

	}// fim main
}// fim classe
