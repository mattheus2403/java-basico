package com.matheus.condicionais;

public class CondicionalSimples {

	public static void main(String[] args) {
		
		//uma condicional simples toma uma decis�o onde apenas retornar�
		//algo se a resposta for verdadeira
		
		double saldo = 24.0;
		double valorSolicitado = 14.0;
		
		//verifica se h� saldo suficiente para saque
		if (saldo > valorSolicitado) {
			saldo = saldo - valorSolicitado;
		}
		
		System.out.println(saldo);
				

	}

}
