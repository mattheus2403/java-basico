package collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	//atributo
	Set<Produto> produtoSet;

	//construtor
	public CadastroProdutos() {
		super();
		this.produtoSet = new HashSet<>();
	}
	
	//adiciona produto
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(quantidade, nome, preco, quantidade));
	}
	
	//exibe produto por nome em ordem alfab�tica
	public Set<Produto> exibirProdutosPorNome() {
		//TreeSet usado porque HashSet n�o organiza
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet); 
//		Collections.sort(produtoPorNome); nota: Collections.sort s� funciona pra cole��es do tipo List
		return produtoPorNome;
	}
	
	//exibe produto por ordem de preco crescente
	public Set<Produto> exibirProdutosPorPreco() {
		//o comparator ser� passado como argumento no lugar da cole��o
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());  
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}
	
	//m�todo principal
	public static void main(String[] args) {
		//objeto padr�o
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		//adicona produtos
		cadastroProdutos.adicionarProduto(22, "estojo", 6d, 1);
		cadastroProdutos.adicionarProduto(23, "borracha", 2d, 4);
		cadastroProdutos.adicionarProduto(33, "desejo", 15d, 7);		
		cadastroProdutos.adicionarProduto(12, "caderno", 20d, 2);
		cadastroProdutos.adicionarProduto(22, "�baco", 12d, 1); //removido por ter mesmo cod
		
		//testes
		
		//mostra todos os produtos
		System.out.println(cadastroProdutos.produtoSet + "\n");
		
		//mostra produtos em ordem alfabetica
		System.out.println(cadastroProdutos.exibirProdutosPorNome() + "\n");
		
		//mostra produtos em ordem de pre�o crescente
		System.out.println(cadastroProdutos.exibirProdutosPorPreco() + "\n");
	}
	
}
