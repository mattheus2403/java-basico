package poo.contrutores;

public class RegistraPessoa {

	public static void main(String[] args) {
		// TODO Aqui chamarei o método construtor
		// e seus atributos, junto do método de endereco 
		// feito com getters e setters
		
		@SuppressWarnings("unused")
		Pessoa matheus = new Pessoa("Matheus", 123);
		matheus.setEndereco("Rua daqui");
		
		System.out.println("Nome da Pessoa: " + matheus.getNome() + "\nCPF: " + matheus.getCpf() + "\nEndereço: " + matheus.getEndereco());

	}

}
