package poo.enumeradores;

//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", 11),
	RIO_DE_JANEIRO ("RJ", "Rio de Janeiro", 12),
	MINAS_GERAIS ("MG", "Minas Gerais", 13),
	RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul", 14);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getIbge() {
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}