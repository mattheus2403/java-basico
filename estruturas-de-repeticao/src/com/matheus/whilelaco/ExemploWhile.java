package com.matheus.whilelaco;

import java.util.concurrent.ThreadLocalRandom; //importa a fun��o para gerar n�meros aleat�rios

public class ExemploWhile {

	public static void main(String[] args) {
		
		//o la�o while repete uma condi��o at� que ela se torne false
		//quando isso acontecer ela pode retornar algo ou simplesmente encerrar o programa
		//nesse exemplo ir� repetir at� que o valor da mesada acabe
		
		double mesada = 50.0; //quanto de dinheiro jo�ozinho tem
		
        while(mesada>0) { //gera valores aleat�rios pra vari�vel do valor de doce enquanto mesada for maior que 0
            Double valorDoce = valorAleatorio();
            
            //condi��o para que n�o passe 0 e d� n�meros negativos
            if(valorDoce > mesada)
                valorDoce = mesada;

            //indica o valor de cada doce
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            
            //subtrai a mesada pelo valor do doce
            mesada = mesada - valorDoce;
        }
        
        //exibe o valor final da mesada e informa que foi totalmente gasta 
        System.out.println("Mesada:" + mesada);
        System.out.println("Jo�ozinho gastou toda a sua mesada em doces");
        
   }
	
	//fun��o para gerar n�meros aleat�rios
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 8);
   }

}


