package streams.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		//cria lista com numeros inteiros
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);
		
		//exemplo 1
		
		//usa consumer com express�es lambda para imprimir numeros pares
//		Consumer<Integer> imprimirNumeroPar = numero -> {
//			if(numero % 2 == 0) {
//				System.out.print(numero + " ");
//			}
//		};
		
		//usa consumer para imprimir numeros pareces na stream
//		numeros.stream().forEach(imprimirNumeroPar);
		
		//exemplo 2
		numeros.stream().forEach(new Consumer<Integer>() {

			//usa o m�todo accept da interface consumer para retornar numeros pares
			@Override
			public void accept(Integer n) { //n representa cada numero da List numeros
				if(n % 2 == 0) {
					System.out.println(n);
				}
			}
		});
	
		System.out.println("-");
		
		//exemplo 2 siimplificado
		numeros.forEach(n -> { //aqui o consumer e o stream foram removidos, agora est� usando apenas express�es lambda
				if(n % 2 == 0) {
					System.out.println(n);
				}
			}
		);

	}
}
