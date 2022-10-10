package com.soprasteria.shop;

public class Smartphone extends Prodotto{
	private String IMEI;
	private int memoria;
	
	public Smartphone(int codice,String nome,float prezzo,float iva, String IMEI,int memoria) {
		super(codice, nome, prezzo,iva);
		this.setIMEI(IMEI);
		this.setMemoria(memoria);
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + IMEI + " - " + memoria + "gb";
	}
	
	/**
	 * @return the iMEI
	 */
	public String getIMEI() {
		return IMEI;
	}
	/**
	 * @param iMEI the iMEI to set
	 */
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	/**
	 * @return the memoria
	 */
	public int getMemoria() {
		return memoria;
	}
	/**
	 * @param memoria the memoria to set
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
}
