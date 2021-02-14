package br.com.thiago.teste;

public class TesteIfElse {

	public static void main(String[] args) {
		double altura = 1.70;
		if(altura <= 1.50) {
			System.out.println("Baixa");
		} else if (altura <= 1.80) {
			System.out.println("Médio");
		} else {
			System.out.println("Alto");
		}
	}

}
