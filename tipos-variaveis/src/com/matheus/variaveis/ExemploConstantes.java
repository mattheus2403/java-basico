package com.matheus.variaveis;

public class ExemploConstantes {

	public static void main(String[] args) {
		
		/* Constantes ao contrário de variáveis são valores imutáveis
		 * valores que não podem ser alterados, abaixo há um exemplo de uma
		 * constante sendo utilizada
		 */
		
		
		 // esta linha é considerada como declaração de variável iniciamos a existência
		 // variavel numero com valor 5 regra: tipo + nome + valor
		 
		int numero = 5;

		
		 //na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 //não é mais necessário, pois a variável já foi declarada anteriormente
	
		numero = 10;

		System.out.print(numero);
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
		
		//Esta linha vai apresentar erro de compilação já que não podemos alterar uma constante
		VALOR_DE_PI=3.15; 
		
	}

}
