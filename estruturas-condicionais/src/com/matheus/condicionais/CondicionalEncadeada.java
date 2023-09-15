package com.matheus.condicionais;

public class CondicionalEncadeada {

	public static void main(String[] args) {
		
		//condicionais compostas podem ter mais de uma resposta
		//além de verdadeiro e falso, com mais condições possíveis
		
		int nota = 6;
		
		if (nota >= 7) {
			System.out.println("Aprovado");
		}
		
		//cria uma condição extra caso oaluno tire entre 4 e 7
		else if (nota >= 5 && nota < 7)
		{
			System.out.println("Em Recuperação");
		}
		
		else {
			System.out.println("Reprovado");
		}

	}

}
