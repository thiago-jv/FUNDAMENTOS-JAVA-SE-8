package br.com.thiago.dominio;

public class Aluno {
	
    //atributos do aluno (campos da classe)
    public int matricula; //0
    public String nome; //null
    public int idade; //0
    public String disciplina; //null
    public double notas[] = new double[4]; //[0.0][0.0][0.0][0.0]
    
    public void imprime() {
        System.out.println("Matricula: #" + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Disciplina: " + disciplina);
        System.out.printf("Notas: [%.2f][%.2f][%.2f][%.2f]\n",
                notas[0],
                notas[1],
                notas[2],
                notas[3]);        
    } //fim imprime
   
}//fim classe
