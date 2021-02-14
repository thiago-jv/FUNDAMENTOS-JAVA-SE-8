package br.com.thiago.teste;

import br.com.thiago.dominio.Funcionario;

public class TesteFuncionario01 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Thiago Henrique", "88371468252", -8_000.00);	
		Funcionario funcionario2 = new Funcionario("Thiago Carlos", "88371468255", 9_000.00);
		Funcionario funcionario3 = new Funcionario("Thiago melo", "88371468254", 7_000.00);
		
		Funcionario funcionarios[] = {funcionario1, funcionario2, funcionario3};
		
		for (Funcionario f : funcionarios) {
			f.imprime();
		}
	}
}
