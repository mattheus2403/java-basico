package collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {	
	//atributo
	List <Item> listaCarrinho;

	//contrutor
	public CarrinhoDeCompras() {
	super();
	this.listaCarrinho = new ArrayList<>();
}
	
	//m�todos
	public void adicionarItem(String nome, double valor, int quantidade) {
		Item item = new Item(nome, valor, quantidade);
		this.listaCarrinho.add(item);
	}
	
	public void removerItem(String nome) {
		List <Item> itemParaRemover = new ArrayList<>();
		if (!listaCarrinho.isEmpty()) {
			for(Item i : listaCarrinho) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					itemParaRemover.add(i);
				}
			}
			listaCarrinho.removeAll(itemParaRemover);
		}
		else {
			System.out.println("Lista Vazia");
		}
	}
		

	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!listaCarrinho.isEmpty()) {
			for(Item i : listaCarrinho) {
				double valorItem = i.getValor() * i.getQuantidade();
				valorTotal += valorItem; 
			}
			return valorTotal;
		}
		else {
			throw new RuntimeException("Lista Vazia");
		}		
	}
	
	public void exibirItens() {
		if (!listaCarrinho.isEmpty()) {
			System.out.println(this.listaCarrinho);
		}
		else {
			System.out.println("Lista Vazia");
		}
	}
	
	//toString
	@Override
	public String toString() {
		return "CarrinhoDeCompras [listaCarrinho=" + listaCarrinho + "]";
	}

	//m�todo principal
	public static void main(String[] args) {
		//objeto padr�o
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		//adiciona itens
		carrinhoDeCompras.adicionarItem("Bolacha", 10d, 2);
		carrinhoDeCompras.adicionarItem("L�pis", 2d, 3);
		carrinhoDeCompras.adicionarItem("L�pis", 2d, 3);
		
		//exibe itens
		carrinhoDeCompras.exibirItens();
		
		System.out.println("");
		
		//remove itens
		carrinhoDeCompras.removerItem("L�pis");
		
		//testes
		carrinhoDeCompras.exibirItens();
		
		carrinhoDeCompras.adicionarItem("Caderno", 40d, 3);
		
		carrinhoDeCompras.exibirItens();

		//valor total da compra
		System.out.println("Valor total da compra �: " + carrinhoDeCompras.calcularValorTotal());
		
	}

}
