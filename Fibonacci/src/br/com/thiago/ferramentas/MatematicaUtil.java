package br.com.thiago.ferramentas;

public class MatematicaUtil {
	
	public static final double PI = 3.14;

	public static int calcularFibonecci(int posicao) {
		if (posicao < 2) {
			return posicao;
		}
		return calcularFibonecci(posicao - 1) + calcularFibonecci(posicao - 2);
	}
	
	public static double calcularAreaCirculo(double raio) {
		// area eh igual ao raio ao quadrado multiplicado por Pi
		double area = raio * raio * MatematicaUtil.PI;
		return area;
	}

}
