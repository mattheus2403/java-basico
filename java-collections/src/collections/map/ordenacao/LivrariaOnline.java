package collections.map.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class LivrariaOnline {

	//atributo
	Map<String, Livro> livrariaMap;
	
	//construtor
	public LivrariaOnline() {
		super();
		this.livrariaMap = new HashMap<>();
	}
	
	//adiciona livro
	public void adicionarLivro(String link, Livro livro) {
		livrariaMap.put(link, livro);
	}
	
	//remove livro
	public void removeLivro(String titulo) {
	    List<String> chavesRemover = new ArrayList<>();
	    for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
	      if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
	        chavesRemover.add(entry.getKey());
	      }
	    }
	    for (String chave : chavesRemover) {
	    	livrariaMap.remove(chave);
	    }
	}
	
	//exibir livros por ordem crescente de preco
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {

		List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrariaMap.entrySet());

		Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

		Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
			livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
		}

		return livrosOrdenadosPorPreco;
	}

	//pesquisa livros por autor
	public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrariaMap.entrySet());

		Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

		Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
			livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
		}

		return livrosOrdenadosPorAutor;
	}
	
	//obtém livro mais caro
	  public List<Livro> obterLivroMaisCaro() {
		    List<Livro> livrosMaisCaros = new ArrayList<>();
		    double precoMaisAlto = Double.MIN_VALUE;

		    if (!livrariaMap.isEmpty()) {
		      for (Livro livro : livrariaMap.values()) {
		        if (livro.getPreco() > precoMaisAlto) {
		          precoMaisAlto = livro.getPreco();
		        }
		      }
		    } else {
		      throw new NoSuchElementException("A livraria está vazia!");
		    }

		    for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
		      if(entry.getValue().getPreco() == precoMaisAlto) {
		        Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
		        livrosMaisCaros.add(livroComPrecoMaisAlto);
		      }
		    }
		    return livrosMaisCaros;
		  }
	
	//obtém livro mais barato
	  public List<Livro> obterLivroMaisBarato() {
		    List<Livro> livrosMaisBaratos = new ArrayList<>();
		    double precoMaisBaixo = Double.MAX_VALUE;

		    if (!livrariaMap.isEmpty()) {
		      for (Livro livro : livrariaMap.values()) {
		        if (livro.getPreco() < precoMaisBaixo) {
		          precoMaisBaixo = livro.getPreco();
		        }
		      }
		    } else {
		      throw new NoSuchElementException("A livraria está vazia!");
		    }

		    for(Map.Entry<String, Livro> entry: livrariaMap.entrySet()) {
		      if(entry.getValue().getPreco() == precoMaisBaixo) {
		        Livro livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
		        livrosMaisBaratos.add(livroComPrecoMaisAlto);
		      }
		    }
		    return livrosMaisBaratos;
		  }
	
	//método principal
	public static void main(String[] args) {
		//objeto padrão
		LivrariaOnline livrariaOnline = new LivrariaOnline();
		
		//adiciona livros
	    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
	    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
	    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
	    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
	    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
	    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));
	    
	    //remove livro
	    livrariaOnline.removeLivro("1984");
	
	    //exibe livros ordenados por preco
	    System.out.println("Livros ordenado por preco:\n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());
	    
	    //exibe livros ordenados por autor
	    System.out.println("Livros ordenado por autor:\n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());
		
	    //obtem o livro mais caro
	    System.out.println("Livro mais caro:\n" + livrariaOnline.obterLivroMaisCaro());

	    //obtem o livro mais barato
	    System.out.println("Livro mais barato:\n" + livrariaOnline.obterLivroMaisBarato());
	    
	}
	
}
