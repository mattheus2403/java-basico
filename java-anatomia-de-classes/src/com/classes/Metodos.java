package com.classes;

public class Metodos {

	public static void main(String[] args) {
		
		//declarando valores do método
		String primeiroNome = "Matheus";
		String segundoNome = "Morais";
		
		//variável que irá chamar o método.
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		System.out.print(nomeCompleto);
		
	}
	
	//declaração do método
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		
		//o que será retornado e a concatenação das duas variáveis
		return primeiroNome.concat(" ").concat(segundoNome);
	}

}
