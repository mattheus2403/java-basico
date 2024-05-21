package poo.polimorfismo.pastelaria.cozinha;

public abstract class ServicoPastelaria {
	
	// classes abstratas permitem que cada classe fa�a a declara��o de sua pr�pria
	
	public abstract void anotarPedido();
	public abstract void entragaPastel();
	
	//classes protected geralmente s�o associadas ao polimorfismo, onde alguns comportamentos
	//ser�o definidos por padr�o e outros ser�o definidos por classes filhas de classs abstratas
	protected void verificaPedido() {
		System.out.println("Verificando se o pedido est� dispon�vel");
	}
	
	protected void registraPedidoSucedido() {
		System.out.println("Registrando que o pedido foi entregue");
	}
}
