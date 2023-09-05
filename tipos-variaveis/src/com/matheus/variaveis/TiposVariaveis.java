package com.matheus.variaveis;

public class TiposVariaveis {

	public static void main(String[] args) {
		//todos os tipos de vari�veis num�ricas e exemplos de associa��es v�lidas
		
		byte idade = 123;
		
		short ano = 2023;
		
		int cep = 13830212; //se come�ar com zero talvez tenha que ser outro tipo
		
		long cpf = 40837907433L; //o tipo long precisa de um L no final para n�o dar erro
		
		float pi = 3.14F; //Tipo float deve terminar com F para n�o dar erro
		
		double salario = 1320.00;
		
		
		//todos os tipos de vari�veis de texto e exemplos de associa��es v�lidas
		
		char letra = 'A'; //diferente da variavel String, deve obrigatoriamente usar aspas simples
		
		String nome = "Matheus"; //permite a inser��o de caracteres em forma de texto
		
		
		
		/* o caso abaixo tenta associar o valor da vari�vel numeroCurto do tipo
		 * short a variavel numeroNormal do tipo int, por�m isso geraria um erro, 
		 * pois em algum momento
		 * essa vari�vel poderia passar do limite do short.
		 * sendo assim na associa��o do numeroCurto2 com o Numero normal � colocado
		 *"casting" que serve pra converter o tipo da variavel numeroNormal para short
		 */
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		short numeroCurto2 = (short) numeroNormal;

	}

}
