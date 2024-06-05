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
	
	//pesquisar contato por nome que come�ar (exemplo: pesquisa Matheus, pode achar v�rios Matheus at�
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
	
	//atualizar numero de contato para contato espec�fico
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
	
	//m�todo principal
	public static void main(String[] args) {
		//objeto padr�o
		AgendaDeContatos agendaDeContatos = new AgendaDeContatos();
		
		//adiciona contatos
		agendaDeContatos.adicionarContato("Mattheus2403", 1234567);
		agendaDeContatos.adicionarContato("Mattheus2403 da Silva", 4327928);
		agendaDeContatos.adicionarContato("Mattheus2403", 5521335); //nome igual n�o ser� inserido
		agendaDeContatos.adicionarContato("Jo�o Kleber", 5241263);
		
		//testes
		
		//exibindo contatos
		agendaDeContatos.exibirContatos();
		
		//pesquisa por nome
		System.out.println("Pesquisando por nome: " + agendaDeContatos.pesquisarPorNome("Mattheus2403"));
		
		//atualizando contato por nome
		agendaDeContatos.atualizarNumeroContato("Jo�o Kleber", 40028922);
		
		//pesquisa por nome ap�s troca do n�mero
		System.out.println("Pesquisando por nome: " + agendaDeContatos.pesquisarPorNome("Jo�o Kleber"));
		
		//exibindo contatos ap�s troca do n�mero
		agendaDeContatos.exibirContatos();
	}
}
