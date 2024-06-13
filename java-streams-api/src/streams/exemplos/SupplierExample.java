package streams.exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExample {

	public static void main(String[] args) {
		//Usar o supplier com expressão lambda para fornecer saudação personalizada
		Supplier<String> saudacao = () -> "Seja bem-vindo"; // sem argumentos como foi citado por isso o () vazio
		
		//Usar o supplier para obter uma lista com 5 saudações
		List<String> listaSaudacoes = Stream.generate(saudacao)
		//alternativa com lambda: List<String> listaSaudacoes = Stream.generate(() -> "Bem vindo")
		
		.limit(5) //define quantas vezes que a saudação é impressa no console
		.toList(); //coloca cada uma das saudações dentro de uma List. 
		//alternativa: .collect(Collectors.toList());
		
		//imprime saudações geradas com method reference
		listaSaudacoes.forEach(System.out::println);
		//alternativa com lambda: listaSaudacoes.forEach(s -> System.out.println(s));
	}
}
