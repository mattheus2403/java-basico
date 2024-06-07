package collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	//atributo
	private Map<String, Integer> agendaContatoMap;

	//construtor
	public AgendaContatos() {
		super();
		this.agendaContatoMap = new HashMap<>();
	}
	
	//adiciona contato
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone); //o nome será a chave da coleção
	}
	
	//remover contato
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	//exibe contatos
	public void exibeContatos() {
		System.out.println(agendaContatoMap);
	}
	
	//pesquisa por nome
	public Integer pesquisaContatoPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome); //pega a chave e retorna o valor da respectiva chave
		}
		return numeroPorNome;
	}
	
	//método main
	public static void main(String[] args) {
		//objeto padrão
		AgendaContatos agendaContatos = new AgendaContatos();
		
		//adiciona contatos
		agendaContatos.adicionarContato("Mattheus2403", 22345552);
		agendaContatos.adicionarContato("Peter", 4235522);
		agendaContatos.adicionarContato("Lilian", 782385552);
		agendaContatos.adicionarContato("Jason", 82344282);
		
		//testes
		
		//exibe contatos
		agendaContatos.exibeContatos();
		
		//remove contato
		agendaContatos.removerContato("Mattheus2403");
		
		//exibe contatos
		agendaContatos.exibeContatos();
		
		//pesquisa por chave(nome)
		System.out.println("O numero é: " + agendaContatos.pesquisaContatoPorNome("Lilian"));
	}
	
}
