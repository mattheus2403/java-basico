package com.matheus.selecao;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		analisarCandidato(1900.0);
//		analisarCandidato(2000.0);
//		analisarCandidato(2200.0);
		
//		selecaoCandidatos();
		
		imprimirSelecionados();
	}
	
	static void imprimirSelecionados() {
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o ind�ce do elemento");
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de n�mero: " + (i+1) + " � " + candidatos[i]);
		}
		
		System.out.println("Forma Simplificada ForEach");
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato: " + candidato + " solicitou este valor de sal�rio: " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.print("O candidato: " + candidato + " foi selecionado para a vaga\n");
				candidatosSelecionados++;
			}
			candidatoAtual ++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato (double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contra-proposta");
		}
		else {
			System.out.println("Aguardando demais candidatos");
		}
	}


}
