package br.com.generation.diverfut;

public class Jogador {

	//Definindo as possibilidades de acerto dos jogadores com base na expertise.
	
	public static final double AMADOR_MAX_POSSIBILIDADE = 0.85;
	public static final double AMADOR_MED_POSSIBILIDADE = 0.65; 
	public static final double AMADOR_MIN_POSSIBILIDADE = 0.47; 
	
	public static final double SEMI_MAX_POSSIBILIDADE = 0.90; 
	public static final double SEMI_MED_POSSIBILIDADE = 0.75;
	public static final double SEMI_MIN_POSSIBILIDADE = 0.62;
	
	public static final double PROFI_MAX_POSSIBILIDADE = 0.95; 
	public static final double PROFI_MED_POSSIBILIDADE = 0.85;
	public static final double PROFI_MIN_POSSIBILIDADE = 0.77; 
	
	public static final double LENDA_MAX_POSSIBILIDADE = 1.00; 
	public static final double LENDA_MED_POSSIBILIDADE = 0.95; 
	public static final double LENDA_MIN_POSSIBILIDADE = 0.92; 
	
	
	public String nome,terceiraPessoa,terceiraPessoaPosse;
	public int idade;
	public int genero;
	public int nivel;
	public double chanceMaxima,chanceMedia,chanceMinima;
	
	public Jogador(String nome, int idade, int genero, int nivel) {
				
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.nivel = nivel;
		
		switch (nivel) {
		
		case 1:
			this.chanceMaxima = AMADOR_MAX_POSSIBILIDADE;
			this.chanceMedia = AMADOR_MED_POSSIBILIDADE;
			this.chanceMinima = AMADOR_MIN_POSSIBILIDADE;
			break;
		case 2:
			this.chanceMaxima = SEMI_MAX_POSSIBILIDADE;
			this.chanceMedia = SEMI_MED_POSSIBILIDADE;
			this.chanceMinima = SEMI_MIN_POSSIBILIDADE;
			break;
		case 3:
			this.chanceMaxima = PROFI_MAX_POSSIBILIDADE;
			this.chanceMedia = PROFI_MED_POSSIBILIDADE;
			this.chanceMinima = PROFI_MIN_POSSIBILIDADE;
			break;
		case 4:
			this.chanceMaxima = LENDA_MAX_POSSIBILIDADE;
			this.chanceMedia = LENDA_MED_POSSIBILIDADE;
			this.chanceMinima = LENDA_MIN_POSSIBILIDADE;
			break;
		}
		
		switch (genero) {
		case 1:
			this.terceiraPessoa = "ela";
			this.terceiraPessoaPosse = "dela";
			break;
		case 2:
			this.terceiraPessoa = "ele";
			this.terceiraPessoaPosse = "dele";
			break;
		case 3:
			this.terceiraPessoa = "elu";
			this.terceiraPessoaPosse = "delu";
			break;
		}
	}

	
	
}
