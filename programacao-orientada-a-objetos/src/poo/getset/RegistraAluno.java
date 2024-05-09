package poo.getset;

public class RegistraAluno {

	public static void main(String[] args) {
		// TODO Chamarei os objetos privados da classe Aluno
		
		@SuppressWarnings("unused")
		Aluno matheus = new Aluno();
		matheus.setIdade(23);
		matheus.setNome("Matheus Morais");
		
		System.out.println("Nome do aluno: " + matheus.getNome() + "\nIdade do aluno: " + matheus.getIdade());
	}

}
