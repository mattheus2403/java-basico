package com.matheus.variaveis;

public class TiposVariaveis {

	public static void main(String[] args) {
		//todos os tipos de variáveis numéricas e exemplos de associações válidas
		
		byte idade = 123;
		
		short ano = 2023;
		
		int cep = 13830212; //se começar com zero talvez tenha que ser outro tipo
		
		long cpf = 40837907433L; //o tipo long precisa de um L no final para não dar erro
		
		float pi = 3.14F; //Tipo float deve terminar com F para não dar erro
		
		double salario = 1320.00;
		
		
		//todos os tipos de variáveis de texto e exemplos de associações válidas
		
		char letra = 'A'; //diferente da variavel String, deve obrigatoriamente usar aspas simples
		
		String nome = "Matheus"; //permite a inserção de caracteres em forma de texto
		
		
		
		/* o caso abaixo tenta associar o valor da variável numeroCurto do tipo
		 * short a variavel numeroNormal do tipo int, porém isso geraria um erro, 
		 * pois em algum momento
		 * essa variável poderia passar do limite do short.
		 * sendo assim na associação do numeroCurto2 com o Numero normal é colocado
		 *"casting" que serve pra converter o tipo da variavel numeroNormal para short
		 */
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;

	}

}
