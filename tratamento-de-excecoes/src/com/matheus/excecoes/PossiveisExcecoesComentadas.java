package com.matheus.excecoes;

import java.util.Locale;
import java.util.Scanner;

public class PossiveisExcecoesComentadas {

	public static void main(String[] args) {
		// TODO Far� a leitura de dados do usu�rio
		// e exibir� um resultado na tela
		// por�m o foco � mostrar as poss�veis exce��es
		
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("digite seu nome");
		String nome = leitor.next();
		//poderia esquecer de informar o nome
		
		System.out.print("digite seu sobrenome");
		String sobrenome = leitor.next();
		//o mesmo poderia ocorrer aqui
		
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
	
	/* Excecoes comuns em Java:
	 * 
	 * java.lang.NullPointerException
	 * Causa: Quando tentamos obter alguma informa��o de uma vari�vel nula.
	 * 
	 * java.lang.ArithmeticException
	 * Causa: Quando tentamos dividir um valor por zero.
	 * 
	 * java.sql.SQLException
	 * Causa: Quando existe algum erro relacionado a intera��o com banco de dados.
	 * 
	 * java.io.FileNotFoundException
	 * Causa: Quando tentamos ler ou escrever em um arquivo que n�o existe.
	 * 
	 */

}
