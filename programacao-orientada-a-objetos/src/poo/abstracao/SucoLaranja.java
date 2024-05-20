package poo.abstracao;

public class SucoLaranja extends ServicoPreparoSucos {
	
	@Override
	public void preparaSuco() {
		System.out.println("Preparando suco de laranja");
	}
	
	@Override
	public void entragaSuco() {
		System.out.println("Entregando suco de laranja\n");
	}
}
