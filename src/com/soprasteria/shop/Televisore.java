package com.soprasteria.shop;

public class Televisore extends Prodotto{

	private int size;
	private boolean isSmart;
	
	public Televisore(int codice,String nome,float prezzo,float iva,int size,boolean isSmart) {
		super(codice, nome, prezzo,iva);
		this.setSize(size);
		this.setSmart(isSmart);
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + size + " inc - smart tv:" +  isSmart;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @return the isSmart
	 */
	public boolean isSmart() {
		return isSmart;
	}
	/**
	 * @param isSmart the isSmart to set
	 */
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
}
