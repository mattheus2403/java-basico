package com.matheus.condicionais;

public class SwitchCase {

	public static void main(String[] args) {
		//o switch case tem a função de
		//criar cenários separados de condições
		//ou aqui casos que podem variar ou incluir
		//o exemplo a seguir será simples, mas é de uso não recomendado
		//por excesso de código
		
		String sigla = "M";
		
		switch(sigla) {
		
		// define o caso
		case "P":{ //retorna o resultado
			System.out.println("Pequeno");
			break; //isola o caso para que não se junte com outro
		}
		
		case "M": {
			System.out.println("Média");
			break;
		}
		
		case "G": {
			System.out.println("Grande");
			break;
		}
		
		//retorna algo se o caso não coincidir com nenhum acima
		default: {
			System.out.println("Indefinido");
		}
		
		}

	}

}
