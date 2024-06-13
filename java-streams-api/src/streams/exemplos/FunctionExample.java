package streams.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

public class FunctionExample {

	public static void main(String[] args) {
		// Criar uma lista de números inteiros
	    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
	    
	    // Usar function com lambda para dobrar os numeros da List
	    Function<Integer, Integer> dobrar = numero -> numero * 2;
	    
	    // Usar a function para dobrar todos os numeros na stream e armazenar eles em outra lista
	    List<Integer> numerosDobrados = numeros.stream()
	    .map(dobrar) //pega o dobrar de function
	    //com lambda e sem function de forma direta: .map(n -> n * 2)
	    .toList();
	    
	    // Imprimir a lista de números dobrados
	    numerosDobrados.forEach(System.out::println);
	}
	
	

}
