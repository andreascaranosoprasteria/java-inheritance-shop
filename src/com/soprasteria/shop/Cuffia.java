package com.soprasteria.shop;

public class Cuffia extends Prodotto{
	private String colore;
	private boolean isWireless;
	
	public Cuffia(int codice,String nome,float prezzo,float iva,String colore,boolean isWireless) {
		super(codice, nome, prezzo,iva);
		this.setColore(colore);
		this.setWireless(isWireless);
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + colore + " - Wireless:" +  isWireless;
	}
	
	/**
	 * @return the colore
	 */
	public String getColore() {
		return colore;
	}
	/**
	 * @param colore the colore to set
	 */
	public void setColore(String colore) {
		this.colore = colore;
	}
	/**
	 * @return the isWireless
	 */
	public boolean isWireless() {
		return isWireless;
	}
	/**
	 * @param isWireless the isWireless to set
	 */
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
}
