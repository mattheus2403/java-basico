package poo.contrutores;

public class RegistraPessoa {

	public static void main(String[] args) {
		// TODO Aqui chamarei o m�todo construtor
		// e seus atributos, junto do m�todo de endereco 
		// feito com getters e setters
		
		@SuppressWarnings("unused")
		Pessoa matheus = new Pessoa("Matheus", 123);
		matheus.setEndereco("Rua daqui");
		
		System.out.println("Nome da Pessoa: " + matheus.getNome() + "\nCPF: " + matheus.getCpf() + "\nEndere�o: " + matheus.getEndereco());

	}

}
