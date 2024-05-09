package poo.contrutores;

public class Pessoa {
	//aqui criarei os m�todos construtores, que tem a mesma fun��o dos getters
	//e setters, por�m aqui eles definem mais de um atributo num �nico construtor
	//e necessitam de ter um getter pra cada atributo
	private String nome;
	private int cpf;
	private String endereco;
	
	//o m�todo construtor carrega o mesmo nome da classe obrigatoriamente
	public Pessoa(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
		
	//getter �nico para nome
	public String getNome() {
		return nome;
	}

	//getter �nico para cpf
	public int getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
