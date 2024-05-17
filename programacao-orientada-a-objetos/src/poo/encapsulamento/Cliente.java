package poo.encapsulamento;

public class Cliente {

	public static void main(String[] args) {

		Hamburgueria hamburgueria = new Hamburgueria();
		
		//chama os métodos privados que estão dentro do método publico de pedido
		hamburgueria.pedido();
		
		hamburgueria.pagarConta();
	}

}
