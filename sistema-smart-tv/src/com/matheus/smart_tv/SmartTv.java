package com.matheus.smart_tv;

public class SmartTv {
		
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
		
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando o volume para " + volume + "\n");
	}
	
	public void abaixarVolume() {
		volume--;
		System.out.println("Diminuindo o volume para " + volume + "\n");
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
	public void subirCanal() {
		canal++;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
	public void diminuirCanal() {
		canal--;
		System.out.println("Novo Canal: " + canal + "\n");
	}
	
}
