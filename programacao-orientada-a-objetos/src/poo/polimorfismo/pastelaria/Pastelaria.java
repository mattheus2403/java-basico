package poo.polimorfismo.pastelaria;

import java.util.Scanner;

import poo.polimorfismo.pastelaria.cozinha.PastelCarne;
import poo.polimorfismo.pastelaria.cozinha.PastelFrango;
import poo.polimorfismo.pastelaria.cozinha.PastelQueijo;
import poo.polimorfismo.pastelaria.cozinha.ServicoPastelaria;

public class Pastelaria {

	public static void main(String[] args) {
		// TODO Exemplo de polimorfismo importando classes
		// filhas de classes abstradas declaradas e não declaradas
		
		//leitor
		Scanner leitor = new Scanner(System.in);
		
		//construtores
		ServicoPastelaria pdp = null; //não se sabe qual será o pedido escolhido
		
		//entrada do pedido de pastel
		System.out.println("Qual Pastel deseja pedir?");
		String PedidoPastel = leitor.next();
		
		//algoritmo de decisão do pastel
		if (PedidoPastel.equals("carne")) {
			pdp = new PastelCarne();
		}
		else if (PedidoPastel.equals("queijo")) {
			pdp = new PastelQueijo();
		}
		else if (PedidoPastel.equals("frango")) {
			pdp = new PastelFrango();
		}
		
		//chamada de métodos
		pdp.anotarPedido();
		pdp.entragaPastel();
		
	}

}
