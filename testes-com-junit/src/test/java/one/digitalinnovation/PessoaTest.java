package one.digitalinnovation;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {

//	@Test
//	void deveCalcularIdadeCorreta() {
//		Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 2, 30));
		//Assertions eh essencial para definir o que eh esperado e o que sera usado.
		//neste exemplo ele pega a idade esperada da jessica e em seguida pega a idade dela e compara
		//se der 24, o teste deu certo, se nao deu 24 o teste deu errado
//		Assertions.assertEquals(24, jessica.getIdade());
//	}
//	
	//@teste no Junit eh obrigatorio para gerar testes
	@Test
	void deveRetornarSeEhMaiorDeIdade() {
		Pessoa matheus = new Pessoa("Matheus", LocalDateTime.of(2001, 03, 24, 4, 20));
		Assertions.assertTrue(matheus.maiorDeIdade());;
	
//		Pessoa joao = new Pessoa("Joao", LocalDateTime.of(2008, 03, 24, 4, 20));
//		Assertions.assertFalse(joao.maiorDeIdade());;
	}
}
