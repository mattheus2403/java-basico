package poo.encapsulamento;

public class Hamburgueria {
	
	//exemplo de encapsulamento colocando m�todos private dentro de um m�todo public
	public void pedido() {
		System.out.println("Anotando pedido do cliente");
		preparo();
		pegarPedido();
	}
	
	private void preparo() {
		System.out.println("Preparando pedido");
	}
	
	private void pegarPedido() {
		System.out.println("Pegar pedido no balc�o e levar ao cliente");
	}
	
	public void pagarConta() {
		System.out.println("Pagando a conta");
	}
}
