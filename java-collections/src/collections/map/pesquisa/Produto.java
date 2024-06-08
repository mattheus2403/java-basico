package collections.map.pesquisa;

public class Produto {

	//atributos
	private String nome;
	private double preco;
	private int quantidade;
	
	//construtor
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	//getters
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
		return "Produtos [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	//n�o ser� necess�rio um equals e hashcode porque as chaves de map s�o �nicas
	
	
	
}
