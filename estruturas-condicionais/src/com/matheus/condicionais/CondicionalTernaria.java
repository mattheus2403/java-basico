package com.matheus.condicionais;

public class CondicionalTernaria {

	public static void main(String[] args) {
		// A condicional ternaria funciona como todas
		//as demais condicionais, por�m simplificada e forma de vari�vel
		
		int nota = 7;
		
		//aqui ? representa if e : else
		//resultado � do tipo string pois retorna texto
		String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Em recupera��o" : "Reprovado";
		
		System.out.println(resultado);

	}

}
