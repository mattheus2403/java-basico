package com.matheus.operadores;

public class Ternario {

	public static void main(String[] args) {
//		� como um comando de decis�o if else s� que feito
//		apenas em uma �nica linha
//		� representado por "?" e ":"
		
		int a, b;

		a = 5;
		b = 6;

		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
		*/

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERN�RIO
		String resultado = (a!=b) ? "verdadeiro" : "false";

		System.out.println(resultado);

	}

}
