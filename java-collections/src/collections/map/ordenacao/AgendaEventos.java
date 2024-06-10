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
		//TreeMap � necess�rio para ordena��o passando como argumento a cole��o eventosMap
		 Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		 System.out.println(eventosTreeMap);
	}
	
	//obt�m pr�ximo evento que ocorrer�
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now(); //pega a data atual do sistema
		LocalDate proximaData = null; //cria vari�vel de valor nulo pra substituir por dataEvento
		Evento proximoEvento = null;  //cria vari�vel de valor nulo pra substituir por entry.getKey(); (pega o valor da chave)
		for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) { //Percorre a cole��o
			LocalDate dataEvento = entry.getKey(); //pega data do evento pela chave
			//se a data do evento � igual a data atual ou depois da data atual a proxima data se torna a data do evento
			//e o pr�ximo evento pega o valor da chave
			if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
				proximaData = dataEvento;
				proximoEvento = entry.getValue();
				break;
			}
		}
		//se o pr�ximo evento existir, mostra o nome do pr�ximo evento junto da data, sen�o diz que n�o h� eventos futuros
		if (proximoEvento != null) {
			System.out.println("O pr�ximo evento: " + proximoEvento.getNome() + " acontecer� na data " + proximaData);
		} else {
			System.out.println("N�o h� eventos futuros na agenda.");
		}
	}
	
	//m�todo principal
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		//adiciona eventos
	    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Confer�ncia de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programa��o", "Aula pr�tica de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lan�amento de Software", "Demonstra��o da nova vers�o");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inova��o", "Competi��o de solu��es criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Semin�rio de Intelig�ncia Artificial", "Discuss�o sobre IA avan�ada");
	    
	    //exibe agenda de eventos
	    agendaEventos.exibirAgenda();
	    
	    //exibe pr�ximo evento ap�s a data atual
	    agendaEventos.obterProximoEvento();
	}
}
