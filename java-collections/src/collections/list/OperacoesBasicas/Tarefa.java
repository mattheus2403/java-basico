package collections.list.OperacoesBasicas;

public class Tarefa {

	//atributo
	private String descricao;
	
	//método construtor
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	//método toString que constrói uma estutura para decricao
	@Override
	public String toString() {
		//return "Tarefa [descricao=" + descricao + "]";
		return descricao;
	}
	
	
}
