package poo.polimorfismo;

public abstract class ServicoPastelaria {
	
	// classes abstratas permitem que cada classe faça a declaração de sua própria
	
	public abstract void anotarPedido();
	public abstract void entragaPastel();
	
	//classes protected geralmente são associadas ao polimorfismo, onde alguns comportamentos
	//serão definidos por padrão e outros serão definidos por classes filhas de classs abstratas
	protected void verificaPedido() {
		System.out.println("Verificando se o pedido está disponível");
	}
	
	protected void registraPedidoSucedido() {
		System.out.println("Registrando que o pedido foi entregue");
	}
}
