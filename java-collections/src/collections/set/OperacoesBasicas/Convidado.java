package collections.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

	//atributo
	private String nome;
	private int codigoConvite;
	
	//construtor
	public Convidado(String nome, int codigoConvite) {
		super();
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	//métodos get
	public String getNome() {
		return nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	//toString
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
	}

	//hashSocde e equals para impedir que um objeto com o mesmo código de convite seja adicionado
	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Convidado convidado)) {
			return false;
		}
		return codigoConvite == convidado.codigoConvite;
	}


	
	
}
