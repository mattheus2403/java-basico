package collections.list.OperacoesBasicas;

public class Tarefa {

	//atributo
	private String descricao;
	
	
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		//return "Tarefa [descricao=" + descricao + "]";
		return descricao;
	}
	
	
}
