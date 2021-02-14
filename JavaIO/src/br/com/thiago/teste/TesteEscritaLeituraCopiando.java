package br.com.thiago.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaLeituraCopiando {

	// classe main
	public static void main(String[] args) throws IOException {

		// entrada de arquivo
		// System.in; direto no console
		InputStream entrada = System.in;// new FileInputStream("C:\\workspace\\java-io\\src\\lorem.txt");

		// Ou informar um arquivo e mostrar no console
		// InputStream entrada = new
		// FileInputStream("C:\\workspace\\java-io\\src\\lorem.txt");

		// lendo o arquivo repassado pelo input de uma forma mais elegante
		InputStreamReader lendo = new InputStreamReader(entrada);
		// Guardando os caracteres que foram lidos
		BufferedReader guardando = new BufferedReader(lendo);

		// saida de arquivo
		// System.out; direto no console
		// OutputStream saida = System.out;// new
		// FileOutputStream("C:\\workspace\\java-io\\src\\lorem2.txt");

		// Posso informar uma saida direta para meu input
		OutputStream saida = new FileOutputStream("C:\\workspace\\java-io\\src\\lorem2.txt");

		// lendo o arquivo repassado pelo input de uma forma mais elegante
		Writer lend = new OutputStreamWriter(saida);
		// Guardando os caracteres que foram inseridos
		BufferedWriter escrevendo = new BufferedWriter(lend);

		// Lendo as linhas do arquivo
		String linha = guardando.readLine();

		// enquanto linha for diferente de null
		while (linha != null && !linha.isEmpty()) {

			// escreve a lina
			escrevendo.write(linha);
			// escreve em uma nova linha
			escrevendo.newLine();
			// para enviar tudo
			escrevendo.flush();
			// ler a linha
			linha = guardando.readLine();
			//

		}

		// fecha o arquivo
		guardando.close();
		escrevendo.close();
		
	}// fim main
}// fim classe
