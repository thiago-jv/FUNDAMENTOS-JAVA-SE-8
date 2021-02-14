package br.com.thiago.teste;



import java.time.LocalDate;

import br.com.thiago.dominio.Aluno;


public class TesteAluno01 {

	// classe main
    public static void main(String[] args) {
      
    	// instanciando a classe Aluno
    	Aluno a = new Aluno(); 
    	
        a.codigo = 1;
        a.nome = "Matheus Oliveira";
        a.dataMatricula = LocalDate.of(2020, 1, 10); //10/JAN/2020
        a.NOTAS[0] = a.NOTAS[1] = a.NOTAS[2] = a.NOTAS[3] = 8.5;
        
        a.imprime();
    }// fim main    
}// fim classe
