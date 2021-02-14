package br.com.thiago.teste;

import java.util.Scanner;

public class MultaVeiculo {

	// classe main
	public static void main(String[] args) {

		// Variaveis para melhor manutenção np código, caso seja necessário realizar a
		// modificação, as mesmas são realizadas aqui e refletido nos destinos
		final String PASSEIO = "passeio";
		final String CAMINHAO = "caminhao";
		final String MULTA = "Multa";
		final String OK = "Tudo certo!";
		final double VELOCIDADE_CARRO_PASSEIO = 1.1;
		final double VELOCIDADE_CAMINHAO = 1.05;

		// classe escaner para entrada e saída de dados
		Scanner entrada = new Scanner(System.in);

		// entrada de dados
		System.out.println("Tipo do veiculo (passeio, caminhao)");
		String tipoVeiculo = entrada.nextLine();

		// entrada de dados
		System.out.println("Velocidade maxima da via");
		int velocidadeMaxima = entrada.nextInt();

		// entrada de dadoss
		System.out.println("Velocidade do veiculo");
		int velocidadeVeiculo = entrada.nextInt();

		// veiculo de passeio com velocidade maior que 10% da velocidade da via
		if (tipoVeiculo.equals(PASSEIO) && velocidadeVeiculo > velocidadeMaxima * VELOCIDADE_CARRO_PASSEIO) {
			System.out.println(MULTA);
		// e caminhao com velocidade maior que 5% deve receber multa
		} else if (tipoVeiculo.equals(CAMINHAO) && velocidadeVeiculo > velocidadeMaxima * VELOCIDADE_CAMINHAO) {
			System.out.println(MULTA);
		} else {
			System.out.println(OK);
		}
		entrada.close(); // fim scanner
	}// fim main
}// fim classe
