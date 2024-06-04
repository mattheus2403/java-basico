package collections.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

	//atributos
	private String nome;
	private int idade;
	private double altura;
	
	//construtor
	public Pessoa(String nome, int idade, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	//método compareTo do comparable que compara idade da pessoa
	@Override
	public int compareTo(Pessoa p) {
		return Integer.compare(idade, p.getIdade());
	}

	//getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}
	
	//toString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

}

//nova classe para seguir modelo da aula para interface comparator
class ComparatorPorAltura implements Comparator<Pessoa>{

	//método compare que compara altura da pessoa
	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
}
