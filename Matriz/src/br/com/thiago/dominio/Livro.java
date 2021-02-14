package br.com.thiago.dominio;


public class Livro {
    private static int ultimoCodigo = 0;
    private int codigo;
    private String nome;
    private String genero;
    private String autor;

    public Livro(String nome, String genero, String autor) {
        this.codigo = ++ultimoCodigo;
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
