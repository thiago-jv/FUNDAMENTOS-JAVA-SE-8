package br.com.thiago.teste;

public class TestePromocao {

	// classe main
	public static void main(String[] args) {
	    
		// ____________________ tamanho(bits)________(faixa)_______
		// byte suporta até     8 bits       =        -128 a 127
		byte b = 100; // 8bits
		
		// ____________________ tamanho(bits)________(faixa)_______
		// short suporta até     16 bits     =   -32.768 a 32.767
		short s = b;  // 100 promovido para 16bits
		
		// ____________________ tamanho(bits)________(faixa)_______
		// int suporta até     32 bits     =   -231³¹ a 231³¹
		int i = s;    // 100 promovido para 32 bits
		
		// ____________________ tamanho(bits)________(faixa)___________________
		// int suporta até     64 bits     =   -2 elevado a 63 a 2 elevado a 63
		long l = i;   // 100 promovido para 64 bits
		System.out.println(l);

	}// fim main
}// fim classe