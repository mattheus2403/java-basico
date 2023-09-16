package com.matheus.repeticoes;

public class LacoForEach {

	public static void main(String[] args) {
		// O la�o for each (para cada) � geralmente voltado
		//e recomendado para estruturas de repeti��o
		//que envolvam uso de arrays ou cole��es
		//ele tamb�m funciona de forma abreviada
		//em rela��o ao for normal com arrays
		
		String alunos[] = {"Matheus", "Alessandro", "Jo�o", "Maria"};
		
		//aluno ir� repetir at� atravessar cada aluno dentro do array
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
