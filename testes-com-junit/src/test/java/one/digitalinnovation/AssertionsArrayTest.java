package one.digitalinnovation;

import org.junit.jupiter.api.Test;

//import static permite que nao seja necessario declarar o nome da
//biblioteca a ser usada, ao adicionar * todos os comandos dessa biblioteca 
//serao selecionados, entao nao ha necessidade de importar uma a uma.
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class AssertionsArrayTest {

	@Test
	void validarLancamentos() {
		int [] primeiroLancamento = {10, 20, 30, 40, 50};
		int [] segundoLancamento = {-1, 33, 22, 44, 12};
		
		//assertArrayEquals valida se os arrays sao iguais
//		assertArrayEquals(primeiroLancamento, segundoLancamento);
		
		//assertNotEquals valida se os objetos sao diferentes
		assertNotEquals(primeiroLancamento, segundoLancamento);
	}
	
	@Test
	void validarPessoaNula() {
		Pessoa pessoa = null;
		
		//assertNull valida se a pessoa eh nula
		assertNull(pessoa);
		
		//assertNull valida se a pessoa nao eh nula
		Pessoa matheus = new Pessoa("Matheus", LocalDateTime.now());
		assertNotNull(matheus);
	}
	
	@Test
	void validarNumerosDeTiposDiferentes() {
		double valor = 5.0;
		double outroValor = 5.0;
		
		assertEquals(valor, outroValor);
	}
}
