package collections.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	//atributo
	private List <Tarefa> tarefaList; //cria a lista tarefaList colocando a classe Tarefa como elemento generico

	//construtor que cria uma ArrayList vazia para manipulação de elementos da list
	public ListaTarefa() {
		super();
		this.tarefaList = new ArrayList<>();
	}
	
	//método que adiciona tarefa a List 
	private void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	//método que remove tarefa da List
	private void removerTarefa(String descricao) {
		List <Tarefa> tarefasParaRemover = new ArrayList<>(); //cria uma nova List com tarefas para remover
		//cria laço for que percorre a List tarefaList e adiciona o item de descricao a List tarefasParaRemover
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover); //remove todos os itens na List de tarefas para remover
	}
	
	//obtem o tamanho da List
	private int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	//Imprime descrição das tarefas da List
	private void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	//método principal
	public static void main(String[] args) {
		//Cria objeto simples para chamada de métodos declarados anteriormente
		ListaTarefa listaTarefa = new ListaTarefa();
		
		//adiciona tarefas
		listaTarefa.adicionarTarefa("tarefa 1");
		listaTarefa.adicionarTarefa("tarefa 1");
		listaTarefa.adicionarTarefa("tarefa 2");
		
		//impressao total de tarefas
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		//remove tarefa
		listaTarefa.removerTarefa("tarefa 1"); //ao pedir para remover a tarefa 1, caso esteja duplicada todas com esse nome são removidas
		
		//impressao total de tarefas
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		//imprimi descrição de tarefa
		listaTarefa.obterDescricoesTarefas();
	}
	
}
