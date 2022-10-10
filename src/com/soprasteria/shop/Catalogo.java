package com.soprasteria.shop;

import java.util.Scanner;

public class Catalogo {
	/*
	 * creare la classe Prodotto che gestisce i prodotti dello shop. 
	 * Un prodotto è caratterizzato da: 
	 * - codice (numero intero) - nome
	 * - marca 
	 * - prezzo 
	 * - iva 
	 * 
	 *  - il codice prodotto sia accessibile solo in lettura 
	 *  - gli altri attributi siano accessibili sia in lettura che in scrittura 
	 *  - il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva 
	 *   shop gestisce diversi tipi di prodotto: 
	 *   - Smarphone, caratterizzati anche dal 
	 *   	codice IMEI e dalla quantità di memoria 
	 *   - Televisori, caratterizzati dalle dimensioni e dalla
	 * proprietà di essere smart oppure no 
	 * 
	 * 
	 * - Cuffie, caratterizzate dal colore e se
	 * sono wireless o cablate Utilizzate l’ereditarietà per riutilizzare il codice
	 * di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di
	 * prodottoBONUS: create una classe Catalogo con metodo main, in cui chiedete
	 * all’utente di valorizzare un catalogo di prodotti con dati inseriti tramite
	 * scanner. Durante la richiesta di valorizzazione chiedete all’utente se sta
	 * inserendo un o Smarphone o un Televisore o Cuffie e in base alla scelta
	 * dell’utente utilizzate il costruttore opportuno. Al termine dell’inserimento
	 * stampate il catalogo (fate l’override del metodo toString per restituire le
	 * informazioni da stampare per ogni classe)Buon lavoro!
	 */
	final static int N = 2;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Prodotto[] prodotti = new Prodotto[N];
		String risposta;
		String nome;
		int codice;
		for (int i = 0; i < prodotti.length; i++) {
			System.out.println("[1]Smartphone,[2]Televisore,[3]Cuffie");
			risposta = sc.nextLine();
		
			System.out.println("Codice");
			codice = Integer.parseInt(sc.nextLine());
			System.out.println("Nome");
			nome = sc.nextLine();
			
			if(risposta.equals("1")) {
				prodotti[i] = new Smartphone(codice, nome, 200.50f, 22.22f, "IMEI-XXXXXXXX", 128);
			}
			else if(risposta.equals("2")) {
				prodotti[i] = new Televisore(codice, nome, 500.20f, 22.22f, 64, false);
			}
			else if(risposta.equals("3")) {
				prodotti[i] = new Cuffia(codice, nome, 100.00f, 22.22f,"White",true);
			}
			else prodotti[i] = new Prodotto(codice,nome,1000f,22.22f);
		}
		for (int i = 0; i < prodotti.length; i++) {
			System.out.println(prodotti[i].toString());
			System.out.println("Prezzo : " + prodotti[i].prezzoVendita(prodotti[i].getPrezzo(),prodotti[i].getIva()));
		}
		sc.close();
	}

}
