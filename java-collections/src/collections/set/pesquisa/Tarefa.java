package collections.set.pesquisa;

public class Tarefa {

	//atributos
	private String descricao;
	private boolean concluida;
	
	//construtor
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
		this.concluida = false;
	}

	//métodos get e set
	public String getDescricao() {
		return descricao;
	}
	
	public boolean isConcluida() {
		return concluida;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	//toString
	@Override
	public String toString() {
		return descricao + ", " + concluida;
	}
	
	
}
