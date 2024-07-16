package one.digitalinnovation.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

	@Mock
	private PlataformaDeEnvio plataforma;
	
	//nota: como o servico eh uma dependencia da classe o mock deve ser injetado (dito numa aula, pesquisar depois)
	@InjectMocks
	private ServicoEnvioEmail servico;
	
	//captura informacoes passadas como argumento
	@Captor
	private ArgumentCaptor<Email> captor;
	
	@Test
	void validarDadosEnviadosParaAPlataforma() {
		String enderecoDeEmail = "usuario@teste.com.br";
		String mensagem = "Olá Mundo";
		Boolean ehFormatoAtual = false;
		
		//envia e-mail com as informacoes passadas anteriormente
		servico.enviaEmail("usuario@teste.com.br", "Olá Mundo", ehFormatoAtual);
		
		//verifica a plataforma e captura os argumentos do enviaEmail
		Mockito.verify(plataforma).enviaEmail(captor.capture());
		
		//pega o valor de cada argumento e passa como emailCapturado
		Email emailCapturado = captor.getValue();
		
		Assertions.assertEquals(enderecoDeEmail, emailCapturado.getEnderecoEmail());
		Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
		Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
		
	}
}
