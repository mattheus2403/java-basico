package collections.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

	//atributos
	private String nome;
	private long matricula;
	private double media;
	
	//construtor
	public Aluno(String nome, long matricula, double media) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}
	
	//métodos get
	public String getNome() {
		return nome;
	}


	public long getMatricula() {
		return matricula;
	}


	public double getMedia() {
		return media;
	}	
	
	//toString
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", media=" + media + "]";
	}
	
	//equals e hashcode para matricula não ser repetida
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Aluno)) {
			return false;
		}
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}

	//compareTo para comparar nomes
	@Override
	public int compareTo(Aluno a) {
		return nome.compareTo(a.getNome());
	}
}

//comparator para comparar medias dos alunos
class ComparatorMedia implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getMedia(), a2.getMedia());
	}
	
}
