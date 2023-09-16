package com.matheus.whilelaco;

import java.util.Random; //escolhe valores aleatórios

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		//do while faz uma ação mesmo que apenas
		//uma única vez até que uma condição seja satisfeita
		//nesse exemplo a porta é batida até que alguém abra a porta
		
		System.out.println("Alguém bate a porta");
		
		do {
			System.out.println("TOC! TOC!");
		}
		while(batendo()); {
			
			System.out.println("Abriu a porta");
			
		}

	}
	
	private static boolean batendo() {
		boolean abriu = new Random().nextInt(3)==1;
		System.out.println("Abriu? " + abriu);
		//negando o ato de continuar batendo
		return ! abriu;
	}
}
