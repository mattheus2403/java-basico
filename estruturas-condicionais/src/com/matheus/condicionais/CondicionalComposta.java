package com.matheus.condicionais;

public class CondicionalComposta {

	public static void main(String[] args) {
		//uma condicional composta poder compor mais de
		//um retorno mesmo que não seja verdadeiro
		
		int idade = 11;
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		}
		
		//retorna que a idade da pessoa não atingiu a maioridade
		else {
			System.out.println("Você é menor de idade");
		}

	}

}
