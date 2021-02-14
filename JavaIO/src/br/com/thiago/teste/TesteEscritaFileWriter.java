package br.com.thiago.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	// classe main
	public static void main(String[] args) throws IOException {

		// Escreve no arquivo de destino
		FileWriter fw = new FileWriter("C:\\workspace\\java-io\\src\\lorem2.txt");
		// empacota tudo
		BufferedWriter bw = new BufferedWriter(fw);
		// escreve o conteudo
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		// cria uma nova linha apos a primeira
		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdﬂ");

		bw.close();
	}// fim main
}// fim classe
