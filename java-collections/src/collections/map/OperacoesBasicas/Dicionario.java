package collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;


public class Dicionario {

	//atributo
	Map<String, String> dicionarioMap;

	//construtor
	public Dicionario() {
		super();
		this.dicionarioMap = new HashMap<>();
	}
	
	//adiciona palavra ao dicionário
	public void adicionaPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	//remove palavra do dicionário pela chave palavra
	public void removePalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
		else {
			throw new RuntimeException("Conjunto vazio");
		}
	}
	
	//exibe palavras do dicionário
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	
	//pesquisa por palavra
	public String pesquisaPorPalavra(String palavra) {
		String dicionarioPorPalavra = null;
		if(!dicionarioMap.isEmpty()) {
			dicionarioPorPalavra = dicionarioMap.get(palavra);
		}
		return palavra + ": " + dicionarioPorPalavra;
	}
	
	//método principal
	public static void main(String[] args) {
		//objeto padrão
		Dicionario dicionario = new Dicionario();
		
		//adicionar palavras com definições ao dicionário
		dicionario.adicionaPalavra("Escrita", "representar por meio de caracteres ou escrita.");
		dicionario.adicionaPalavra("Leitura", "Ação de ler; ato de decifrar o conteúdo escrito de algo.");
		dicionario.adicionaPalavra("Viajar", "fazer uma viagem ou viagens.");
		dicionario.adicionaPalavra("Caleidoscópio", "Aparelho de física, para obter imagens em espelhos inclinados.");
		
		//testes
		
		//exibir palavras do dicionário
		dicionario.exibirPalavras();
		
		//remove palavra do dicionário
		dicionario.removePalavra("Caleidoscópio");
		
		//exibir palavras do dicionário
		dicionario.exibirPalavras();
		
		//pesquisa por palavra com sua definição pela chave(palavra)
		System.out.println(dicionario.pesquisaPorPalavra("Leitura"));
				

	}
}
