package collections.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	//atributo
	Set<Convidado> convidadoSet;

	//construtor
	public ConjuntoConvidados() {
		super();
		this.convidadoSet = new HashSet<>();
	}
	
	//adiciona convidado a lista	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	//remover convidado por c�digo de convite da lista
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
			
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	//mostrar numero  de convidados
	public int numeroConvidados() {
		return convidadoSet.size();
	}
	
	//exibe lista de convidados (no set a ordem n�o � a mesma de inser��o)
	public void exibeConvidados() {
		System.out.println(convidadoSet);
	}
	
	//m�todo principal
	public static void main(String[] args) {
		//objeto padr�o
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		//adiciona convidados
		conjuntoConvidados.adicionarConvidado("Mattheus2403", 23);
		conjuntoConvidados.adicionarConvidado("Iris", 32);
		conjuntoConvidados.adicionarConvidado("Mattheus2403", 16);
		conjuntoConvidados.adicionarConvidado("Eriky", 88);
		conjuntoConvidados.adicionarConvidado("Madalena", 88); //Madalena ser� removida da lista devido a
		//implementa��o do equals e hashcode na classe Convidado que impede c�digo de convite repetido
		
		//testes
		
		//numero de convidados
		System.out.println(conjuntoConvidados.numeroConvidados() + "\n");
		
		//lista de convidados
		conjuntoConvidados.exibeConvidados();
		
		System.out.println("\n");
		
		//remove convidados
		conjuntoConvidados.removerConvidadoPorCodigoConvite(88);
		conjuntoConvidados.removerConvidadoPorCodigoConvite(23);
				
		//numero de convidados
		System.out.println(conjuntoConvidados.numeroConvidados() + "\n");

		//lista de convidados
		conjuntoConvidados.exibeConvidados();		
	}
}
