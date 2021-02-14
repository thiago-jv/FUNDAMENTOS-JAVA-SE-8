package br.com.thiago.teste;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	// classe main
	public static void main(String[] args) throws IOException {

		// saida de arquivo
		FileOutputStream entrada = new FileOutputStream("C:\\workspace\\java-io\\src\\lorem2.txt");

		// lendo o arquivo repassado pelo input de uma forma mais elegante
		Writer lendo = new OutputStreamWriter(entrada);

		// Guardando os caracteres que foram inseridos
		BufferedWriter escrevendo = new BufferedWriter(lendo);

		// escrevendo nos arquivos
		escrevendo.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		escrevendo.newLine();
		escrevendo.newLine();
		escrevendo.write("asfasdfsafdas dfs sdf asf assdﬂ");

		// fecha o arquivo
		escrevendo.close();
	}// fim main
}// fim classe
