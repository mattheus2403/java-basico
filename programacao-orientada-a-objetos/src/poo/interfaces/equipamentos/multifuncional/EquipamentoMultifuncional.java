package poo.interfaces.equipamentos.multifuncional;

import poo.interfaces.equipamentos.copiadora.Copiadora;
import poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import poo.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora{

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando Via Equipamento Multifuncional");
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo Via Equipamento Multifuncional");
	}

	@Override
	public void copiar() {
		System.out.println("Copiando Via Equipamento Multifuncional");
	}

}
