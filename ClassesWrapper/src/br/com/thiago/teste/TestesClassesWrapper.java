package br.com.thiago.teste;

public class TestesClassesWrapper {

	public static void main(String[] args) {
		// Tipos primitivos
		// byte, short, int, long, float, double e char
		
		// Classes Wrappers
		// Byte, Short, Integer, Long, Float, Double e Character

		String valor = "15.5";
		Float v = new Float(valor);
		System.out.println(v + 3);

		int idade = Integer.parseInt("27"); // parseXXX
		System.out.println("Daqui a 5 anos você terá: " + (idade + 5) + " anos.");

		try {
			double custo = Double.parseDouble("Vinte e tres reais e cinquenta centavos");
			System.out.println("Custo total: " + custo);
		} catch (NumberFormatException e) {
			System.err.println("Numero inválido para conversão.");
		}
	}

}
