package com.matheus.whilelaco;

import java.util.Random; //escolhe valores aleat�rios

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		//do while faz uma a��o mesmo que apenas
		//uma �nica vez at� que uma condi��o seja satisfeita
		//nesse exemplo a porta � batida at� que algu�m abra a porta
		
		System.out.println("Algu�m bate a porta");
		
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
