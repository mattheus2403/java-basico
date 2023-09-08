package com.matheus.smart_tv;

public class SmartTv {
		
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	//liga a televisão
	public void ligar() {
		ligada = true;
	}
	
	//desliga a televisão
	public void desligar() {
		ligada = false;
	}
	
	//aumenta volume da televisão
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para " + volume + "\n");
	}
	
	//diminui volume da televisão
	public void abaixarVolume() {
		volume--;
		System.out.println("Diminuindo o volume para " + volume + "\n");
	}
	
	//muda para um canal selecionado
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
	//sobe 1 canal a cima ou avança a frente
	public void subirCanal() {
		canal++;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
	//desce 1 canal abaixo ou volta atrás
	public void diminuirCanal() {
		canal--;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
}
