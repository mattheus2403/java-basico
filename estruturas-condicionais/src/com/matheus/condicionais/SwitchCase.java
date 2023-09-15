package com.matheus.condicionais;

public class SwitchCase {

	public static void main(String[] args) {
		//o switch case tem a fun��o de
		//criar cen�rios separados de condi��es
		//ou aqui casos que podem variar ou incluir
		//o exemplo a seguir ser� simples, mas � de uso n�o recomendado
		//por excesso de c�digo
		
		String sigla = "M";
		
		switch(sigla) {
		
		// define o caso
		case "P":{ //retorna o resultado
			System.out.println("Pequeno");
			break; //isola o caso para que n�o se junte com outro
		}
		
		case "M": {
			System.out.println("M�dia");
			break;
		}
		
		case "G": {
			System.out.println("Grande");
			break;
		}
		
		//retorna algo se o caso n�o coincidir com nenhum acima
		default: {
			System.out.println("Indefinido");
		}
		
		}

	}

}
