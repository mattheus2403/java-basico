package com.matheus.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		//operadores relacionais tendem a ser usados como comparadores
		//de vari�veis ou valores, seja pra ver se s�o iguais, maiores
		//menores ou diferentes, geralmente usados em tomada de decis�o
		
		int num1 = 1;
		int num2 = 2;
		
		//menor que
		// vai imprimir
		if (num1 < num2) {
			System.out.println("O n�mero 1 � menor que o n�mero 2");
		}
		
		// maior que
		// n�o vai imprimir
		if (num1 > num2) {
			System.out.println("O n�mero 1 � maior que o n�mero 2");
		}
		
		//menor ou igual a
		// vai imprimir
		if (num1 <= num2) {
			System.out.println("O n�mero 1 � menor ou igual a n�mero 2");
		}
		
		// maior ou igual a
		// n�o vai imprimir
		if (num1 >= num2) {
			System.out.println("O n�mero 1 � maior ou igual a n�mero 2");
		}
		
		//igual
		// n�o vai imprimir
		if (num1 == num2) {
			System.out.println("O n�mero 1 � igual ao n�mero 2");
		}
		
		//diferente
		// vai imprimir
		if (num1 != num2) {
			System.out.println("O n�mero 1 � diferente do n�mero 2");
		}
		
		/////////////////////////////////
		
		//exemplo extenso
		
		
		System.out.println("");
		
		boolean simNao = num1 <= num2;
		
		System.out.println("N�mero 1 � menor ou igual ao n�mero 2? " + simNao);
		
		simNao = num1 >= num2;
		
		System.out.println("N�mero 1 � maior ou igual ao n�mero 2? " + simNao);
		
		///////////////////////////////
		
		//para Strings utilizamos o comando equals
		
		String nome1 = "Matheus";
		String nome2 = new String("Matheus");
		
		//equals compara para ver se ambos s�o iguais
		System.out.println("Nome 1 � igual a nome 2? " + nome1.equals(nome2));

	}
	
}
