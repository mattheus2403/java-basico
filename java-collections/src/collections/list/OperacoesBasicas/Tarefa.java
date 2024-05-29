package collections.list.OperacoesBasicas;

public class Tarefa {

	//atributo
	private String descricao;
	
	//m�todo construtor
	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	//m�todo toString que constr�i uma estutura para decricao
	@Override
	public String toString() {
		//return "Tarefa [descricao=" + descricao + "]";
		return descricao;
	}
	
	
}
