package poo.encapsulamento;

public class Cliente {

	public static void main(String[] args) {

		Hamburgueria hamburgueria = new Hamburgueria();
		
		//chama os m�todos privados que est�o dentro do m�todo publico de pedido
		hamburgueria.pedido();
		
		hamburgueria.pagarConta();
	}

}
