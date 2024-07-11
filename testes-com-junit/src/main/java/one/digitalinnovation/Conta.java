package one.digitalinnovation;

public class Conta {

	private String numeroDaConta;

	private int saldo;
	
	public Conta(String numeroDaConta, int saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public int getSaldo() {
		return saldo;
	}
	
}
