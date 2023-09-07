package com.matheus.operadores;

public class Logicos {

	public static void main(String[] args) {

//		Operadores lógicos utilizam da tabela verdade para definir se algo é
//		verdadeiro ou falso com o uso do e, ou e não
//		ex: v e v = verdade, v e f = falso, f e f = falso
//		ex: v ou v = verdade, v e f = verdade, f e f = falso
//		ex: v não = falso, f não = verdade
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		// não irá aparecer, pois a resposta não é verdadeira, já 
		// que as duas condições tem que ser verdadeiras para dar verdadeira
		// por causa do "E" logo a mensagem não é impressa
		if (condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeiras");
		}
		
		// agora sim irá funcionar, pois a segunda condição foi trocada
		// para uma nova condição verdadeira, que torna o operador E verdadeiro
		if (condicao1 && (10 > 9)) {
			System.out.println("As duas condições são verdadeiras");
		}
		
		System.out.println("FIM");
		
		//essa será impressa, pois com o operador OU resulta em verdadeiro
		if (condicao1 || condicao2) {
			System.out.println("Pelo menos uma condição é verdadeira");
		}

	}

}
