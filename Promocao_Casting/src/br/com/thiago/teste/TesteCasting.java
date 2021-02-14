package br.com.thiago.teste;

public class TesteCasting {

	// classe main
	public static void main(String[] args) {

		int n1 = 55555;
		int n2 = 99999;
		// cast explicito 1L, promovendo n * n2 para long
		long r1 = 1L * n1 * n2; // 3_703_629_630
		System.out.println("long: " + r1);

		byte b1 = 50;
		byte b2 = 60;
		// byte r2 = b1 + b2; // erro de compilação, nesse caso, a soma irá ultrapassar
		// o tamanho que o tipo primitivo byte pode suportar
		int r2 = b1 + b2;
		System.out.println("int: " + r2);

		b1 = b2 = 110;
		// Com o cast implicito, estamos falando para que seja somado tudo e empacotado,
		// sem levar o tamanho to tipi primitivo byte
		byte r3 = (byte) (b1 + b2);
		System.out.println("byte: " +r3);
		
		double d = 7.0/2;  // ou 7d/2
		System.out.println("double: "+d);
		
		// forçando o 24.0 para float com a letar f ao final do número
		float f = 24.0f;
		System.out.println("float: "+f);
		
		double d2 = 23.0;
		// cast explicito de double para float
		float f2 = (float) d2;
		System.out.println("double: "+f2);

	}// fim main
}// fim classe
