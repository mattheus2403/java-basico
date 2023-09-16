package com.matheus.forlaco;

public class LacoForEach {

	public static void main(String[] args) {
		// O laço for each (para cada) é geralmente voltado
		//e recomendado para estruturas de repetição
		//que envolvam uso de arrays ou coleções
		//ele também funciona de forma abreviada
		//em relação ao for normal com arrays
		
		String alunos[] = {"Matheus", "Alessandro", "João", "Maria"};
		
		//aluno irá repetir até atravessar cada aluno dentro do array
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
