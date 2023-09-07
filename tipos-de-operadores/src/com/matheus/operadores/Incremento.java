package com.matheus.operadores;

public class Incremento {
	
	public static void main (String args[]) {
		
		//variáveis de incremento pode aumentar ou diminuir um valor
		//costumam ser utilizados em laços de repetição para aumentar
		//um número ou diminuir uma certa quantidade de vezes num proporção especifica
		
		int num = 3;
		
		//aumenta o número 3 para 4
		//equivale a escrever numero = numero + 1;
		num ++;
		
		System.out.println(num);
		
		//diminui o número 4 para 3
		// equivale a escrever num = num - 1;
		num --;
		
		System.out.println(num);
		
		////////////////////////////////////////////////////////
		
		//irá aumentar o número 3 pra 4 no próximo print
		System.out.println(num ++);
		
		//aumenta o 3 pra 4;
		System.out.println(num);
		
		//////////////////////////////////////////////////
		
		//aumenta o 4 pra 5 diretamente e não na próxima
		System.out.println(++ num);
		
		///////////////////////////////////////////////
		
		//irá diminuir o número 5 pra 4 no próximo print
		System.out.println(num --);
		
		//diminuir o 5 pra 4;
		System.out.println(num);
		
		//////////////////////////////////////////////
		
		//diminuir o 4 pra 3 diretamente e não na próxima
		System.out.println(-- num);
		
		
	}
	
}
