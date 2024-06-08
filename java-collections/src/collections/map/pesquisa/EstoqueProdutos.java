package collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

	//atributo
	private Map<Long, Produto> estoqueMap;
	
	//construtor
	public EstoqueProdutos() {
		super();
		this.estoqueMap = new HashMap<>();
	}

	//adiconar produto
	public void adiconaProduto(long cod, String nome, int quantidade, double preco) {
		estoqueMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	//exibir produtos
	public void exibirProdutos() {
		System.out.println(estoqueMap);
	}
	
	//calcula por valor total do estoque
	public Double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueMap.isEmpty()) {
			for(Produto p : estoqueMap.values()) {
				valorTotalEstoque += p.getQuantidade() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}
	
	//pesquisa por produto mais caro
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		for(Produto p : estoqueMap.values()) {
			if(p.getPreco() > maiorPreco) {
				produtoMaisCaro = p;
				maiorPreco = p.getPreco();
			}
		}
		return produtoMaisCaro;
	}

	//pesquisa por produto mais barato
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		for (Produto p : estoqueMap.values()) {
			if (p.getPreco() < menorPreco) {
				produtoMaisBarato = p;
				menorPreco = p.getPreco();
			}
		}
		return produtoMaisBarato;
	}
	
	//produto com maior quantidade no estoque
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		double maiorValorTotalProdutoEstoque = 0d;
		if (!estoqueMap.isEmpty()) {
			for (Map.Entry<Long, Produto> entry : estoqueMap.entrySet()) {
				double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
				if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
					maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
					produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
				}
			}
		}
		return produtoMaiorQuantidadeValorNoEstoque;
	}


	//método principal
	public static void main(String[] args) {
		//objeto padrão
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		//adiciona objetos
		estoqueProdutos.adiconaProduto(123, "Produto 1", 3, 10d);
		estoqueProdutos.adiconaProduto(243, "Produto 4", 2, 15d);
		estoqueProdutos.adiconaProduto(563, "Produto 2", 1, 5d);
		estoqueProdutos.adiconaProduto(223, "Produto 3", 4, 2d);

		//testes
		
		//exibe produtos
		estoqueProdutos.exibirProdutos();
		
		//exibe valor total de estoque
		System.out.println("Valor total de estoque: " + estoqueProdutos.calcularValorTotalEstoque());
		
		//exibe produto mais caro
		System.out.println("O produto mais caro é: " + estoqueProdutos.obterProdutoMaisCaro());
		
		//exibe produto mais barato
		System.out.println("O produto mais barato é: " + estoqueProdutos.obterProdutoMaisBarato());
		
		//exibe produto em maior quantidade de valor total no estoque
		System.out.println("O produto mais barato é: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}
}
