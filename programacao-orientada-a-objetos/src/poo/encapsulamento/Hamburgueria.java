package poo.encapsulamento;

public class Hamburgueria {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		//chama os m�todos privados que est�o dentro do m�todo publico de pedido
		cliente.pedido();
		
		cliente.pagarConta();
	}

}
