package com.matheus.operadores;

public class Negacao {

	public static void main(String[] args) {
		
		//o operador de nega��o ! inverte valores booleanos, seja
		//de false pra true ou true pra false
		
		boolean variavel = true;
		
		// true passa a ser false apenas nessa impress�o
		System.out.println(!variavel);
		
		// true volta a ser true
		System.out.println(variavel);
		
		// inverte o valor da variavel de true para false at� que seja revertido a true
		variavel = !variavel;
		
		// agora imprimira false
		System.out.println(variavel);
		
	}

}
