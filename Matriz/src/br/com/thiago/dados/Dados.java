package br.com.thiago.dados;

import br.com.thiago.dominio.Livro;

public class Dados {

    public static Livro[] getLivros() {
        Livro[] livros = {new Livro("Java Basico", "T�cnico", "Deitel"),
            new Livro("Java Avan�ado", "T�cnico", "Deitel"),
            new Livro("Java OCA/OCP", "T�cnico", "Deitel"),
            new Livro("Android", "T�cnico", "Deitel"),
            new Livro("Spring MVC", "T�cnico", "Deitel"),
            new Livro("Jogos em Java", "T�cnico", "Deitel"),
            new Livro("Jboss", "T�cnico", "Deitel"),
            new Livro("GlassFish", "T�cnico", "Deitel"),
            new Livro("Oracle Java Master", "T�cnico", "Deitel"),
            new Livro("Java WEB", "T�cnico", "Deitel"),
            new Livro("Angulas JS", "T�cnico", "Deitel")};
        return livros;
    }//fim getLivros
}
