package one.digitalinnovation;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {

	//BeforeAll executa antes de todos os testes (@Test)
	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
		System.out.println("Rodou configuraConexao");
	}
	
	//BeforeEach executa antes de cada teste (@Test)
	@BeforeEach
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("Matheus", LocalDateTime.of(2001, 03, 24, 14, 21)));
	}
	
	//AfterEach executa depois de cada teste (@Test)
	@AfterEach
	void RemoveDadosDoTeste() {
		BancoDeDados.removeDados(new Pessoa("Matheus", LocalDateTime.of(2001, 03, 24, 14, 21)));
	}
	
	@Test
	void validarDadosDeRetorno() {
		assertTrue(true);
	}
	
	@Test
	void validarDadosDeRetorno2() {
		assertNull(null);
	}
	
	//AfterAll executa depois de todos os testes (@Test)
	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.finalizarConexao();
		System.out.println("rodou finalizarConexao");
	}
}
