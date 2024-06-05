package collections.set.pesquisa;

import java.util.Objects;

public class Contato {

	//atributos
	private String nome;
	private int numero;
	
	//construtor
	public Contato(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	//métodos get
	public String getNome() {
		return nome;
	}
	public int getNumero() {
		return numero;
	}
	
	//set exclusivo para método do método que atualiza o numero de contato
	public void setNumero(int numero) {
		this.numero = numero;
	}

	//toString
	@Override
	public String toString() {
		return nome + ", " + numero;
	}

	
	//equals e hashCode para checar se há contatos com o mesmo nome e permitir apenas contatos com esse nome
	//a serem adicionados na lista
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Contato)) {
			return false;
		}
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
