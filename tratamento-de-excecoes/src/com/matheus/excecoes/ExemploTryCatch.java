package com.matheus.excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploTryCatch {

	public static void main(String[] args) {
		// TODO Far� a leitura de dados do usu�rio
		// e exibir� um resultado na tela
		// agora o foco � criar um tratamento para as exce��es
		// num�ricas
		
		//declara��o do bloco try
		//que ir� avaliar o funcionamento
		//da linha de c�digo at� achar uma excessao
		try {
		
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("digite seu nome");
		String nome = leitor.next();
		
		System.out.print("digite seu sobrenome");
		String sobrenome = leitor.next();
		
		System.out.print("digite sua idade");
		int idade = leitor.nextInt();
		//poderia acabar sendo digitado um caractere n�o num�rico ex.: numero por extenso
		//ou um numero real
		
		System.out.println("digite sua altura");
		double altura = leitor.nextDouble();
		//poderia acabar usando a conven��o de separar um n�mero por v�rgula
		//indo contra a conven��o americana para n�meros reais, que � a base
		//usada pelo java
		
		System.out.print("Nome: " + nome + " " + sobrenome + "\nIdade: " + idade + "\naltura: " + altura);
		
		}
		
		//catch ir� tratar a excess�o encontrada pelo try e exibir uma mensagem alternativa
		//para o usu�rio caso ele digite um ou mais caracteres n�o num�ricos
		catch(InputMismatchException e){
			System.out.print("Os campos de idade e altura devem ser num�ricos");
		}
		
	}
		
}