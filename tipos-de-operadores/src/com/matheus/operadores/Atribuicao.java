package com.matheus.operadores;

public class Atribuicao {
	
	public static void main (String args[]) {
		//O operador de atribuição "=" serve para
		//definir um valor inicial de uma variável
		// ou modificar ele
		
		String nome = "Matheus";
		int numero = 123;
		numero = 321;
		nome = "José";
		
		//o valor exibido será José 321, pois o valor inicial das duas variáveis foi alterado
		//pelo operador de atribuição
		System.out.print(nome + " " + numero);
		
		//também pode ser utilizado na criação de classes objetos, como por exemplo
		/*
		 * 
		 * Date dataDeNascimento = new Date;
		 * 
		 */
				
	}
	
}
