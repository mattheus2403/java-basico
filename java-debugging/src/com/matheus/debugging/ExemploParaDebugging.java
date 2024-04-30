package com.matheus.debugging;

public class ExemploParaDebugging {

	public static void main(String[] args) {
		// TODO Exemplo simples com métodos
		// para a aula de debugging
		
		System.out.print("inicio do programa\n");
		
		a();
		
		System.out.print("fim do programa");

	}
	
	static void a() {
		System.out.print("inicio do bloco a\n");
		b();
		System.out.println("fim do bloco a");
	}
	
	static void b() {
		System.out.print("inicio do bloco b\n");
		for(int x = 1; x <= 5; x++)
			System.out.println(x);
		c();
		System.out.println("fim do bloco b");
	}
	
	static void c() {
		System.out.print("inicio do bloco c\n");
		System.out.println("fim do bloco c");
	}

}
