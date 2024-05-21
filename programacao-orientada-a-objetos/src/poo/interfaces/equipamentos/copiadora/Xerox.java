package poo.interfaces.equipamentos.copiadora;

public class Xerox implements Copiadora{ //implementação da interface

	@Override
	public void copiar() {
		System.out.println("Copiando Via Xerox");
	}

}
