package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTest {

	@Test
	//EnabledIfEnvironmentVariable tem a mesma funcao Assumption no exemplo anterior em AssumptionsTest
	@EnabledIfEnvironmentVariable(named = "USER", matches = "root")
	
	void validarAlgoSeUsuarioMathe() {
		Assertions.assertEquals(10, 5 + 5);
	}
}


/*
 * outros exemplos de @Enabled:
 * @EnabledOnOs roda se estiver em determinado sistema operacional
 * @EnabledOnJre roda se estiver em determinada versao da jre
 * @EnableOnJreRange roda dentro da versao minima e maxima da jre
 */

