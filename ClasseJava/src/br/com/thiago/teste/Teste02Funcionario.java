package br.com.thiago.teste;

import br.com.thiago.dominio.Funcionario;

public class Teste02Funcionario {

	// classe main
    public static void main(String[] args) {
    	
        Funcionario funcionario = new Funcionario();
        funcionario.imprime();
        
        System.out.println("\n");
        funcionario.codigo = 1;
        funcionario.nome = "Thiago Henrique";
        funcionario.cpf = "123.456.789-00";
        funcionario.setor = "Desenvolvimento de Software";
        funcionario.salario = 1000.00;
        
        funcionario.imprime();
    }// fim main
}// fim classe
