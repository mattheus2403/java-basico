package com.matheus.condicionais;

public class SwitchCaseFuncional {

	public static void main(String[] args) {
		// exemplo de switch case funcional, onde
		// a falta do case complementa o exemplo de
		// planos de celular basic, midia e turbo
		//para que n�o se repitam impress�es
		
		String plano = "T";
		
		switch(plano) {
		
		//5GB + Whats e Insta + 100 min
		case "T":{
			System.out.println("5GB Youtube");
		}
		
		//whats e Insta + 100 min
		case "M":{
			System.out.println("Whatsapp e Instagram Gr�tis");
		}
		
		//100 min
		case "B":{
			System.out.println("100 minutos de liga��o");
			break; //break para separar do default
		}
		
		default: {
			System.out.println("Indefinido");
		}
		}

	}

}
