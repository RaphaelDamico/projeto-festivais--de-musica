package org.serratec.poo.classes;

public enum Genero {
	ROCK("rock"),
	SAMBA("samba"),
	MPB("mpb");

	
	private String descricaoTextual;

	private Genero(String descricaoTextual) {
		this.descricaoTextual = descricaoTextual;
	}
	
	public String getDescricaoTextual() {
		return descricaoTextual;
	}

}
