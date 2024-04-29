package com.matheus.excecoes;

public class FormatadorCep {
	
	public static void main(String[] args) {
		/* TODO Exemplo de excessao customizada
		   ou seja, que é gerada por nós diferente
		   de excecoes como RunTimeException etc.
		*/
		
		try { //bloco try avaliando se uma excessao será gerada
			
			//cria um cep exemplificado e supõe uma formatação dele
			//usando o método formatarCep e exibe ele formatado na tela
			String cepFormatado = formatarCep("23765064");
			System.out.print(cepFormatado);
			
		} catch (CepInvalidoException e) {
			// TODO bloco catch gerando mensagem caso o bloco try
			//detecte uma excessao, chamando a classe CepInvalidoException
			System.out.print("CEP Inválido, 8 digitos são necesários");
		}
		
	}
		
	//método de formatação do cep
	static String formatarCep(String cep) throws CepInvalidoException{ //classe da excessao instanciada
		if(cep.length() != 8)//ao formatar o cep caso tenha um numero de digitos diferente de 8 gera uma excessao
			throw new CepInvalidoException();
	//retorna uma simulação de um cep formatado
			return "23.765-064";
		}
		
}

