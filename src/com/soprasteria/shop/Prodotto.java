package com.soprasteria.shop;

public class Prodotto {
	private int codice;
	private String nome;
	private float prezzo;
	private float iva;
	
	public Prodotto(int codice,String nome,float prezzo,float iva) {
		this.codice = codice;
		this.setNome(nome);
		this.setPrezzo(prezzo);
		this.setIva(iva);
	}
	
	public float prezzoVendita(double prezzo, double iva) {
		return (float) ((prezzo * 100) / iva);
	}

	/**
	 * @return the codice
	 */
	public int getCodice() {
		return codice;
	}

	

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the prezzo
	 */
	public float getPrezzo() {
		return prezzo;
	}

	/**
	 * @param prezzo the prezzo to set
	 */
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	/**
	 * @return the iva
	 */
	public float getIva() {
		return iva;
	}

	/**
	 * @param iva the iva to set
	 */
	public void setIva(float iva) {
		this.iva = iva;
	}
	
}
