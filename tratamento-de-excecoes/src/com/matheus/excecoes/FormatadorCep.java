package com.matheus.excecoes;

public class FormatadorCep {
	
	public static void main(String[] args) {
		/* TODO Exemplo de excessao customizada
		   ou seja, que � gerada por n�s diferente
		   de excecoes como RunTimeException etc.
		*/
		
		try { //bloco try avaliando se uma excessao ser� gerada
			
			//cria um cep exemplificado e sup�e uma formata��o dele
			//usando o m�todo formatarCep e exibe ele formatado na tela
			String cepFormatado = formatarCep("23765064");
			System.out.print(cepFormatado);
			
		} catch (CepInvalidoException e) {
			// TODO bloco catch gerando mensagem caso o bloco try
			//detecte uma excessao, chamando a classe CepInvalidoException
			System.out.print("CEP Inv�lido, 8 digitos s�o neces�rios");
		}
		
	}
		
	//m�todo de formata��o do cep
	static String formatarCep(String cep) throws CepInvalidoException{ //classe da excessao instanciada
		if(cep.length() != 8)//ao formatar o cep caso tenha um numero de digitos diferente de 8 gera uma excessao
			throw new CepInvalidoException();
	//retorna uma simula��o de um cep formatado
			return "23.765-064";
		}
		
}

