package poo.enumeradores;

//Criando o enum EstadoBrasileiro para ser usado em toda a aplica��o.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "S�o Paulo"),
	RIO_DE_JANEIRO ("RJ", "Rio de Janeiro"),
	MINAS_GERAIS ("MG", "Minas Gerais"),
	RIO_GRANDE_DO_SUL ("RS", "Rio Grande do Sul");
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}