package one.digitalinnovation.mockito;

import static org.mockito.ArgumentMatchers.anyInt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ContaTeste {

	@Spy
	private Conta conta = new Conta(1_000);
	
	@Test
	void validarOrdemDeChamadas() {
		conta.pagaBoleto(300);
		
		//Observa a ordem de acoes que acontecem com o metodo pagaBoleto na classe Conta com InOrder
		//se a ordem for a correta, nao da erro, se a ordem estiver errada um erro eh gerado
		InOrder indorder = Mockito.inOrder(conta);	
		indorder.verify(conta).pagaBoleto(300);
		indorder.verify(conta).validaSaldo(300);
		indorder.verify(conta).debita(300);
		indorder.verify(conta).enviaCreditoParaEmissor(300);
		
		//verifica se qualquer inteiro foi inserido como valor
//		indorder.verify(conta).pagaBoleto(ArgumentMatchers.anyInt());
	}
	
	@Test
	void validarQuantidadeDeChamadas() {
		conta.validaSaldo(300);
		conta.validaSaldo(500);
		conta.validaSaldo(600);
		
		//valida se o validaSaldo foi chamado 3 vezes
		Mockito.verify(conta, Mockito.times(3)).validaSaldo(ArgumentMatchers.anyInt());
	}
	
	
	@Test
	void retornaTrueParaQualquerValorNaValidacaoDeSaldo() {
		//aqui mesmo se o saldo nao for suficiente ele nao fara nada, entao nao havera erro
		Mockito.doNothing().when(conta).validaSaldo(ArgumentMatchers.anyInt());
		conta.validaSaldo(3_500);
	}
	

	/*
	 * Nota: Resumidamente o @Spy funciona como se de fato convocasse a classe em questao pra teste
	 * usando seus metodos de forma mais "real" o que eh um pouco diferente do @Mock
	 */
}
