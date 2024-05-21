package poo.polimorfismo.pastelaria.cozinha;

public class PastelCarne extends ServicoPastelaria{

	@Override
	public void anotarPedido() { // chama o m�todo abstrato e define sua implementa��o
		verificaPedido(); //chama os m�todos protegidos dentro do m�todo p�blico
		System.out.println("Anotando pedido de pastel de carne");
	}

	@Override
	public void entragaPastel() { // chama o m�todo abstrato e define sua implementa��o
		System.out.println("Entegando pastel de carne");
		registraPedidoSucedido(); //chama os m�todos protegidos dentro do m�todo p�blico
	}

}
