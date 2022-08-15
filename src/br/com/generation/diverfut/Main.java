package br.com.generation.diverfut;

import java.util.Scanner;
import java.util.Random;

public class Main {

	//funcao para definir goleiro
	
	public static Batedor definirAdversarioBatedor(int nivel) {
		//pode ser adicionado um switch para definir nomes diferentes
		Batedor batedor = new Batedor("Batedor Robô",99,3,nivel,100);
		return batedor;
	}
	
	public static Goleiro definirAdversarioGoleiro(int nivel) {
		//pode ser adicionado um switch para definir nomes diferentes
		Goleiro goleiro = new Goleiro("Batedor Robô",99,3,nivel,0,0);
		return goleiro;
	}
	
	public static int penalti(int goleiroPosicao, int goleiroPostura, int chutePosicao, Goleiro goleiro, Batedor batedor) {
		int gol = 0;
			goleiro.posicionar(goleiroPosicao,goleiroPostura);
			boolean goleiroAgarrou = goleiro.agarrou(chutePosicao);
			if(goleiroAgarrou){
				System.out.println("\n# "+goleiro.nome+" fez a defesa, "+goleiro.terceiraPessoa+" não deixou a bola entrar");
			}else{
				System.out.println("\n# GOOooOOOoOOOoooOOOL!!! É "+batedor.terceiraPessoaPosse+"! "+batedor.nome);
				gol++;
		}
		return gol;
	}
	
	public static void main(String[] args) {
			
		int modoJogo,placarTimeJogador = 0,placarTimeRobo = 0,posicaoChute,posicaoGoleiro,posturaGoleiro,idade,genero,nivel;
		boolean batedorAcertou,penaltisAlternados = true;
		Batedor jogarComoBatedor = null, batedorRobo = null;
		Goleiro jogarComoGoleiro = null, goleiroRobo = null;
		Random r = new Random();
		String nome;
		double psicologico;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		
		//System.out.println("\nEscolha onde voce vai chutar:\n#========================#\n|| [01][02][03][04][05] ||\n|| [06][07][08][09][10] ||\n|| [11][12][13][14][15] ||");	
		System.out.println("\n************\n* DIVERFUT *\n************");
		System.out.println("\nQual modo de jogo você quer?\n[1] - Jogo Rapido\n[2] - Jogo Customizado\n[3] - Como Jogar"); 
		modoJogo = leia.nextInt();
		switch (modoJogo) {
		case 1:
			System.out.println("\nIniciando jogo rapido...");
			jogarComoBatedor = new Batedor("Jogadore",99,3,2,100);
			jogarComoGoleiro = new Goleiro("Jogadore",99,3,2,0,0);
			batedorRobo = new Batedor("Batedor Robô",99,3,2,100);;
			goleiroRobo = new Goleiro("Batedor Robô",99,3,2,0,0);;
			break;
		case 2:
			System.out.println("\nIniciando configurações de jogo customizado...");
			System.out.println("\nMonte seu time");

			//jogarComoGoleiro = definirGoleiro();
			System.out.println("\nDigite o nome de goleire: ");
			nome = leia.next();
			System.out.println("\nDigite o seu gênero: \n[1] - Feminino \n[2] - Masculino \n[3] - Outros");
			genero = leia.nextInt();
			if(genero < 1 || genero > 3){
				do {
					System.out.println("\nEntrada inválida!");
					genero = leia.nextInt();
				}while(genero < 1 || genero > 3);
			}
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nDigite o seu nível de experiência:\n[1] - Amadore \n[2] - Semi-Profissional \n[3] - Profissional \n[4] - Lenda");
			nivel = leia.nextInt();
			if(nivel < 1 || nivel > 4){
				do {
					System.out.println("\nEntrada inválida!");
					nivel = leia.nextInt();
				}while(nivel < 1 || nivel > 4);
			}
			jogarComoGoleiro = new Goleiro(nome,idade,genero,nivel,0,0);
			
			//jogarComoBatedor = definirBatedor();
			System.out.println("\nDigite o nome de batedore: ");
			nome = leia.next();
			System.out.println("\nDigite o seu gênero: \n[1] - Feminino \n[2] - Masculino \n[3] - Outros");
			genero = leia.nextInt();
			if(genero < 1 || genero > 3){
				do {
					System.out.println("\nEntrada inválida!");
					genero = leia.nextInt();
				}while(genero < 1 || genero > 3);
			}
			System.out.println("\nDigite a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nDigite o seu nível de experiência:\n[1] - Amadore \n[2] - Semi-Profissional \n[3] - Profissional \n[4] - Lenda");
			nivel = leia.nextInt();
			if(nivel < 1 || nivel > 4){
				do {
					System.out.println("\nEntrada inválida!");
					nivel = leia.nextInt();
				}while(nivel < 1 || nivel > 4);
			}
			System.out.println("\nDigite seu estado psicológico: ");
			psicologico = leia.nextDouble();
			jogarComoBatedor = new Batedor(nome,idade,genero,nivel,psicologico);
			
			System.out.println("\nE agora o time adversario");
			System.out.println("\nDigite a difuculdade:\n[1] - Fácil \n[2] - Mádia \n[3] - Difícil \n[4] - Lendária");
			nivel = leia.nextInt();
			if(nivel < 1 || nivel > 4){
				do {
					System.out.println("\nEntrada inválida!");
					nivel = leia.nextInt();
				}while(nivel < 1 || nivel > 4);
			}
			batedorRobo = definirAdversarioBatedor(nivel);
			goleiroRobo = definirAdversarioGoleiro(nivel);
			break;			
		case 3:
			System.out.println("Ainda não temos :P");
			break;
		default:
			System.out.println("\nEntrada inválida! Escolha 1 ou 2.");
		}
		}while (modoJogo != 1 && modoJogo != 2);
		
