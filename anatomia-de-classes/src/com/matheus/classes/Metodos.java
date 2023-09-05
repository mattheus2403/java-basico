package com.matheus.classes;

public class Metodos {

	public static void main(String[] args) {
		
		//declarando valores do m�todo
		String primeiroNome = "Matheus";
		String segundoNome = "Morais";
		
		//vari�vel que ir� chamar o m�todo.
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.print(nomeCompleto);
		
	}
	
	//declara��o do m�todo
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		
		//o que ser� retornado e a concatena��o das duas vari�veis
		return primeiroNome.concat(" ").concat(segundoNome);
	}

}
