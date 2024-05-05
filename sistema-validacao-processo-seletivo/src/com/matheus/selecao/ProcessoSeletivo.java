package com.matheus.selecao;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	
	//TODO aqui criarei alguns métodos para validação, analisar
	//selecionar, imprimir e ligar para candidatos

	
	//MÉTODO PRINCIPAL
	public static void main(String[] args) {
		
		//Chamada dos primeiros métodos comentados
//		analisarCandidato(1900.0);
//		analisarCandidato(2000.0);
//		analisarCandidato(2200.0);
		
//		selecaoCandidatos();
		
//		imprimirSelecionados();
		
		//Percorre o laço selecionando cada um dos candidatos
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO"};
		for (String candidato : candidatos) {
			//chama o método que entrará em contato com o respectivo candidato do array
			entrandoEmContato(candidato);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////
	
	//MÉTODOS DE CONTATO
	
	//Método que entra em contato com o candidato
	static void entrandoEmContato(String candidato) {
		//variaveis iniciais
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		//verifica se usuario atendeu, se não atender ele continua tentando
		//até que o número de tentativas realizadas seja = 3
		do {
			//checa método atender e associa a variavel atendeu
			atendeu = atender();
			//se atender deu false, não atendeu, então continua tentando
			continuarTentando = !atendeu;
			//se continuar tentando, soma 1 tentativa
			if (continuarTentando) {
				tentativasRealizadas++;
			}
			//se não continuar tentanto (false), contato realizado
			else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		//se contato realizado e tentativas for menor que três, repete o laço
		}while(continuarTentando && tentativasRealizadas < 3);
		
		//se atendeu (true)contato bem sucedido, exibe o candidato e número de tentativas 
		if (atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "º TENTATIVA");
		}
		else {
		//se não atendeu e o número de tentativas chegou no máximo,
		//falha no contato, exibe o candidato e o limite máximo de tentativas
			System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
		}
	}
	
	//Método que define aleatoriamente se o candidato atendeu a ligação
	static boolean atender() {
		//se entre 1 e 3 o número 1 for selecionado aleatoriamente 
		//indica que o candidato atendeu
		return new Random().nextInt(3)==1;
	}
	
	//////////////////////////////////////////////////////////////
	
	//MÉTODO DE IMPRESSÃO DOS CANDIDATOS
	static void imprimirSelecionados() {
		//lista de candidatos
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO"};
		
		//imprime os candidatos e seu número no indice do array + 1 para começar do 1
		System.out.println("Imprimindo a lista de candidatos informando o indíce do elemento");
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de número: " + (i+1) + " é " + candidatos[i]);
		}
		//imprime os candidatos selecionados de forma simplificada sem o indice do array
		System.out.println("Forma Simplificada ForEach");
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
	}
	
	///////////////////////////////////////////////////////////////////////
	
	//MÉTODOS DE SELEÇÃO DOS CANDIDATOS
	
	//Método que define os candidatos chamados para a vaga com base na pretencao salarial
	static void selecaoCandidatos() {
		//cria uma lista de candidatos
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO","MIRELA","DANIELA","JORGE"};
		
		//variaveis iniciais
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		//enquanto o numero de candidatos selecionados for menor que 5 e ainda
		//não ter passado todos os candidatos o programa verifica se o salario
		//base é maior ou igual ao salário pretendido e se for ele é selecionado para a vaga
		while(candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato: " + candidato + " solicitou este valor de salário: " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.print("O candidato: " + candidato + " foi selecionado para a vaga\n");
				candidatosSelecionados++;
			}
			candidatoAtual ++;
		}
	}
	
	//Método que seleciona valores entre 1800 e 2200 para salario pretendido de cada candidato
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	//////////////////////////////////////////////////////////////////
	
	//MÉTODO QUE ANALISA SE DEVEM LIGAR PARA CANDIDATO BASEADO NA SUA PRETENSAO SALARIAL
	static void analisarCandidato (double salarioPretendido) {
		//salário base
		double salarioBase = 2000.0;
		//se o salario base for maior que o salario pretendido, ligar pro candidato
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		//se o salario base for igual que o salario pretendido, ligar com contra proposta
		else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contra-proposta");
		}
		//se o salario base for menor que o salario pretendido, esperar outro candidato
		else {
			System.out.println("Aguardando demais candidatos");
		}
	}


}
