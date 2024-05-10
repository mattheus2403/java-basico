package poo.enumeradores;

public class SistemaIbge {

	public static void main(String[] args) {
		// Irei chamar os atributos do enum EstadoBrasileiro até que todos
		// sejam exibidos com nome, sigla e nome maiusculo
		for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println(e.getNome() + " - " + e.getSigla() + "\nEm Maiusculo: " + e.getNomeMaiusculo());
		}
		
		// chama e associa especificamente ao estado de são paulo
		EstadoBrasileiro sp = EstadoBrasileiro.SAO_PAULO;
		System.out.println("\nNome do estado em particular: " + sp.getNome() + "\nSigla do estado em particular: " + sp.getSigla() 
		+ "\nNome Maiusculo do estado em particular: " + sp.getNomeMaiusculo());
		
	}

}
