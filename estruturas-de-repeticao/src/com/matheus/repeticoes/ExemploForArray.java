package com.matheus.repeticoes;

public class ExemploForArray {

	public static void main(String[] args) {
		// exemplo do laço for utilizando arrays
		
		//define em que posição do array começando do 0 cada fruta estatá
		String frutas [] = {"Maçã", "Uva", "Pêssego", "Melância"};
		
		//conta a partir de 0 pois arrays começam em 0
		for (int x = 0; x < frutas.length; x++) { //frutas.legnth é o tamanho total do array frutas
			
			//Aqui ele imprime o nome de cada fruta em seu respectivo indice, indicado pelo x
			System.out.println("A fruta no índice " + x + " é " + frutas[x]);
		}
	}

}
