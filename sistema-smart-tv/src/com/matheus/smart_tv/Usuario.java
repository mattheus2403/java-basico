package com.matheus.smart_tv;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		//status inicial da tv: desligada
		System.out.println("A TV está ligada? " + smartTv.ligada + "\n");
		
		//liga a tv
		smartTv.ligar();
		//status atual
		System.out.println("Novo Status -> TV ligada? " + smartTv.ligada + "\n");
		
		//volume inicial
		System.out.println("Volume inicial: " + smartTv.volume + "\n");
		
		//aumenta volume para 26
		smartTv.aumentarVolume();
		
		//aumenta volume para 27
		smartTv.aumentarVolume();
		
		//aumenta volume para 28
		smartTv.aumentarVolume();
		
		//abaixa volume para 27
		smartTv.abaixarVolume();
		
		//volume atual
		System.out.println("Volume atual: " + smartTv.volume + "\n");
		
		//canal inicial
		System.out.println("Canal inicial: " + smartTv.canal + "\n");
		
		//agora o canal atual foi do 1 ao 4
		smartTv.mudarCanal(4);
		
		//sobe o canal do 4 pro 5
		smartTv.subirCanal();
		
		//sobe o canal do 5 pro 6
		smartTv.subirCanal();
		
		//sobe o canal do 6 pro 5
		smartTv.diminuirCanal();
		
		//canal atual
		System.out.println("Canal atual: " + smartTv.canal + "\n");
		
		//desliga a tv
		smartTv.desligar();
		//status atual
		System.out.println("Novo Status -> TV ligada? " + smartTv.ligada + "\n");
		
	}

}
