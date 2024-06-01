package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	//atributo
	List<Integer> numeros;

	//construtor
	public SomaNumeros() {
		super();
		this.numeros = new ArrayList<>();
	}
	
	//adiciona numero a lista
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	//soma os numeros da lista
	public int calcularSoma() {
		int soma = 0;
		for(Integer numero : numeros) {
			soma += numero;
		}
		return soma;
	}
	
	//encontra o maior número da lista
	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if(!numeros.isEmpty()) {
			for(Integer numero : numeros) {
				if(numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}
	}
	
	//encontra o menor número da lista
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if(!numeros.isEmpty()) {
			for(Integer numero : numeros) {
				if(numero <= menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}
	}
	
	//retorna numeros da lista
	public void exibirNumeros() {
		if(!numeros.isEmpty()) {
			System.out.println(this.numeros);
		}
		else {
			System.out.print("Lista Vazia");
		}
	}
	
	//metodo principal
	public static void main(String[] args) {
		//objeto padrão
		SomaNumeros somaNumeros = new SomaNumeros();
		
		//adiciona numeros
		somaNumeros.adicionarNumero(1);
		somaNumeros.adicionarNumero(1);
		somaNumeros.adicionarNumero(2);
		somaNumeros.adicionarNumero(5);

		//testes
		
		//exibe numeros
		somaNumeros.exibirNumeros();
		
		//calcula soma dos números e exibe o resultado
		System.out.println(somaNumeros.calcularSoma());
		
		//exibe maior numero da lista
		System.out.println(somaNumeros.encontrarMaiorNumero());
		
		//exibe menor numero da lista
		System.out.println(somaNumeros.encontrarMenorNumero());

	}
	
}
