package collections.map.ordenacao;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Livro {

	//atributos
	private String titulo;
	private String autor;
	private double preco;
	
	//construtor
	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}
	
	//getters
	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPreco() {
		return preco;
	}
	

	//toString
	@Override
	public String toString() {
		return "Livro [nome=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}

}

//comparator por preco
class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
	  @Override
	  public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
	    return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
	  }
	}

//comparator por autor
class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		// TODO Auto-generated method stub
		return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
	}
}
