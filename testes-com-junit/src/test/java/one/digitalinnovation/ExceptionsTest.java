package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

	@Test
	void validarCenarioDeExcecaoNaTransferencia() {
		Conta contaOrigem = new Conta("12345", 0);
		Conta contaDestino = new Conta("37284", 100);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		
		//asserThrows verifica se a excecao chamada por sua classe ira executar 
		//assertDoesNotThrow verifica se alguma excessao (seja ela qual for) não será lançada
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
		
	}
}
