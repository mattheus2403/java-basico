package one.digitalinnovation;

import org.junit.jupiter.api.Test;

//import static permite que n�o seja necess�rio declarar o nome da
//biblioteca a ser usada, ao adicionar * todos os comandos dessa biblioteca 
//ser�o selecionados, ent�o n�o h� necessidade de importar uma a uma.
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

public class AssertionsArrayTest {

	@Test
	void validarLancamentos() {
		int [] primeiroLancamento = {10, 20, 30, 40, 50};
		int [] segundoLancamento = {-1, 33, 22, 44, 12};
		
		//assertArrayEquals valida se os arrays s�o iguais
//		assertArrayEquals(primeiroLancamento, segundoLancamento);
		
		//assertNotEquals valida se os objetos s�o diferentes
		assertNotEquals(primeiroLancamento, segundoLancamento);
	}
	
	@Test
	void validarPessoaNula() {
		Pessoa pessoa = null;
		
		//assertNull valida se a pessoa � nula
		assertNull(pessoa);
		
		//assertNull valida se a pessoa n�o � nula
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
