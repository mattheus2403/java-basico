package one.digitalinnovation;

import java.util.logging.Logger;

public class BancoDeDados {

	private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
	
	public static void iniciarConexao() {
		LOGGER.info("Iniciou Conexao");
	}
	
	public static void finalizarConexao() {
		LOGGER.info("finalizou Conexao");
	}
	
	public static void insereDados(Pessoa pessoa) {
		//insere pessoa no banco de dados
		LOGGER.info("Inseriu Dados");
	}
	
	public static void removeDados(Pessoa pessoa) {
		//remove pessoa no banco de dados
		LOGGER.info("Removeu Dados");
	}
	
}
