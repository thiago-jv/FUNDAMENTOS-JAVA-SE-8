package br.com.thiago.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	// classe main
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		// criando um arquivo binario
//		String nome = "Nico Steppat";

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\workspace\\java-io\\src\\objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();

		// lendo um arquivo binario
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\workspace\\java-io\\src\\objeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);

	}// fim main
}// fim classe
