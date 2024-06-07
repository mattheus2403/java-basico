package collections.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	//atributo
	Set<Aluno> alunoSet;

	//construtor
	public GerenciadorAlunos() {
		super();
		this.alunoSet = new HashSet<>();
	}
	
	//adiciona aluno
	public void adicionaAluno(String nome, long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}
	
	//remove aluno a partir da matricula
	public void removeAluno(long matricula) {
		Aluno alunoParaRemover = null;
		if(!alunoSet.isEmpty()) {
			for(Aluno a : alunoSet) {
				if(a.getMatricula() == matricula) {
					alunoParaRemover = a;
					alunoSet.add(alunoParaRemover);
					break;
				}
			}
			alunoSet.remove(alunoParaRemover);
		}
		else {
			System.out.println("Sem matriculas");
		}
	}
	
	//exibe alunos por nome
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		return alunosPorNome;
	}

	//exibe alunos por media
	public Set<Aluno> exibirAlunosPorMedia() {
		Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorMedia());
		alunosPorMedia.addAll(alunoSet);
		return alunosPorMedia;
	}
	
	//exibe alunos
	public void exibirAlunos(){
		System.out.println(alunoSet);
	}
	
	//método principal
	public static void main(String[] args) {
		//objeto padrão
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		//adiciona alunos
		gerenciadorAlunos.adicionaAluno("Mattheus2403", 12345, 10);
		gerenciadorAlunos.adicionaAluno("Ellon", 47502, 6.5);
		gerenciadorAlunos.adicionaAluno("Steve", 63221, 2);
		gerenciadorAlunos.adicionaAluno("Jefferson", 23466, 7);
		gerenciadorAlunos.adicionaAluno("Mariana", 12345, 5.5);
		
		//testes
		
		//exibe alunos
		gerenciadorAlunos.exibirAlunos();
		
		//exibe alunos por nome em ordem alfabetica
		System.out.println("\n" + gerenciadorAlunos.exibirAlunosPorNome() + "\n");
		
		//exibe alunos por media em ordem crescrente
		System.out.println(gerenciadorAlunos.exibirAlunosPorMedia() + "\n");
		
	}
}
