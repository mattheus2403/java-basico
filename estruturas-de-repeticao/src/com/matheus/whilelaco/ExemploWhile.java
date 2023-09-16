package com.matheus.whilelaco;

import java.util.concurrent.ThreadLocalRandom; //importa a função para gerar números aleatórios

public class ExemploWhile {

	public static void main(String[] args) {
		
		//o laço while repete uma condição até que ela se torne false
		//quando isso acontecer ela pode retornar algo ou simplesmente encerrar o programa
		//nesse exemplo irá repetir até que o valor da mesada acabe
		
		double mesada = 50.0; //quanto de dinheiro joãozinho tem
		
        while(mesada>0) { //gera valores aleatórios pra variável do valor de doce enquanto mesada for maior que 0
            Double valorDoce = valorAleatorio();
            
            //condição para que não passe 0 e dê números negativos
            if(valorDoce > mesada)
                valorDoce = mesada;

            //indica o valor de cada doce
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            
            //subtrai a mesada pelo valor do doce
            mesada = mesada - valorDoce;
        }
        
        //exibe o valor final da mesada e informa que foi totalmente gasta 
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
   }
	
	//função para gerar números aleatórios
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
   }

}


