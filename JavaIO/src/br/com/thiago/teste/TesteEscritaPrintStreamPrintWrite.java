package br.com.thiago.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWrite {

	// classe main
	public static void main(String[] args) throws IOException {

		PrintWriter ps = new PrintWriter("C:\\workspace\\java-io\\src\\lorem2.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("asfasdfsafdas dfs sdf asf assdﬂ");
		ps.close();

	}// fim main
}// fim classe
