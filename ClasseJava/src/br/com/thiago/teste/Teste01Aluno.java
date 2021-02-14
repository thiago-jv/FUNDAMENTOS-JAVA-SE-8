package br.com.thiago.teste;

import br.com.thiago.dominio.Aluno;

public class Teste01Aluno {

	// classe main
    public static void main(String[] args) {
    	
        //instanciação do Aluno (objeto)
        Aluno aluno = new Aluno();
        aluno.imprime();
        
        aluno.matricula = 1;
        aluno.nome = "Thiago Henrique";
        aluno.idade = 16;
        aluno.disciplina = "Matemática";
        //double notas[] = {8.0, 8.5, 0.0, 0.0};
        aluno.notas = new double[]{8.0, 8.5, 0.0, 0.0};
        
        System.out.println("\n");
        aluno.imprime();
    }// fim main    
}// fim classe