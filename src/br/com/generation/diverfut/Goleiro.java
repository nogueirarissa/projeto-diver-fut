package br.com.generation.diverfut;

import java.util.Random;

public class Goleiro extends Jogador {

	public final double GOLEIRO_POSICAO_0_POSTURA_0[] = {this.chanceMaxima,this.chanceMaxima,this.chanceMedia,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_0_POSTURA_1[] = {this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,this.chanceMinima,
														this.chanceMaxima,this.chanceMaxima,this.chanceMinima,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_0_POSTURA_2[] = {this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,this.chanceMinima,
														this.chanceMaxima,this.chanceMaxima,this.chanceMedia,this.chanceMinima,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_1_POSTURA_0[] = {this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_1_POSTURA_1[] = {this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,
														this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_1_POSTURA_2[] = {this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,
														this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,this.chanceMinima,
														this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,this.chanceMinima,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_2_POSTURA_0[] = {this.chanceMinima,this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,this.chanceMinima,
														this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,
														this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_2_POSTURA_1[] = {this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,
														this.chanceMinima,this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,this.chanceMinima,
														this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima};

	public final double GOLEIRO_POSICAO_2_POSTURA_2[] = {this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,
														this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,this.chanceMinima,
														this.chanceMinima,this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,this.chanceMinima};
	
	public final double GOLEIRO_POSICAO_3_POSTURA_0[] = {this.chanceMinima,this.chanceMinima,this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,
														this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia};
	
	public final double GOLEIRO_POSICAO_3_POSTURA_1[] = {this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMaxima,this.chanceMaxima,this.chanceMaxima,
														this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia};
	
	public final double GOLEIRO_POSICAO_3_POSTURA_2[] = {this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMaxima,this.chanceMaxima,this.chanceMaxima};
	
	public final double GOLEIRO_POSICAO_4_POSTURA_0[] = {this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMaxima,this.chanceMaxima,
														this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia};
	
	public final double GOLEIRO_POSICAO_4_POSTURA_1[] = {this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMaxima,this.chanceMaxima,
														this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia};
	
	public final double GOLEIRO_POSICAO_4_POSTURA_2[] = {this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMedia,this.chanceMedia,
														this.chanceMinima,this.chanceMinima,this.chanceMinima,this.chanceMaxima,this.chanceMaxima};
	
	private int posicao;
	private int postura;
	private double chances[];

	public Goleiro(String nome, int idade, int genero, int nivel, int posicao, int postura) {
		super(nome, idade, genero, nivel);
		this.posicao = posicao;
		this.postura = postura;
	}
	//Método atualiza postura do jogador
	
	public void posicionar(int novaPosicao, int novaPostura) { 
		this.posicao = novaPosicao;
		this.postura = novaPostura;
	}
	
	public boolean agarrou(int posicaoChute) {
		boolean pegou = true;
		Random r = new Random();
		switch(this.posicao) {
			case 0:
				switch(this.postura) {
					case 0:
						chances = GOLEIRO_POSICAO_0_POSTURA_0;
						break;
					case 1:
						chances = GOLEIRO_POSICAO_0_POSTURA_1;
						break;
					case 2:
						chances = GOLEIRO_POSICAO_0_POSTURA_2;
						break;
				}
				break;
			case 1:
				switch(this.postura) {
				case 0:
					chances = GOLEIRO_POSICAO_1_POSTURA_0;
					break;
				case 1:
					chances = GOLEIRO_POSICAO_1_POSTURA_1;
					break;
				case 2:
					chances = GOLEIRO_POSICAO_1_POSTURA_2;
					break;
			}
				break;
			case 2:
				switch(this.postura) {
				case 0:
					chances = GOLEIRO_POSICAO_2_POSTURA_0;
					break;
				case 1:
					chances = GOLEIRO_POSICAO_2_POSTURA_1;
					break;
				case 2:
					chances = GOLEIRO_POSICAO_2_POSTURA_2;
					break;
			}
				break;
			case 3:
				switch(this.postura) {
				case 0:
					chances = GOLEIRO_POSICAO_3_POSTURA_0;
					break;
				case 1:
					chances = GOLEIRO_POSICAO_3_POSTURA_1;
					break;
				case 2:
					chances = GOLEIRO_POSICAO_3_POSTURA_2;
					break;
			}
				break;
			case 4:
				switch(this.postura) {
				case 0:
					chances = GOLEIRO_POSICAO_4_POSTURA_0;
					break;
				case 1:
					chances = GOLEIRO_POSICAO_4_POSTURA_1;
					break;
				case 2:
					chances = GOLEIRO_POSICAO_4_POSTURA_2;
					break;
			}
				break;
		}
		if(r.nextDouble() > chances[posicaoChute]){
			pegou = false;
		}
		return pegou;
	}
}
