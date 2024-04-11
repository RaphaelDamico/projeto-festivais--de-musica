package org.serratec.poo.classes;

public abstract class Artista {
	private String nome; 
	private Genero genero;
	private double valorCache;
	
	public Artista(String nome, Genero genero double valorCache) {
		
		this.nome = nome;
		this.valorCache = valorCache;
	}

	public String getNome() {
		return nome;
	}


	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public double getValorCache() {
		return valorCache;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("""
				Nome: %s
				Genero: %s
				Valor do Cachê: R$%.2f
				""", nome, genero, valorCache);
	}
	
}
