package com.matheus.metodos;

public class TiposMetodos {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO M�TODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO M�TODO
		//AQUI N�O PRECISA DO RETURN
		//POIS N�O SER� RETORNADO NENHUM RESULTADO
	}
	// throws Exception : indica que o m�todo ao ser utilizado
	// poder� gerar uma exce��o
	public double dividir(int dividendo, int divisor) throws Exception{}
	
	// este m�todo n�o pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equ�vocos estruturais
	public void validar(){
		//este m�todo deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um m�todo deve representar uma �nica responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este m�todo tem a finalidade de gravar
		//informa��es de um cliente, por que n�o criar
		//um objeto cliente e passar como par�metro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
	
}
