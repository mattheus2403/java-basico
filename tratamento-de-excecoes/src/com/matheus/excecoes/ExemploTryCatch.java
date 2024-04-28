package com.matheus.excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {

	public static void main(String[] args) {
		// TODO Fará a leitura de dados do usuário
		// e exibirá um resultado na tela
		// agora o foco é criar um tratamento para as exceções
		// numéricas
		
		//declaração do bloco try
		//que irá avaliar o funcionamento
		//da linha de código até achar uma excessao
		try {
		
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("digite seu nome");
		String nome = leitor.next();
		
		System.out.print("digite seu sobrenome");
		String sobrenome = leitor.next();
		
		System.out.print("digite sua idade");
		int idade = leitor.nextInt();
		//poderia acabar sendo digitado um caractere não numérico ex.: numero por extenso
		//ou um numero real
		
		System.out.println("digite sua altura");
		double altura = leitor.nextDouble();
		//poderia acabar usando a convenção de separar um número por vírgula
		//indo contra a convenção americana para números reais, que é a base
		//usada pelo java
		
		System.out.print("Nome: " + nome + " " + sobrenome + "\nIdade: " + idade + "\naltura: " + altura);
		
		}
		
		//catch irá tratar a excessão encontrada pelo try e exibir uma mensagem alternativa
		//para o usuário caso ele digite um ou mais caracteres não numéricos
		catch(InputMismatchException e){
			System.out.print("Os campos de idade e altura devem ser numéricos");
		}
		
	}
		
}