package poo.abstracao;

public class SucoUva extends ServicoPreparoSucos {
	
	@Override
	public void preparaSuco() {
		System.out.println("Preparando suco de uva");
	}
	
	@Override
	public void entragaSuco() {
		System.out.println("Entregando suco de uva\n");
	}
}
