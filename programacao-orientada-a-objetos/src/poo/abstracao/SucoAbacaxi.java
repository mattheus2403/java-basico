package poo.abstracao;

public class SucoAbacaxi extends ServicoPreparoSucos {
	
	@Override
	public void preparaSuco() {
		System.out.println("Preparando suco de abacaxi");
	}
	
	@Override
	public void entragaSuco() {
		System.out.println("Entregando suco de abacaxi");
	}
}
