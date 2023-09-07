package com.matheus.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		//operadores relacionais tendem a ser usados como comparadores
		//de variáveis ou valores, seja pra ver se são iguais, maiores
		//menores ou diferentes, geralmente usados em tomada de decisão
		
		int num1 = 1;
		int num2 = 2;
		
		//menor que
		// vai imprimir
		if (num1 < num2) {
			System.out.println("O número 1 é menor que o número 2");
		}
		
		// maior que
		// não vai imprimir
		if (num1 > num2) {
			System.out.println("O número 1 é maior que o número 2");
		}
		
		//menor ou igual a
		// vai imprimir
		if (num1 <= num2) {
			System.out.println("O número 1 é menor ou igual a número 2");
		}
		
		// maior ou igual a
		// não vai imprimir
		if (num1 >= num2) {
			System.out.println("O número 1 é maior ou igual a número 2");
		}
		
		//igual
		// não vai imprimir
		if (num1 == num2) {
			System.out.println("O número 1 é igual ao número 2");
		}
		
		//diferente
		// vai imprimir
		if (num1 != num2) {
			System.out.println("O número 1 é diferente do número 2");
		}
		
		/////////////////////////////////
		
		//exemplo extenso
		
		
		System.out.println("");
		
		boolean simNao = num1 <= num2;
		
		System.out.println("Número 1 é menor ou igual ao número 2? " + simNao);
		
		simNao = num1 >= num2;
		
		System.out.println("Número 1 é maior ou igual ao número 2? " + simNao);
		
		///////////////////////////////
		
		//para Strings utilizamos o comando equals
		
		String nome1 = "Matheus";
		String nome2 = new String("Matheus");
		
		//equals compara para ver se ambos são iguais
		System.out.println("Nome 1 é igual a nome 2? " + nome1.equals(nome2));

	}
	
}
