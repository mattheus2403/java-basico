package poo.contrutores;

public class Pessoa {
	//aqui criarei os métodos construtores, que tem a mesma função dos getters
	//e setters, porém aqui eles definem mais de um atributo num único construtor
	//e necessitam de ter um getter pra cada atributo
	private String nome;
	private int cpf;
	private String endereco;
	
	//o método construtor carrega o mesmo nome da classe obrigatoriamente
	public Pessoa(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
		
	//getter único para nome
	public String getNome() {
		return nome;
	}

	//getter único para cpf
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
