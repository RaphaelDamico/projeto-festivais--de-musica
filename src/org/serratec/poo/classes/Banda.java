package org.serratec.poo.classes;

public class Banda extends Artista {
	private Pais pais;
	private int quantidadeIntegrantes;
	public Banda(String nome, double valorCache, Pais pais, int quantidadeIntegrantes) {
		super(nome, valorCache);
		this.pais = pais;
		this.quantidadeIntegrantes = quantidadeIntegrantes;
	}
	public int getQuantidadeIntegrantes() {
		return quantidadeIntegrantes;
	}
	public void setQuantidadeIntegrantes(int quantidadeIntegrantes) {
		this.quantidadeIntegrantes = quantidadeIntegrantes;
	}
	public Pais getPais() {
		return pais;
	}
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + String.format("""
				País: %s
				Quantidade de integrantes: %d
				""", pais, quantidadeIntegrantes);
	}
	
	
	
}
