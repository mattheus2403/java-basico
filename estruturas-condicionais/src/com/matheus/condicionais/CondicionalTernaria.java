package com.matheus.condicionais;

public class CondicionalTernaria {

	public static void main(String[] args) {
		// A condicional ternaria funciona como todas
		//as demais condicionais, porém simplificada e forma de variável
		
		int nota = 7;
		
		//aqui ? representa if e : else
		//resultado é do tipo string pois retorna texto
		String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Em recuperação" : "Reprovado";
		
		System.out.println(resultado);

	}

}
