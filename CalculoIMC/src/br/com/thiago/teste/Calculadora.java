package br.com.thiago.teste;

/*
 * Realizar o cálculo do IMC -> índice da massa corporal, recebendo
 * nome da pessoa, peso e altura, a formula é peso / altura * altura 
 */

import java.util.Scanner;

public class Calculadora { 

	// variável static ACIMA_DO_PESO
	static final double ACIMA_DO_PESO = 24.99;
	
	// variável static ABAIXO_DO_PESO
	static final double ABAIXO_DO_PESO = 18.50;

	public static void main(String[] args) {

		// Declarando o Scanner
		Scanner sc = new Scanner(System.in);

		// Solicita e armazena a variável nome;
		System.out.println("Digite seu nome:");
		String nome = sc.next();

		// Solicita e armazena a variável peso;
		System.out.println("Digite seu peso:");
		double peso = sc.nextDouble();

		// Solicita e armazena a variável peso;
		System.out.println("Digite sua altura");
		double altura = sc.nextDouble();
		
		// Realiza o cáculo peso / altura²
		double imc = peso / (altura * altura);

		
		// exibe na tela
		System.out.println("Paciente: " +nome);
		System.out.printf("IMC: %.2f \n", imc);
		
		// situação do paciente
		if(imc < ABAIXO_DO_PESO) {
			System.out.println("Abaixo do peso!");
		} else if (imc >= ABAIXO_DO_PESO && imc <= ACIMA_DO_PESO) {
			System.out.println("Peso normal!");
		} else {
			System.out.println("Acima do peso!");
		}//fim if
		
		sc.close();
	}//fim main
}//fim classe