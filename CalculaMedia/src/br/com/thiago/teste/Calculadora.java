package br.com.thiago.teste;

/*
 * Algotimo que ir� calcular a media com base nos dados do vetor
 */

public class Calculadora {

	public static void main(String[] args) {

		// declara��o dos vetores
		int a[] = { 10, 12, 9, 15 };
		int b[] = { 30, 40, 50, 20, 10 };
		double c[] = { 10.5, 15.4, 12.8, 25.5, 12, 14, 18 };

		// utilizando o forEach A
		int somaDeA = 0;
		for (int i : a) {
			somaDeA += i;
		}
		// resultado m�dia A
		double mediaDeA = somaDeA / a.length;

		// utilizando o forEach B
		int somaDeB = 0;
		for (int i : b) {
			somaDeB += i;
		}
		// resultado m�dia B
		double mediaDeB = somaDeB / b.length;

		// utilizando o forEach C
		double somaDeC = 0;
		for (double d : c) {
			somaDeC += d;
		}
		// resultado m�dia C
		double mediaDeC = somaDeC / c.length;

		// imprimir m�dia de A
		System.out.println("M�dia de A: " + mediaDeA);

		// imprimir m�dia de B
		System.out.println("M�dia de B: " + mediaDeB);

		// imprimir m�dia de C
		System.out.printf("M�dia de C: %.2f", mediaDeC);
	}// fim main
}// fim classe
