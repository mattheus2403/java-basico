package poo.getset;

//getters e setters permitem que se possa chamar métodos e seus atributos
//na classe principal, caso eles sejam private (privados)

public class Aluno {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
