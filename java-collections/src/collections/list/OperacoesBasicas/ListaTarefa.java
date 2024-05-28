package collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	//atributo
	private List <Tarefa> tarefaList;

	public ListaTarefa() {
		super();
		this.tarefaList = new ArrayList<>();
	}
	
	private void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	private void removerTarefa(String descricao) {
		List <Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	private int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	private void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		listaTarefa.adicionarTarefa("tarefa 1");
		listaTarefa.adicionarTarefa("tarefa 1");
		listaTarefa.adicionarTarefa("tarefa 2");
		System.out.println("O numero total de elementos na lista �: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("tarefa 1");
		
		System.out.println("O numero total de elementos na lista �: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}
	
}
