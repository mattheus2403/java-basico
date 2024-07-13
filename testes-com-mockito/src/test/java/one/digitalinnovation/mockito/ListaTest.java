package one.digitalinnovation.mockito;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;


@ExtendWith(MockitoExtension.class) //extensao padrao para usar o mockito
public class ListaTest {

	@Mock //essa anotacao "mocka" a lista, o que significa que simula essa lista sem usar ela de fato ps: pesquisar melhor
	private List<String> letras;
	@Test
	void adicionarItemNaLista() {
		//informa de quando pegar a posicao 0 da lista retorne "B"
		Mockito.when(letras.get(0)).thenReturn("B");
		
		//espera que retorne "B" ao escolher a posicao 0
		Assertions.assertEquals("B", letras.get(0));
	}
}
