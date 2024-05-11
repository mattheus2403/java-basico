package poo.enumeradores;

public class SistemaIbge {

	public static void main(String[] args) {
		// Irei chamar os estados do enum EstadoBrasileiro até que todos
		// sejam exibidos com nome, sigla e nome maiusculo
		System.out.println("TODOS OS ESTADOS DO ENUM: \n");
		for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
			System.out.println(e.getNome() + " - " + e.getSigla() + " - " + e.getIbge() + "\nEm Maiusculo: " + e.getNomeMaiusculo());
		}
		
		// chama e associa especificamente ao estado de são paulo
		EstadoBrasileiro sp = EstadoBrasileiro.SAO_PAULO;
		System.out.println("\nNome do estado em particular: " + sp.getNome() + "\nSigla do estado em particular: " + sp.getSigla() 
		+ "\nNuméro IBGE do estado em particular: " + sp.getIbge() + "\nNome Maiusculo do estado em particular: " + sp.getNomeMaiusculo());
		
		// outro estado
		EstadoBrasileiro mg = EstadoBrasileiro.MINAS_GERAIS;
		System.out.println("\nNome do estado em particular: " + mg.getNome() + "\nSigla do estado em particular: " + mg.getSigla() 
		+ "\nNuméro IBGE do estado em particular: " + mg.getIbge() + "\nNome Maiusculo do estado em particular: " + mg.getNomeMaiusculo());
	}

}
