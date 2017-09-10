package com.charter.comprable.and.comprator;

import java.util.Comparator;


public class MyFruitCompratorclass implements Comparator<MyFruitCompratorclass> {

	
	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public MyFruitCompratorclass(){}
	public MyFruitCompratorclass(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	@Override
	public String toString() {
		return "MyFruitCompratorclass [fruitName=" + fruitName + ", fruitDesc=" + fruitDesc + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int compare(MyFruitCompratorclass obj1, MyFruitCompratorclass obj2) {
		String FruitDesc1=obj1.getFruitDesc();
		String fruitDesc2=obj2.getFruitDesc();
		
		return FruitDesc1.compareTo(fruitDesc2);
	}

	

	
}
