package com.matheus.excecoes;

import java.util.Locale;
import java.util.Scanner;

public class PossiveisExcecoesComentadas {

	public static void main(String[] args) {
		// TODO Fará a leitura de dados do usuário
		// e exibirá um resultado na tela
		// porém o foco é mostrar as possíveis exceções
		
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("digite seu nome");
		String nome = leitor.next();
		//poderia esquecer de informar o nome
		
		System.out.print("digite seu sobrenome");
		String sobrenome = leitor.next();
		//o mesmo poderia ocorrer aqui
		
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
	
	/* Excecoes comuns em Java:
	 * 
	 * java.lang.NullPointerException
	 * Causa: Quando tentamos obter alguma informação de uma variável nula.
	 * 
	 * java.lang.ArithmeticException
	 * Causa: Quando tentamos dividir um valor por zero.
	 * 
	 * java.sql.SQLException
	 * Causa: Quando existe algum erro relacionado a interação com banco de dados.
	 * 
	 * java.io.FileNotFoundException
	 * Causa: Quando tentamos ler ou escrever em um arquivo que não existe.
	 * 
	 */

}
