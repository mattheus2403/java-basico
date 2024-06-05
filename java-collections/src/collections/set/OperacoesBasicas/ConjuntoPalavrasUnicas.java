package collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	//atributo
	Set<String> palavrasUnicasSet;

	//construtor
	public ConjuntoPalavrasUnicas() {
		super();
		this.palavrasUnicasSet = new HashSet<>();
	}
	
	//adiciona palavras
	public void adicionarPalavra(String palavra) {
		palavrasUnicasSet.add(palavra);
	}
	
	//remove palavras
	public void removerPalavra(String palavra) {
		if(!palavrasUnicasSet.isEmpty()) {
			if(palavrasUnicasSet.contains(palavra)) {
				palavrasUnicasSet.remove(palavra);
			}
			else {
				System.out.println("Palavra n�o encontrada");
			}
		}
		else {
			System.out.println("Conjunto Vazio");
		}
	}
	
	//verificar se palavra est� no conjunto
	public Boolean verificarPalavra(String palavra) {
		return palavrasUnicasSet.contains(palavra);
	}
	
	//exibe palavras �nicas
	public void exibePalavrasUnicas() {
		if(!palavrasUnicasSet.isEmpty()) {
			System.out.println(palavrasUnicasSet);
		}
		else {
			System.out.println("Conjunto Vazio");
		}
	}
	
	//m�todo principal
	public static void main(String[] args) {
		//objeto padr�o
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		
		//adicionando palavras
		conjuntoPalavrasUnicas.adicionarPalavra("sumimasen");
		conjuntoPalavrasUnicas.adicionarPalavra("sugoi");
		conjuntoPalavrasUnicas.adicionarPalavra("sundeimasu");
		conjuntoPalavrasUnicas.adicionarPalavra("sayonara");
		
		//testes
		
		//exibe lista de palavras
		conjuntoPalavrasUnicas.exibePalavrasUnicas();
		
		//verifica palavra
		System.out.println("A palavra 'sayonara' est� no cojunto? " + conjuntoPalavrasUnicas.verificarPalavra("sayonara"));
		
		//remove palavras
		conjuntoPalavrasUnicas.removerPalavra("sayonara");

		//exibe lista de palavras
		conjuntoPalavrasUnicas.exibePalavrasUnicas();		
		
		//verifica palavra
		System.out.println("A palavra 'sayonara' est� no cojunto? " + conjuntoPalavrasUnicas.verificarPalavra("sayonara"));
		
	}
	
}
