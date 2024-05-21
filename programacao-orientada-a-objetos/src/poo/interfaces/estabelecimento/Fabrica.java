package poo.interfaces.estabelecimento;

import poo.interfaces.equipamentos.copiadora.Copiadora;
import poo.interfaces.equipamentos.copiadora.Xerox;
import poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import poo.interfaces.equipamentos.digitalizadora.Scanner;
import poo.interfaces.equipamentos.impressora.DeskJet;
import poo.interfaces.equipamentos.impressora.Impressora;
import poo.interfaces.equipamentos.impressora.LaserJet;
import poo.interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

	public static void main(String[] args) {
		//TODO Neste exemplo usarei interfaces para representar
		//objetos de herança única e multipla
		
		//Construtores e métodos de impressão
		
		//imprimindo via impressora deskjet
		Impressora impressora = new DeskJet();
		impressora.imprimir();
		
		//imprimindo via impressora laserjet
		Impressora impressora2 = new LaserJet();
		impressora2.imprimir();
		
		//digitalizando via digitalizadora Scanner
		Digitalizadora digitalizadora = new Scanner();
		digitalizadora.digitalizar();
		
		//imprimindo via copiadora Xerox
		Copiadora copiadora = new Xerox();
		copiadora.copiar();
		
		//imprimindo via impressora equipamento multifuncional
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressoraEm = em;
		Digitalizadora digitalizadoraEm = em;
		Copiadora copiadoraEm = em;
		
		impressoraEm.imprimir();
		digitalizadoraEm.digitalizar();
		copiadoraEm.copiar();

	}
}
