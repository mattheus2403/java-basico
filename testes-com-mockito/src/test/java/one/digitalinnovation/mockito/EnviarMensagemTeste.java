package one.digitalinnovation.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {
	//o spy verifica o comportamento do objeto
	@Spy
	private EnviarMensagem enviarMensagem;
	
	@Test
	void verificarComportamentoDaClasse() {
		//aqui o vertifyNoInteractions verifica se nao houve interacoes com o objeto/classe enviarMensagem
		Mockito.verifyNoInteractions(enviarMensagem);
		
		//Cria uma referencia pra mensagem hellow world e adiciona ao adicionarMensagem
		//e por fim valida se existe uma interacao entre enviar mensagem e adicionar mensagem com 
		//aquela mensagem em especifico
		Mensagem mensagem = new Mensagem("Hello World");
		enviarMensagem.adicionarMensagem(mensagem);
		
		Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);
		
		//pergunta se eh falso que a lista esta vazia para que confirme que ha uma mensagem nessa lista
		Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
	}
}
