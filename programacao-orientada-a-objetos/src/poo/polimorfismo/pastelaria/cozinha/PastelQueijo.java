package poo.polimorfismo.pastelaria.cozinha;

public class PastelQueijo extends ServicoPastelaria{

	@Override
	public void anotarPedido() { // chama o método abstrato e define sua implementação
		verificaPedido(); //chama os métodos protegidos dentro do método público
		System.out.println("Anotando pedido de pastel de queijo");
	}

	@Override
	public void entragaPastel() { // chama o método abstrato e define sua implementação
		System.out.println("Entegando pastel de queijo");
		registraPedidoSucedido(); //chama os métodos protegidos dentro do método público
	}

}
