package br.com.thiago.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	// classe main
	public static void main(String[] args) throws IOException {

		// entrada de arquivo
		FileInputStream entrada = new FileInputStream("C:\\workspace\\java-io\\src\\lorem.txt");

		// lendo o arquivo repassado pelo input de uma forma mais elegante
		InputStreamReader lendo = new InputStreamReader(entrada);

		// Guardando os caracteres que foram lidos
		BufferedReader guardando = new BufferedReader(lendo);

		// Lendo as linhas do arquivo
		String linha = guardando.readLine();

		// enquanto linha for diferente de null
		while (linha != null) {

			// linha = linha
			linha = guardando.readLine();
			System.out.println(linha);

		}
		// fecha o arquivo
		guardando.close();
	}// fim main
}// fim classe
