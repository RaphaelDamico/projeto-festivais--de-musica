package org.serratec.poo.classes;

public class Cantor extends Artista{
	private Pais pais;

	public Cantor(String nome, double valorCache, Pais pais) {
		super(nome, valorCache);
		this.pais = pais;
	}

	public Pais getPais() {
		return pais;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("""
				País: %s
				""", pais);
	}
}
