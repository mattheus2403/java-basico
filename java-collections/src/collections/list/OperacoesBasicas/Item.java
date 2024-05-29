package collections.list.OperacoesBasicas;

public class Item {

	//atributos	
	private String nome;
	private double valor;
	private int quantidade;
	
	//construtor
	public Item(String nome, double valor, int quantidade) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
}
