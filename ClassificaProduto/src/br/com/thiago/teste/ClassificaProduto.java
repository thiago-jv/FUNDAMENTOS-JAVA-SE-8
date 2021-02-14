package br.com.thiago.teste;

import java.util.Scanner;

/*
 Uma loja de ferramentas est� precisando da sua ajuda para guardar cada produto em uma gaveta numerada.

O dono da loja quer seguir uma l�gica para classificar cada produto, pois assim ele poder� ser organizar melhor.
Ele te chama para dizer que quer fazer a classifica��o pelo c�digo do produto. E come�a a te explicar como funcion�
a classifica��o.

A loja possui dois corredores, cada um com 8 gavetas. No corredor da esquerda ficar�o os produtos de c�digo �mpar e,
no corredor da direita os de c�digo par.

Cada c�digo que for divis�vel por 8 ser� armazenado na gaveta 8, os divis�veis por 7 na gaveta 7 e assim por diante.

Aten��o: Voc� n�o pode armazenar um produto em mais de uma gaveta, ent�o quando a encontrar pare de procurar. Outro
detalhe � que a pesquisa dever� ser feita contando de tr�s pra frente sen�o, todos os produtos iriam ser armazenados na gaveta 1.

Voc� ir� dizer a classifica��o para cada produto em um loop at� encontrar o c�digo 0 (zero).

1. Crie o arquivo "ClassificaProduto.java" e adicione o c�digo abaixo. Perceba que a vari�vel "codigoProduto" precisa
ser inicializada antes de entrar na estrutura "do/while".
 */

public class ClassificaProduto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int codigoProduto = 0;
		do {
			System.out.print("Digite o codigo do produto: ");
			codigoProduto = entrada.nextInt();

			if (codigoProduto != 0) {
				String corredor = (codigoProduto % 2 == 0) ? "\"direita\"" : "\"esquerda\"";

				for (int i = 8; i >= 1; i--) {
					if (codigoProduto % i == 0) {
						System.out.println("O produto de codigo: " + codigoProduto + " ficara no corredor da "
								+ corredor + " e na gaveta " + i);

						break;
					}
				}
			}
		} while (codigoProduto != 0);
		
		entrada.close();
	}
}
