package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

	@Test
	void validarAlgoSeUsuarioMathe() {
		//Assumptions cria uma suposicao, que caso esteja correta o cenario se torna verdadeiro
		//nesse caso se o usuario do sistema for mathe entao a soma de que 5 + 5 = 10 sera verdadeira
		//assumeTrue supoe que a situacao eh verdadeira, assumeFalse supoe que a situacao eh falsa
		Assumptions.assumeTrue("mathe".equals(System.getenv("USER")));
		Assertions.assertEquals(10, 5 + 5);
	}
}
