package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{

	//atributos
	List<Integer> numeros;

	//construtor
	public OrdenacaoNumeros() {
		super();
		this.numeros = new ArrayList<>();
	}
	
	//adiciona numeros a lista
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	//ordena numeros na ordem crescente
	public List<Integer> ordenarCrescente(){
		List<Integer> numerosPorCrescente = new ArrayList<>(numeros);
		if(!numeros.isEmpty()) {
			Collections.sort(numerosPorCrescente);
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}
		
		return numerosPorCrescente;
	}
	
	//ordena numeros na ordem descrescente
	public List<Integer> ordenarDecrescente(){
		List<Integer> numerosPorDecrescente = new ArrayList<>(numeros);
		if(!numeros.isEmpty()) {
			numerosPorDecrescente.sort(Collections.reverseOrder());
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}
		
		return numerosPorDecrescente;
	}
	
	//método principal
	public static void main(String[] args) {
		//objeto padrão
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		
		//adiciona numeros
		ordenacaoNumeros.adicionarNumero(4);
		ordenacaoNumeros.adicionarNumero(1);
		ordenacaoNumeros.adicionarNumero(3);
		ordenacaoNumeros.adicionarNumero(2);
		
		//testes
		
		//ordena numeros por ordem crescente
		System.out.println(ordenacaoNumeros.ordenarCrescente() + "\n");
		
		//ordena numeros por ordem decrescente
		System.out.println(ordenacaoNumeros.ordenarDecrescente());
				
		
	}
}
