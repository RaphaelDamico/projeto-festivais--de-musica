package org.serratec.poo.principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.poo.classes.Artista;
import org.serratec.poo.classes.Banda;
import org.serratec.poo.classes.Cantor;
import org.serratec.poo.classes.Genero;
import org.serratec.poo.classes.Pais;
import org.serratec.poo.classes.Palco;

public class Festival {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Artista> lista = new ArrayList<>();
		List<Palco> lista2 = new ArrayList<>();
	
		Artista artista;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Pais brasil = new Pais("Brasil");
		Pais estadosUnidos = new Pais("Estados Unidos");
		System.out.print("Número de artistas que irão participar do festival:");
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do show nº " + (i + 1) + ": ");
			System.out.print("Será uma banda ou será um cantor (b/c)? ");
			String tipo = sc.nextLine();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Valor do cachê: ");
			double valorCache = sc.nextDouble();
			sc.nextLine();
			
			if(tipo.equalsIgnoreCase("b")) {
				System.out.print("Quantos integrantes tem a banda? ");
				int quantidade = sc.nextInt();
				lista.add(new Banda(nome, valorCache, brasil, quantidade));
				//artista.setGenero(Genero.ROCK);
			
			}else if(tipo.equalsIgnoreCase("c")) {
				 lista.add(new Cantor(nome, valorCache, estadosUnidos));
				 //artista.setGenero(Genero.MPB);
			}
			System.out.print("Qual é o nome do palco, m- Mundo ou s- Sunset? ");
			String nomePalco = sc.nextLine();
			int capacidade;
			
			for(i = 0; i < 0; i++) {
				System.out.print("Data e hora do show: ");
				LocalDateTime horario = LocalDateTime.parse(sc.nextLine(), fmt);
				if(nomePalco.equalsIgnoreCase("m")) {
					capacidade = 50000;
					lista2.add(new Palco(nomePalco, capacidade, horario));
					
				} else if(nomePalco.equalsIgnoreCase("s")) {
					capacidade = 25000;
					lista2.add(new Palco(nomePalco, capacidade, horario));
					
				}
			}	
				
			System.out.println("Dados do Evento: ");
			for(Artista a : lista) {
				System.out.println(a);
			}
			for (Palco palco : lista2) {
				System.out.println(palco);
			}
			
		}
		
		
		sc.close();
	}
}
