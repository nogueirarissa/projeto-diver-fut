package br.com.generation.diverfut;

import java.util.Random;

public class Batedor extends Jogador {
	
	private double psicologico;
	

	public Batedor(String nome, int idade, int genero, int nivel, double psicologico) {
		super(nome, idade, genero, nivel);
		this.psicologico = psicologico;
		
	}
	
	//Define se o jogador consegue direcionar a bola onde ele queria
	public boolean chuteCorreto(){
		boolean chutou = true;
		Random r = new Random();
		if(r.nextDouble() > psicologico){
			System.out.println(this.nome + " chutou na traaaaaaaaaveeeeee!!!!!!");
			chutou = false;
			return chutou;
		}
		if(r.nextDouble() > this.chanceMaxima){
			chutou = false;
			System.out.println(this.nome + " chutou forte demais e a bola foi para fora");
			return chutou;
		}
		return chutou;
	}
	
}
