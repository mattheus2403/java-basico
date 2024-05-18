package poo.heranca;

public class Lanchonete {

	public static void main(String[] args) {
		//exemplo de heranca simples para praticar o uso do extends
		
		System.out.println("Pedido de Hamburguer");
		Hamburguer hamburguer = new Hamburguer();
		hamburguer.pedido();
		hamburguer.pagarConta();
		
		System.out.println("\nPedido de Hot Dog");
		Hotdog hotdog = new Hotdog();
		hotdog.pedido();
		hotdog.pagarConta();
		
		System.out.println("\nPedido de Pizza");
		Pizza pizza = new Pizza();
		pizza.pedido();
		pizza.pagarConta();
	}
}
