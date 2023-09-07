package com.matheus.operadores;

public class Incremento {
	
	public static void main (String args[]) {
		
		//vari�veis de incremento pode aumentar ou diminuir um valor
		//costumam ser utilizados em la�os de repeti��o para aumentar
		//um n�mero ou diminuir uma certa quantidade de vezes num propor��o especifica
		
		int num = 3;
		
		//aumenta o n�mero 3 para 4
		//equivale a escrever numero = numero + 1;
		num ++;
		
		System.out.println(num);
		
		//diminui o n�mero 4 para 3
		// equivale a escrever num = num - 1;
		num --;
		
		System.out.println(num);
		
		////////////////////////////////////////////////////////
		
		//ir� aumentar o n�mero 3 pra 4 no pr�ximo print
		System.out.println(num ++);
		
		//aumenta o 3 pra 4;
		System.out.println(num);
		
		//////////////////////////////////////////////////
		
		//aumenta o 4 pra 5 diretamente e n�o na pr�xima
		System.out.println(++ num);
		
		///////////////////////////////////////////////
		
		//ir� diminuir o n�mero 5 pra 4 no pr�ximo print
		System.out.println(num --);
		
		//diminuir o 5 pra 4;
		System.out.println(num);
		
		//////////////////////////////////////////////
		
		//diminuir o 4 pra 3 diretamente e n�o na pr�xima
		System.out.println(-- num);
		
		
	}
	
}
