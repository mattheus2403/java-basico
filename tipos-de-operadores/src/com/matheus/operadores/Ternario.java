package com.matheus.operadores;

public class Ternario {

	public static void main(String[] args) {
//		é como um comando de decisão if else só que feito
//		apenas em uma única linha
//		é representado por "?" e ":"
		
		int a, b;

		a = 5;
		b = 6;

		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
		*/

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String resultado = (a!=b) ? "verdadeiro" : "false";

		System.out.println(resultado);

	}

}
