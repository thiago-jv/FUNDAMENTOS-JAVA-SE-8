package br.com.thiago.teste;

import br.com.thiago.ferramentas.MatematicaUtil;

public class TesteMatematica {

	public static void main(String[] args) {

		int numeroFibonacci = MatematicaUtil.calcularFibonecci(8);
		System.out.println("N�mero de Fibonacci da posi��o 8: " + numeroFibonacci);

		double areaCirculo = MatematicaUtil.calcularAreaCirculo(104.8);
		System.out.println("�rea do c�rculo: " + areaCirculo);
	}

}
