package com.matheus.forlaco;

public class ExemploForArray {

	public static void main(String[] args) {
		// exemplo do la�o for utilizando arrays
		
		//define em que posi��o do array come�ando do 0 cada fruta estat�
		String frutas [] = {"Ma��", "Uva", "P�ssego", "Mel�ncia"};
		
		//conta a partir de 0 pois arrays come�am em 0
		for (int x = 0; x < frutas.length; x++) { //frutas.legnth � o tamanho total do array frutas
			
			//Aqui ele imprime o nome de cada fruta em seu respectivo indice, indicado pelo x
			System.out.println("A fruta no �ndice " + x + " � " + frutas[x]);
		}
	}

}