		System.out.println("\nComeçou a cobrança de penaltis"); //TODO: melhorar as frases
		
		//Início do jogo
		
		for(int i=0;i<5;i++) {
			System.out.println("\nVamos para a "+(i+1)+"a rodada!");
			
			if(placarTimeJogador - placarTimeRobo == 3 || placarTimeRobo - placarTimeJogador == 3) {
				penaltisAlternados = false;
				break;
			}else {
			
				//Jogador bate o penalti
				System.out.println("\nÉ a vez de seu time bater...");
				System.out.println("\n"+jogarComoBatedor.nome+" se posiciona...\nOnde "+jogarComoBatedor.terceiraPessoa+" deve chutar?");
				System.out.println("\n#========================#\n|| [01][02][03][04][05] ||\n|| [06][07][08][09][10] ||\n|| [11][12][13][14][15] ||");
				posicaoChute = leia.nextInt() - 1;
				batedorAcertou = jogarComoBatedor.chuteCorreto();
				if(batedorAcertou){
					posicaoGoleiro = r.nextInt(5);
					posturaGoleiro = r.nextInt(3);
					placarTimeJogador = penalti(posicaoGoleiro,posturaGoleiro,posicaoChute,goleiroRobo,jogarComoBatedor) + placarTimeJogador;
				}
			}
				//Jogador defende o penalti
				System.out.println("\nÉ a vez de seu time defender...");
				System.out.println("\n"+jogarComoGoleiro.nome+" se prepara para a defesa...");
				System.out.println("\nOnde "+jogarComoGoleiro.terceiraPessoa+" deve ficar?");
				System.out.println("\n#========================#\n|| [01][02][03][04][05] ||");
				posicaoGoleiro = leia.nextInt() - 1;
				System.out.println("\nComo "+jogarComoGoleiro.terceiraPessoa+" deve ficar?");
				System.out.println("\n[1] - Pulando\n[2] - De braços abertos\n[3] - Agachado");
				posturaGoleiro = leia.nextInt() - 1;
				batedorAcertou = batedorRobo.chuteCorreto();
				
				if(batedorAcertou){
					placarTimeRobo = penalti(posicaoGoleiro,posturaGoleiro,posicaoChute,jogarComoGoleiro,batedorRobo) + placarTimeRobo;
				}
				//placar do jogo
				System.out.println("\nPlacar do jogo:\nJogador "+placarTimeJogador+" X "+placarTimeRobo+" Robos");
			}
		if(penaltisAlternados && placarTimeJogador == placarTimeRobo) {
			System.out.println("\nA decisão vai para os penaltis alternados!");
			do{
				//Jogador bate o penalti
				System.out.println("\nÉ a vez de seu time bater...");
				System.out.println("\n"+jogarComoBatedor.nome+" se posiciona...\nOnde "+jogarComoBatedor.terceiraPessoa+" deve chutar?");
				System.out.println("\n#========================#\n|| [01][02][03][04][05] ||\n|| [06][07][08][09][10] ||\n|| [11][12][13][14][15] ||");
				posicaoChute = leia.nextInt() - 1;
				batedorAcertou = jogarComoBatedor.chuteCorreto();
				if(batedorAcertou){
					posicaoGoleiro = r.nextInt(5);
					posturaGoleiro = r.nextInt(3);
					placarTimeJogador = penalti(posicaoGoleiro,posturaGoleiro,posicaoChute,goleiroRobo,jogarComoBatedor) + placarTimeJogador;
				}
				//Jogador defende o penalti
				System.out.println("\nÉ a vez de seu time defender...");
				System.out.println("\n"+jogarComoGoleiro.nome+" se prepara para a defesa...");
				System.out.println("\nOnde "+jogarComoGoleiro.terceiraPessoa+" deve ficar?");
				System.out.println("\n#========================#\n|| [01][02][03][04][05] ||");
				posicaoGoleiro = leia.nextInt() - 1;
				System.out.println("\nComo "+jogarComoGoleiro.terceiraPessoa+" deve ficar?");
				System.out.println("\n[1] - Pulando\n[2] - De braços abertos\n[3] - Agachado");
				posturaGoleiro = leia.nextInt() - 1;
				batedorAcertou = batedorRobo.chuteCorreto();
				
				if(batedorAcertou){
					placarTimeRobo = penalti(posicaoGoleiro,posturaGoleiro,posicaoChute,jogarComoGoleiro,batedorRobo) + placarTimeRobo;
				}
				System.out.println("\nPlacar do jogo:\nJogador "+placarTimeJogador+" X "+placarTimeRobo+" Robos");
			}while(placarTimeJogador == placarTimeRobo);
		}
		
		if(placarTimeJogador > placarTimeRobo){
			System.out.println("\nParabens, Você ganhou!!!");
			System.out.println("\nPlacar do final:\nJogador "+placarTimeJogador+" X "+placarTimeRobo+" Robos");
		}else {
			System.out.println("\nQue pena, você perdeu :(");
			System.out.println("\nPlacar do final:\nJogador "+placarTimeJogador+" X "+placarTimeRobo+" Robos");
		}
		leia.close();
	}
}
