package collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
	
	//atributo
	Set<Contato> contatosSet;

	//construtor
	public AgendaDeContatos() {
		super();
		this.contatosSet = new HashSet<>();
	}
	
	//adicionar contato
	public void adicionarContato(String nome, int numero){
		contatosSet.add(new Contato(nome, numero));
	}

	//exibir contatos
	public void exibirContatos(){
		if(!contatosSet.isEmpty()) {
			System.out.println(contatosSet);
		}
		else {
			System.out.println("Lista de contatos vazia");
		}
	}
	
	//pesquisar contato por nome que começar (exemplo: pesquisa Matheus, pode achar vários Matheus até
	//com sobrenome
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatoPorNome = new HashSet<>();
		if(!contatosSet.isEmpty()) {
			for(Contato c : contatosSet) {
				if(c.getNome().startsWith(nome)) {
					contatoPorNome.add(c);
				}
			}
			return contatoPorNome;
		}
		else {
			throw new RuntimeException("Lista de contatos vazia");
		}		
	}
	
	//atualizar numero de contato para contato específico
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatosSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	//método principal
	public static void main(String[] args) {
		//objeto padrão
		AgendaDeContatos agendaDeContatos = new AgendaDeContatos();
		
		//adiciona contatos
		agendaDeContatos.adicionarContato("Mattheus2403", 1234567);
		agendaDeContatos.adicionarContato("Mattheus2403 da Silva", 4327928);
		agendaDeContatos.adicionarContato("Mattheus2403", 5521335); //nome igual não será inserido
		agendaDeContatos.adicionarContato("João Kleber", 5241263);
		
		//testes
		
		//exibindo contatos
		agendaDeContatos.exibirContatos();
		
		//pesquisa por nome
		System.out.println("Pesquisando por nome: " + agendaDeContatos.pesquisarPorNome("Mattheus2403"));
		
		//atualizando contato por nome
		agendaDeContatos.atualizarNumeroContato("João Kleber", 40028922);
		
		//pesquisa por nome após troca do número
		System.out.println("Pesquisando por nome: " + agendaDeContatos.pesquisarPorNome("João Kleber"));
		
		//exibindo contatos após troca do número
		agendaDeContatos.exibirContatos();
	}
}
