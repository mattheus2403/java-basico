package com.matheus.selecao;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	
	//TODO aqui criarei alguns m�todos para valida��o, analisar
	//selecionar, imprimir e ligar para candidatos

	
	//M�TODO PRINCIPAL
	public static void main(String[] args) {
		
		//Chamada dos primeiros m�todos comentados
//		analisarCandidato(1900.0);
//		analisarCandidato(2000.0);
//		analisarCandidato(2200.0);
		
//		selecaoCandidatos();
		
//		imprimirSelecionados();
		
		//Percorre o la�o selecionando cada um dos candidatos
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO"};
		for (String candidato : candidatos) {
			//chama o m�todo que entrar� em contato com o respectivo candidato do array
			entrandoEmContato(candidato);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////
	
	//M�TODOS DE CONTATO
	
	//M�todo que entra em contato com o candidato
	static void entrandoEmContato(String candidato) {
		//variaveis iniciais
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		//verifica se usuario atendeu, se n�o atender ele continua tentando
		//at� que o n�mero de tentativas realizadas seja = 3
		do {
			//checa m�todo atender e associa a variavel atendeu
			atendeu = atender();
			//se atender deu false, n�o atendeu, ent�o continua tentando
			continuarTentando = !atendeu;
			//se continuar tentando, soma 1 tentativa
			if (continuarTentando) {
				tentativasRealizadas++;
			}
			//se n�o continuar tentanto (false), contato realizado
			else {
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			}
		//se contato realizado e tentativas for menor que tr�s, repete o la�o
		}while(continuarTentando && tentativasRealizadas < 3);
		
		//se atendeu (true)contato bem sucedido, exibe o candidato e n�mero de tentativas 
		if (atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "� TENTATIVA");
		}
		else {
		//se n�o atendeu e o n�mero de tentativas chegou no m�ximo,
		//falha no contato, exibe o candidato e o limite m�ximo de tentativas
			System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
		}
	}
	
	//M�todo que define aleatoriamente se o candidato atendeu a liga��o
	static boolean atender() {
		//se entre 1 e 3 o n�mero 1 for selecionado aleatoriamente 
		//indica que o candidato atendeu
		return new Random().nextInt(3)==1;
	}
	
	//////////////////////////////////////////////////////////////
	
	//M�TODO DE IMPRESS�O DOS CANDIDATOS
	static void imprimirSelecionados() {
		//lista de candidatos
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO"};
		
		//imprime os candidatos e seu n�mero no indice do array + 1 para come�ar do 1
		System.out.println("Imprimindo a lista de candidatos informando o ind�ce do elemento");
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de n�mero: " + (i+1) + " � " + candidatos[i]);
		}
		//imprime os candidatos selecionados de forma simplificada sem o indice do array
		System.out.println("Forma Simplificada ForEach");
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
	}
	
	///////////////////////////////////////////////////////////////////////
	
	//M�TODOS DE SELE��O DOS CANDIDATOS
	
	//M�todo que define os candidatos chamados para a vaga com base na pretencao salarial
	static void selecaoCandidatos() {
		//cria uma lista de candidatos
		String candidatos[] = {"FELIPE","MARCIA","PAULO","ALGUSTO","FABRICIO","MIRELA","DANIELA","JORGE"};
		
		//variaveis iniciais
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		//enquanto o numero de candidatos selecionados for menor que 5 e ainda
		//n�o ter passado todos os candidatos o programa verifica se o salario
		//base � maior ou igual ao sal�rio pretendido e se for ele � selecionado para a vaga
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
	
	//M�todo que seleciona valores entre 1800 e 2200 para salario pretendido de cada candidato
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	//////////////////////////////////////////////////////////////////
	
	//M�TODO QUE ANALISA SE DEVEM LIGAR PARA CANDIDATO BASEADO NA SUA PRETENSAO SALARIAL
	static void analisarCandidato (double salarioPretendido) {
		//sal�rio base
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
