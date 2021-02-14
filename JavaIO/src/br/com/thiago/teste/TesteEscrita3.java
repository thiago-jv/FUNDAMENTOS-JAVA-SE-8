package br.com.thiago.teste;

import java.io.File;
import java.util.Scanner;

public class TesteEscrita3 {

	// classe main
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("C:\\workspace\\java-io\\src\\contas.csv"));
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);

			linha.split(",");
		}

		scanner.close();

	}// fim main
}// fim classe
