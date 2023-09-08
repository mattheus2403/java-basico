package com.matheus.smart_tv;

public class SmartTv {
		
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	//liga a televis�o
	public void ligar() {
		ligada = true;
	}
	
	//desliga a televis�o
	public void desligar() {
		ligada = false;
	}
	
	//aumenta volume da televis�o
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para " + volume + "\n");
	}
	
	//diminui volume da televis�o
	public void abaixarVolume() {
		volume--;
		System.out.println("Diminuindo o volume para " + volume + "\n");
	}
	
	//muda para um canal selecionado
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
	//sobe 1 canal a cima ou avan�a a frente
	public void subirCanal() {
		canal++;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
	//desce 1 canal abaixo ou volta atr�s
	public void diminuirCanal() {
		canal--;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
}
