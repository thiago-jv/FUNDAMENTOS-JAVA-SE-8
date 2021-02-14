package br.com.thiago.teste;

/*
 * Algotimo que irá calcular a media com base nos dados do vetor
 */

public class Calculadora {

	public static void main(String[] args) {

		// declaração dos vetores
		int a[] = { 10, 12, 9, 15 };
		int b[] = { 30, 40, 50, 20, 10 };
		double c[] = { 10.5, 15.4, 12.8, 25.5, 12, 14, 18 };

		// utilizando o forEach A
		int somaDeA = 0;
		for (int i : a) {
			somaDeA += i;
		}
		// resultado média A
		double mediaDeA = somaDeA / a.length;

		// utilizando o forEach B
		int somaDeB = 0;
		for (int i : b) {
			somaDeB += i;
		}
		// resultado média B
		double mediaDeB = somaDeB / b.length;

		// utilizando o forEach C
		double somaDeC = 0;
		for (double d : c) {
			somaDeC += d;
		}
		// resultado média C
		double mediaDeC = somaDeC / c.length;

		// imprimir média de A
		System.out.println("Média de A: " + mediaDeA);

		// imprimir média de B
		System.out.println("Média de B: " + mediaDeB);

		// imprimir média de C
		System.out.printf("Média de C: %.2f", mediaDeC);
	}// fim main
}// fim classe
