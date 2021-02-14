package br.com.thiago.teste;


public class TesteStringBuilder {

	// classe main
	public static void main(String[] args) {
	
		// StringBuild, muito utilizada para fazer concatenação de String
		// A diferença entre String e StringBuilder, é que StringBuilder, não costuma
		// deixar lixo nas variáveis, porem caso a classe String não seja bem utilizada, 
		// poderá causar problemas em espaço de mémoria 
		StringBuilder frase = new StringBuilder("Thiago");

		frase.append(" Desenvolvedor");
		frase.append("!");
		System.out.println(frase);

		frase.insert(5, " Henrique ");
		System.out.println(frase);

		frase.reverse();
		System.out.println(frase);

		char letra = '\u004C';
		System.out.println(letra);

		letra = 76;
		System.out.println(letra);
	
	}// fim main
}// fim classe
