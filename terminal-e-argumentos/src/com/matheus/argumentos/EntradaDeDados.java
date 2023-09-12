package com.matheus.argumentos;

import java.util.Locale;
import java.util.Scanner; //importação do comando scanner

public class EntradaDeDados {

	public static void main(String[] args) {
		// aqui faremos a entrada de dados com o comando scanner

	        //criando o objeto scanner
		    //Locale.US indica a convencao americana para números decimais
	        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  
	        
	        System.out.println("Digite seu nome");
	        String nome = scanner.next();
	        
	        System.out.println("Digite seu sobrenome");
	        String sobrenome = scanner.next();

	        System.out.println("Digite sua idade");
	        int idade = scanner.nextInt();
	        
	        System.out.println("Digite sua altura");
	        double altura = scanner.nextDouble();

	        
	        //imprimindo os dados obtidos pelo usuario
	        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
	        System.out.println("Tenho " + idade + " anos ");
	        System.out.println("Minha altura é " + altura + "cm ");

	}

}
