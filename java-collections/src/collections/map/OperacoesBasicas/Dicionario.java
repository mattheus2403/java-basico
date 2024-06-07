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
	
	//adiciona palavra ao dicion�rio
	public void adicionaPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	//remove palavra do dicion�rio pela chave palavra
	public void removePalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
		else {
			throw new RuntimeException("Conjunto vazio");
		}
	}
	
	//exibe palavras do dicion�rio
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
	
	//m�todo principal
	public static void main(String[] args) {
		//objeto padr�o
		Dicionario dicionario = new Dicionario();
		
		//adicionar palavras com defini��es ao dicion�rio
		dicionario.adicionaPalavra("Escrita", "representar por meio de caracteres ou escrita.");
		dicionario.adicionaPalavra("Leitura", "A��o de ler; ato de decifrar o conte�do escrito de algo.");
		dicionario.adicionaPalavra("Viajar", "fazer uma viagem ou viagens.");
		dicionario.adicionaPalavra("Caleidosc�pio", "Aparelho de f�sica, para obter imagens em espelhos inclinados.");
		
		//testes
		
		//exibir palavras do dicion�rio
		dicionario.exibirPalavras();
		
		//remove palavra do dicion�rio
		dicionario.removePalavra("Caleidosc�pio");
		
		//exibir palavras do dicion�rio
		dicionario.exibirPalavras();
		
		//pesquisa por palavra com sua defini��o pela chave(palavra)
		System.out.println(dicionario.pesquisaPorPalavra("Leitura"));
				

	}
}
