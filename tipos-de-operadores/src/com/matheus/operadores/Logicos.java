package com.matheus.operadores;

public class Logicos {

	public static void main(String[] args) {

//		Operadores l�gicos utilizam da tabela verdade para definir se algo �
//		verdadeiro ou falso com o uso do e, ou e n�o
//		ex: v e v = verdade, v e f = falso, f e f = falso
//		ex: v ou v = verdade, v e f = verdade, f e f = falso
//		ex: v n�o = falso, f n�o = verdade
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		// n�o ir� aparecer, pois a resposta n�o � verdadeira, j� 
		// que as duas condi��es tem que ser verdadeiras para dar verdadeira
		// por causa do "E" logo a mensagem n�o � impressa
		if (condicao1 && condicao2) {
			System.out.println("As duas condi��es s�o verdadeiras");
		}
		
		// agora sim ir� funcionar, pois a segunda condi��o foi trocada
		// para uma nova condi��o verdadeira, que torna o operador E verdadeiro
		if (condicao1 && (10 > 9)) {
			System.out.println("As duas condi��es s�o verdadeiras");
		}
		
		System.out.println("FIM");
		
		//essa ser� impressa, pois com o operador OU resulta em verdadeiro
		if (condicao1 || condicao2) {
			System.out.println("Pelo menos uma condi��o � verdadeira");
		}

	}

}
