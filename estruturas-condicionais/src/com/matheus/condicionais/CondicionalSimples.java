package com.matheus.condicionais;

public class CondicionalSimples {

	public static void main(String[] args) {
		
		//uma condicional simples toma uma decisão onde apenas retornará
		//algo se a resposta for verdadeira
		
		double saldo = 24.0;
		double valorSolicitado = 14.0;
		
		//verifica se há saldo suficiente para saque
		if (saldo > valorSolicitado) {
			saldo = saldo - valorSolicitado;
		}
		
		System.out.println("Saldo atual: " + saldo);
				

	}

}
