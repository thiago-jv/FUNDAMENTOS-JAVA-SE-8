package br.com.thiago.dominio;



public class Prateleira {

    /*
     Livros[][] = new Livros[3][4];
     +-----+-----+------+-----+
     | 0,0 | 0,1 |  0,2 | 0,3 |
     +-----+-----+------+-----+
     | 1,0 | 1,1 |  1,2 | 1,3 |
     +-----+-----+------+-----+
     | 2,0 | 2,1 |  2,2 | 2,3 |
     +-----+-----+------+-----+
     */

	private int linhas;
	private int colunas;
	private Livro[][]livros;
	
	 public Prateleira(int linhas, int colunas) {
		 this.linhas = linhas;
		 this.colunas = colunas;
		 this.livros = new Livro[linhas] [colunas];
	}
	 
	 public void organiza(Livro[] vetor) {
		 int celula = 0;
		 for(int i = 0; i < linhas; i++) { // percore as linhas
			 for(int j = 0; j < colunas; j++) { // percore as colunas
				 if(celula < vetor.length) {
				 System.out.printf("Linha: %d - Coluna: %d => Célula: %d \n",  i, j, celula);
				 this.livros[i][j] = vetor[celula++];
//				 celula++;
				 }// fim if
			 }// fim for
		 }// fim for
	 }// fim método organoza
	 
	 public void imprime() {
		 for(int i = 0; i < linhas; i++) { // percore as linhas
			 for(int j = 0; j < colunas; j++) { // percore as colunas
				 if(livros[i][j] != null) {
					 System.out.printf("[%-20s]", livros[i][j].getNome());		 
				 }// fim if
			 }// fim for colunas
			 System.out.println();
		 }// fim for linhas
					 
	   }// fim imprime
	 

	 public String buscarLivro(String nome) {
		 nome = nome.toUpperCase();
		 StringBuilder encontrados = new StringBuilder("Encontrados: \n");
		 for(int i = 0; i < linhas; i++) { // percore as linhas
			 for(int j = 0; j < colunas; j++) { // percore as colunas
			  if(livros[i][j] != null) {
	      	   String nomeLivro = livros[i][j].getNome().toUpperCase();
		        if(nomeLivro.contains(nome)) {
		    	   encontrados
	                    .append("Linha: ").append(i)
			            .append(" Coluna: ").append(j)
			            .append(" => ").append(nomeLivro).append("\n");			            
		       }
			  }
          	 }// fim coluna
            } // fim lina=has
		return encontrados.toString();
      }
	}

