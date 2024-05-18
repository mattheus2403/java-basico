package poo.encapsulamento;

public class Hamburgueria {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		//chama os métodos privados que estão dentro do método publico de pedido
		cliente.pedido();
		
		cliente.pagarConta();
	}

}
