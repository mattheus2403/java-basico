package com.matheus.condicionais;

public class CondicionalComposta {

	public static void main(String[] args) {
		//uma condicional composta poder compor mais de
		//um retorno mesmo que n�o seja verdadeiro
		
		int idade = 11;
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
		}
		
		//retorna que a idade da pessoa n�o atingiu a maioridade
		else {
			System.out.println("Voc� � menor de idade");
		}

	}

}
