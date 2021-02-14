package br.com.thiago.teste;

public class TesteString {

	// classe main
	public static void main(String[] args) {

		// Classe String
		String frase = "Java - Fundamentos da Linguagem";

		// toUpperCase, ir� modificar os valor para letras mai�sculas
		String maiuscula = frase.toUpperCase();
		System.out.println("toUpperCase : " +maiuscula);

		// toUpperCase, ir� modificar os valor para letras min�sculas
		String minuscula = frase.toLowerCase();
		System.out.println("toLowerCase: " +minuscula);

		// concat, ir� concatenar junto aos valores existentes
		frase = frase.concat("!");
		System.out.println("concat: " +frase);

		// substring, informamos o primeiro index para iniciar e a partir desse index o
		// proximo valor repassado ir� contar
		String unidade = frase.substring(2, 3);
		System.out.println("SubString : " + unidade);

		// length, exibe e tamanho da strings
		int tamanho = frase.length();
		System.out.println("lenght: " +tamanho);

		// indexOf, entre aspas duplas, informamos uma string para que seja verificado
		// qual � sua posi��o e retornando o index
		int posicaoFu = frase.indexOf("Fu");
		System.out.println("indexOf : " +posicaoFu);

		// replace, utilizado para sobrescrever uma valor, passando o primeiro que ir�
		// subistituir o segundo valor
		frase = frase.replace("Java", "Java Expert");
		System.out.println("replace: " +frase);

		// charAt, retorna o caracter corespondente ao index passado -1
		char caracter12 = frase.charAt(1);
		System.out.println("charAt:" +caracter12);

		// trim, remove os espa�os em branco
		String semEspaco = "      ok     ".trim();
		System.out.println(semEspaco);

		// contains, recece um valor e verifica se existe um valor correspondente
		boolean aFraseComJa = frase.contains("Ja");
		System.out.println(aFraseComJa);

	}// fim main
}// classe

