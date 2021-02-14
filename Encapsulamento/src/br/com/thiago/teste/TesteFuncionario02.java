package br.com.thiago.teste;

import br.com.thiago.dominio.Funcionario;

public class TesteFuncionario02 {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Thiago Henrique", "88371468252", -8_000.00);	
		System.out.printf("Nome: %s - CPF: %s", funcionario.getNome(), funcionario.getCpf());

		
		System.out.println();
		System.out.println("\nNovo salário:");
		funcionario.aumentaSalario(-9_000.00);
		funcionario.imprime();
		
	}

}
