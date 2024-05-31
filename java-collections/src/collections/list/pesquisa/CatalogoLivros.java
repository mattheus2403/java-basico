package collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	//atributo
	List<Livro> listaLivros;

	//construtor
	public CatalogoLivros() {
		super();
		this.listaLivros = new ArrayList<>();
	}

	//adiciona livros
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
		Livro livro = new Livro(titulo, autor, anoPublicacao);
		listaLivros.add(livro);
	}

	//pesquisa por autor e mostra todos os livros relacionados
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!listaLivros.isEmpty()) {
			for(Livro l : listaLivros) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
			return livrosPorAutor;
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}
	}
	
	//retorna pesquisa por intervalo de anos
	public List <Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
		if(!listaLivros.isEmpty()) {
			for(Livro l : listaLivros) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloDeAno.add(l);
				}
			}
			return livrosPorIntervaloDeAno;
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}
	}
	
	//retorna pesquisa por t�tulo mostrando apenas o primeiro da lista mesmo tendo t�tulo duplicado
	public List <Livro> pesquisarPorTitulo(String titulo){
		List<Livro> livroPorTitulo = new ArrayList<>();
		if(!listaLivros.isEmpty()) {
			for(Livro l : listaLivros) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo.add(l);
					break; //interrompe o la�o para s� adicionar o primeiro livro
				}
			}
			return livroPorTitulo;
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}
	}
	
	//m�todo principal
	public static void main(String[] args) {
		//objeto padr�o
		CatalogoLivros catalogo = new CatalogoLivros();
		
		//adiciona livros
		catalogo.adicionarLivro("Microsservi�os Prontos Para a Produ��o", "Susan J. Fowler", 2017);
		catalogo.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
		catalogo.adicionarLivro("C�digo Limpo", "Mattheus2403", 2024);
		catalogo.adicionarLivro("C�digo Limpo", "Robert C. Martin", 2009);
		catalogo.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
		
		//pesquisa por autor
		System.out.println("Por autor: " + catalogo.pesquisarPorAutor("Robert C. Martin"));
		
		//pesquisa por intervalo de ano
		System.out.println("\nPor intervalo de anos: " + catalogo.pesquisarPorIntervaloAnos(2012, 2023));
		
		//pesquisa por titulo (apenas o primeiro inserido na lista)
		System.out.println("\nPor titulo: " + catalogo.pesquisarPorTitulo("C�digo Limpo"));
	}
}

