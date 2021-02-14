package br.com.thiago.teste;

import br.com.thiago.dados.Dados;
import br.com.thiago.dominio.Livro;
import br.com.thiago.dominio.Prateleira;

public class TestePrateleira {

    public static void main(String[] args) {
        Livro[] livros = Dados.getLivros();
        Prateleira p = new Prateleira(3,4);
       System.out.println("Organizando livros: ");
        p.organiza(livros);
        System.out.println("\nImprindo prateleira"); 
        p.imprime();
        System.out.println("\nBuscando livro: ");
        System.out.println(p.buscarLivro("web"));
    }
}







