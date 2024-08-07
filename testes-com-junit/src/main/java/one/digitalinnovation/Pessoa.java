package one.digitalinnovation;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String nome;
	private LocalDateTime nascimento;
	
	public Pessoa(String nome, LocalDateTime nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getNascimento() {
		return nascimento;
	}
	
	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(nascimento, LocalDateTime.now());
	}
	
	public boolean maiorDeIdade() {
		return getIdade() >= 18;
	}
	
}
