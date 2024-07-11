package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//Se no lugar de OrderAnnotation for MethodName, ira em ordem alfabetica, se for Random a ordem eh aleatoria
//Se for DisplayName
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Define que os metodos poderao ser ordenados por classe
public class OrdenandoTestes {
	
//	@DisplayName(validaFluxoA) //se for display name voce pode declarar o nome dos testes que vao primeiro
	@Order(3) //ordena por ordem numerica
	@Test
	void validaFluxoA() {
		Assertions.assertTrue(true);
//		System.out.println("Fluxo A");
	}
	
	@Order(2)
	@Test
	void validaFluxoB() {
		Assertions.assertTrue(true);
//		System.out.println("Fluxo B");
	}
	
	@Order(1)
	@Test
	void validaFluxoC() {
		Assertions.assertTrue(true);
//		System.out.println("Fluxo C");
	}
}
