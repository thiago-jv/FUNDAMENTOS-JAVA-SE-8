package br.com.thiago.teste;

import br.com.thiago.dominio.Assalariado;
import br.com.thiago.dominio.Funcionario;

public class TesteVirtualizacao {

	public static void main(String[] args) {
		Funcionario f = new Assalariado("Igor", "Riberiro", "000.000.000-00", 1_000.00);
		
		if(f instanceof Assalariado) {
			Assalariado a = (Assalariado) f;
			a.setSalarioSemanal(1_200.00);
		}
		System.out.println(f);
	}

}
