package com.matheus.operadores;

public class Concatenacao {
	
	public static void main (String args[]) {
		
		//além do operador "+" poder ser utilizado para
		//operações de adição, ele também pode ser usado
		//para concatenar variáveis ou valores de variáveis
		
		String nomeCompleto = "Matheus" + " " + "Morais";
		int idade = 22;
		double altura = 1.73;
		
		System.out.println("Meu nome é " + nomeCompleto + ", tenho " + idade
		+ " anos e " + altura + " de altura.");
		
	}
}
