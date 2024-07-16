package one.digitalinnovation.mockito;

import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
	
	@Mock
	private ApiDosCorreios apiDosCorreios;
	
	@InjectMocks
	private CadastrarPessoa cadastrarPessoa;
	
	@Test
	void validarDadosDeCadastro() {
		//Se o CEP for o especificado, ele retornara os dados de localizacao na instnacia de DadosLocalizacao
		//sem pegar diretamente da api (acho que e isso)
		DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "Cidade Aleatoria", "Rua 2", "Apto", "Centro");
		
		//anyString() aceita qualquer String passada no valor do cep
		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("232434543")).thenReturn(null);
//		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("232434543")).thenReturn(dadosLocalizacao);
		
		
		
		Pessoa matheus = cadastrarPessoa.cadastrarPessoa("Matheus", "123", LocalDate.now(), "232434543");
		
		Assertions.assertNull(matheus.getEndereco());
		
		//valida se cada informacao corresponde com a registrada
//		Assertions.assertEquals("Matheus", pessoa.getNome());
//		Assertions.assertEquals("123", pessoa.getDocumento());
//		Assertions.assertEquals("SP", pessoa.getEndereco().getUf());
//		Assertions.assertEquals("Apto", pessoa.getEndereco().getComplemento());
	}
	
	@Test
	void LancarExceptionQuandoChamarApiDosCorreios() {
		//manipulando retornos
		//lanca uma excessao quando a apiDosCorreios buscar um cep com qualquer string
		Mockito.doThrow(IllegalArgumentException.class)
				.when(apiDosCorreios)
						.buscaDadosComBaseNoCep(anyString()); 
		
		//valida se excessao sera lancada
		Assertions.assertThrows(IllegalArgumentException.class, () ->  cadastrarPessoa.cadastrarPessoa("Matheus", "123", LocalDate.now(), "232434543"));
	}
}



//forma alternativa de iniciar o mockito sem a anotacao @ExtendWith
//@BeforeAll
//void setup() {
//	MockitoAnnotations.initMocks(this);
//}
//
//private ApiDosCorreios apiDosCorreios = Mockito.mock(ApiDosCorreios.class);
//
