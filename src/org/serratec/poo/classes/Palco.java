package org.serratec.poo.classes;

import java.time.LocalDateTime;


public class Palco {
	private String nomePalco;
	private  int capacidade;
	private LocalDateTime horarios;
	public Palco(String nomePalco, int capacidade, LocalDateTime horarios) {
		super();
		this.nomePalco = nomePalco;
		this.capacidade = capacidade;
		this.horarios = horarios;
	}
	public String getNomePalco() {
		return nomePalco;
	}
	public void setNomePalco(String nomePalco) {
		this.nomePalco = nomePalco;
	}
	public LocalDateTime getHorarios() {
		return horarios;
	}
	public void setHorarios(LocalDateTime horarios) {
		this.horarios = horarios;
	}
	public int getCapacidade() {
	
		return capacidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("""
				Nome do palco: %s
				Capacidade máxima de público: %d
				Horários: %s
				""", nomePalco, capacidade, horarios);
	}
}
