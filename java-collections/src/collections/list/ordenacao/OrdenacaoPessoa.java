package collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	//atributo
	List<Pessoa> pessoasList;

	//construtor
	public OrdenacaoPessoa() {
		super();
		this.pessoasList = new ArrayList<>();
	}
	
	//adiciona a lista
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoasList.add(new Pessoa(nome, idade, altura));
	}
	
	//ordena a lista por idade com comparable
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	//ordena a lista por altura com comparable
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	//método principal
	public static void main(String[] args) {
		//objeto padrão
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		//adicionando pessoas
		ordenacaoPessoa.adicionarPessoa("Mattheus2403", 23, 1.72);
		ordenacaoPessoa.adicionarPessoa("Giovanna", 25, 1.50);
		ordenacaoPessoa.adicionarPessoa("Jonas", 21, 1.72);
		ordenacaoPessoa.adicionarPessoa("Alice", 12, 1.47);
		
		//testes
		
		//exibe lista
		//System.out.println(ordenacaoPessoa.pessoasList + "\n");
		
		//exibe lista ordenada por idade
		System.out.println(ordenacaoPessoa.ordenarPorIdade() + "\n");
		
		//exibe lista ordenada por altura
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		
	
	}
}
