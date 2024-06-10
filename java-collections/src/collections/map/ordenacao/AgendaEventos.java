package collections.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	//atributo
	Map<LocalDate, Evento> eventosMap;
	
	//construtor
	public AgendaEventos() {
		super();
		this.eventosMap = new HashMap<>();
	}
	
	//adiciona evento ao conjunto
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	//exibe agenda de eventos em ordem crescente de data
	public void exibirAgenda() {
		//TreeMap é necessário para ordenação passando como argumento a coleção eventosMap
		 Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		 System.out.println(eventosTreeMap);
	}
	
	//obtém próximo evento que ocorrerá
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now(); //pega a data atual do sistema
		LocalDate proximaData = null; //cria variável de valor nulo pra substituir por dataEvento
		Evento proximoEvento = null;  //cria variável de valor nulo pra substituir por entry.getKey(); (pega o valor da chave)
		for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) { //Percorre a coleção
			LocalDate dataEvento = entry.getKey(); //pega data do evento pela chave
			//se a data do evento é igual a data atual ou depois da data atual a proxima data se torna a data do evento
			//e o próximo evento pega o valor da chave
			if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
				proximaData = dataEvento;
				proximoEvento = entry.getValue();
				break;
			}
		}
		//se o próximo evento existir, mostra o nome do próximo evento junto da data, senão diz que não há eventos futuros
		if (proximoEvento != null) {
			System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
		} else {
			System.out.println("Não há eventos futuros na agenda.");
		}
	}
	
	//método principal
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		//adiciona eventos
	    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
	    
	    //exibe agenda de eventos
	    agendaEventos.exibirAgenda();
	    
	    //exibe próximo evento após a data atual
	    agendaEventos.obterProximoEvento();
	}
}
