package collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	//atributo
	private Map<String, Integer> contPalavraSet;

	//construtor
	public ContagemPalavras() {
		this.contPalavraSet = new HashMap<>();
	}
	
	//adiciona palavra a contagem
	public void adicionarPalavra(String palavra, Integer contagem) {
		contPalavraSet.put(palavra, contagem);
	}
	
	//remove palavra da contagem se estiver presente
	public void removePalavra(String palavra) {
		if(!contPalavraSet.isEmpty()) {
			contPalavraSet.remove(palavra);
		}
	}
	
	//exibe todas as palavras com sua respectiva contagem
	public int exibeContagemDePalavras() {
		int contagemTotal = 0;
		for(int contagem : contPalavraSet.values()) {
			contagemTotal += contagem;
		}
		return contagemTotal;
	}
	
	//encontra palavras mais frequentes na contagem e retorna com seu respectivo nome
	public String encontrarPalavraMaisFrequente() {
		String palavraMaisFrequente = null;
		int maiorContagem = 0;
		for(Map.Entry<String, Integer> entry : contPalavraSet.entrySet()) {
			if (entry.getValue() > maiorContagem) {
				maiorContagem = entry.getValue();
				palavraMaisFrequente = entry.getKey();
			}
		}	
		return palavraMaisFrequente;
	}

	//método principal
	public static void main(String[] args) {
		//objeto padrão
		ContagemPalavras contagemPalavras = new ContagemPalavras();
		contagemPalavras.adicionarPalavra("Eu", 2);
		contagemPalavras.adicionarPalavra("Você", 3);
		contagemPalavras.adicionarPalavra("Nós", 4);
		contagemPalavras.adicionarPalavra("Eles", 1);
		
		//testes
		
		//exibe todas as palavras com suas contagens
		contagemPalavras.exibeContagemDePalavras();
		
		//remove palavra
		contagemPalavras.removePalavra("Você");
		
		//exibe todas as palavras com suas contagens
		System.out.println("Existem " + contagemPalavras.exibeContagemDePalavras() + " palavras");
		
		//exibe a palavra com a contagem mais frequente
		String pronomeFrequente = contagemPalavras.encontrarPalavraMaisFrequente();
		System.out.println("A palavra com a contagem mais frequente é: " + pronomeFrequente);
	}
}
