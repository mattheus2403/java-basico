package com.matheus.condicionais;

public class CondicionalEncadeada {

	public static void main(String[] args) {
		
		//condicionais compostas podem ter mais de uma resposta
		//al�m de verdadeiro e falso, com mais condi��es poss�veis
		
		int nota = 6;
		
		if (nota >= 7) {
			System.out.println("Aprovado");
		}
		
		//cria uma condi��o extra caso oaluno tire entre 4 e 7
		else if (nota >= 5 && nota < 7)
		{
			System.out.println("Em Recupera��o");
		}
		
		else {
			System.out.println("Reprovado");
		}

	}

}
