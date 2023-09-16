package com.matheus.forlaco;

public class ExemploForBreakContinue {

	public static void main(String[] args) {
		// neste exemplo o uso do break e do continue
		// no laço for terão a função de parar em um 
		// determinado número da contagem
		// break para e encerra no anterior, e continue 
		// pula o número que parou
		
		for (int num = 1; num <= 10; num++) {
			if (num == 5) {
				break; //ao chegar no 5 ele para no 4.
			}
			System.out.println(num);
		}
		
		System.out.println("--------"); //divisor
		
		for (int num2 = 1; num2 <= 10; num2++) {
			if (num2 == 5) {
				continue; //ao chegar no 5 ele pula pro 6 e continua.
			}
			System.out.println(num2);
		}

	}

}
