package br.com.thiago.teste;

import java.util.List;

import br.com.thiago.dominio.Aula;
import br.com.thiago.dominio.Curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java",
				"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

		List<Aula> aulas = javaColecoes.getAulas();

		System.out.println(aulas);
		
		System.out.println(javaColecoes);

	}

}
