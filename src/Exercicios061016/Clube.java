package Exercicios061016;

public class Clube {
	
	String Nome; 
	int pontosCasa; 
	int pontosFora; 
	int numJogos; 
	
	public Clube(){}
	
	public Clube(String n){
		this.Nome = n;
		
		
	}

	public Clube(String nome, int pontosCasa, int pontosFora, int numJogos) {
		super();
		Nome = nome;
		this.pontosCasa = pontosCasa;
		this.pontosFora = pontosFora;
		this.numJogos = numJogos;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getPontosCasa() {
		return pontosCasa;
	}

	public void setPontosCasa(int pontosCasa) {
		this.pontosCasa = pontosCasa;
	}

	public int getPontosFora() {
		return pontosFora;
	}

	public void setPontosFora(int pontosFora) {
		this.pontosFora = pontosFora;
	}

	public int getNumJogos() {
		return numJogos;
	}

	public void setNumJogos(int numJogos) {
		this.numJogos = numJogos;
	}
}
