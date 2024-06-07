package collections.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{

	//atributos
	private long cod;
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtor
	public Produto(long cod, String nome, double preco, int quantidade) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	//métodos get
	public long getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	//toString
	@Override
	public String toString() {
		return cod + ", " + nome + ", " + preco + ", " + quantidade;
	}

	//equals e hashcode para que código não seja repetido
	
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Produto)) {
			return false;
		}
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	//compareTo (compara os valores em ordem alfabetica pelo nome
	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
	
}

//implementação do comparator
class ComparatorPorPreco implements Comparator<Produto> {

	//faz a comparação por texto
	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
