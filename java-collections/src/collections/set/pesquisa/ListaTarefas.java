package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	//atributos
	Set<Tarefa> tarefasSet;

	//construtor
	public ListaTarefas() {
		super();
		this.tarefasSet = new HashSet<>();
	}
	
	//adiciona tarefa a lista
	public void adicionaTarefa(String descricao) {
		tarefasSet.add(new Tarefa(descricao));
	}
	
	//remove tarefa da lista pela descricao
	public void removeTarefa(String descricao) {
		Tarefa tarefasParaRemover = null;
		if(!tarefasSet.isEmpty()) {
			for(Tarefa t : tarefasSet) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefasParaRemover = t;
					break;
				}
			}
			tarefasSet.remove(tarefasParaRemover);
		}
		else {
			System.out.println("Lista Vazia");
		}
		
	    if(tarefasParaRemover == null) {
	        System.out.println("Tarefa não encontrada!");
	      }
	}
	
	//exibir tarefas
	public void exibirTarefas() {
		System.out.println(tarefasSet);
	}
	
	//conta tarefas
	public int contarTarefas() {
		return tarefasSet.size();
	}
	
	//obter tarefas concluidas
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for(Tarefa t : tarefasSet) {
			if(t.isConcluida()) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	
	//obter tarefas pendentes
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for(Tarefa t : tarefasSet) {
			if(!t.isConcluida()) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	
	//marca tarefa como concluida
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);
			}
		}
	}
	
	//marcar tarefa como pendente
	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaParaMarcarPendente = null;
		for(Tarefa t : tarefasSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaMarcarPendente = t;
				break;
			}
		}
		if (tarefaParaMarcarPendente != null) {
			if(tarefaParaMarcarPendente.isConcluida()) {
				tarefaParaMarcarPendente.setConcluida(false);
			}
		} else {
			System.out.println("Tarefa não encontrada na lista.");
		}
	}
	
	//limpa lista de tarefas
	public void limparListaTarefas() {
		if(tarefasSet.isEmpty()) {
			System.out.println("A lista já está vazia!");
		} else {
			tarefasSet.clear();
		}
	}
	
	//método principal
	public static void main(String[] args) {
		//objeto padrão
		ListaTarefas listaTarefas = new ListaTarefas();
		
		//adiciona tarefas a lista
		listaTarefas.adicionaTarefa("Arrumar");
		listaTarefas.adicionaTarefa("Organizar");
		listaTarefas.adicionaTarefa("Limpar");
		listaTarefas.adicionaTarefa("Parar");
		listaTarefas.adicionaTarefa("Observar");
		
		//testes
		
		//conta tarefas 
		System.out.println("Numero total de restantes: " + listaTarefas.contarTarefas());
		
		//exibe tarefas
		listaTarefas.exibirTarefas();
		
		//remover tarefa
		listaTarefas.removeTarefa("Limpar");
		
		////conta tarefas 
		System.out.println("\nNumero total de tarefas restantes: " + listaTarefas.contarTarefas());
		
		//exibe tarefas
		listaTarefas.exibirTarefas();		
		
		//marcando tarefas concluidas
		listaTarefas.marcarTarefaConcluida("Observar");
		listaTarefas.marcarTarefaConcluida("Parar");

		//total de tarefas
		System.out.println("\nNumero total de tarefas restantes: " + listaTarefas.contarTarefas());

		//exibe tarefas
		listaTarefas.exibirTarefas();
		
		//marca tarefa como pendente
		listaTarefas.marcarTarefaPendente("Parar");

		//total de tarefas
		System.out.println("\nNumero total de tarefas restantes: " + listaTarefas.contarTarefas());

		//exibe tarefas
		listaTarefas.exibirTarefas();
		
				
	}
}
