package poo.abstracao;

public class Quiosque {

	public static void main(String[] args) {
		// TODO chama as classes filhas da classe 
		// abstrata ServicoPreparaSucos
		
		System.out.println("Escolha os sucos que irá pedir: \n");
		SucoAbacaxi abacaxi = new SucoAbacaxi();
		abacaxi.preparaSuco();
		abacaxi.entragaSuco();
		
		SucoUva uva = new SucoUva();
		uva.preparaSuco();
		uva.entragaSuco();
		
		SucoLaranja laranja = new SucoLaranja();
		laranja.preparaSuco();
		laranja.entragaSuco();

	}

}
