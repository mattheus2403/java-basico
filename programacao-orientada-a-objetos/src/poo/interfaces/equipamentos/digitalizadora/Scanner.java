package poo.interfaces.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora{ //implementação da interface

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando");
	}

}
