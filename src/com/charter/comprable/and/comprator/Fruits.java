package com.charter.comprable.and.comprator;

import java.util.Comparator;

public class Fruits implements Comparable<Fruits> {
	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruits(String fruitName, String fruitDesc, int quantity) {
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
		return "[fruitName=" + fruitName + ", fruitDesc=" + fruitDesc + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruitDesc == null) ? 0 : fruitDesc.hashCode());
		result = prime * result + ((fruitName == null) ? 0 : fruitName.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruits other = (Fruits) obj;
		if (fruitDesc == null) {
			if (other.fruitDesc != null)
				return false;
		} else if (!fruitDesc.equals(other.fruitDesc))
			return false;
		if (fruitName == null) {
			if (other.fruitName != null)
				return false;
		} else if (!fruitName.equals(other.fruitName))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public int compareTo(Fruits obj) {
		// TODO Auto-generated method stub
		int fruitQuantity = obj.getQuantity();

		
		// Ascending Order Sorting based On Quantity

		
		 if(fruitQuantity>this.quantity) { return -1; } else
		 if(fruitQuantity<this.quantity) { return 1; } else return 0;
		 

		// return this.quantity - fruitQuantity;

		
		// Descending Order Sorting Based on Quantity

		/*
		 * if(fruitQuantity>this.quantity) { return 1; } else
		 * if(fruitQuantity<this.quantity) { return -1; } else return 0;
		 */
		// return fruitQuantity-this.quantity;

		// Based On Fruit name Accenting Order
		
		// return this.fruitName.compareTo(obj.getFruitName());
		
		// Based On Fruit name Descending Order
		//return obj.getFruitName().compareTo(this.fruitName);

	}

	public static Comparator<Fruits> FruitDescComparator
    = new Comparator<Fruits>() {
	public int compare(Fruits obj1, Fruits obj2) {	
		String FruitDesc1=obj1.getFruitDesc();
		String fruitDesc2=obj2.getFruitDesc();
		
		return FruitDesc1.compareTo(fruitDesc2);
	 }
	};
	
	
	public static Comparator<Fruits> FruitQuaComparator=new Comparator<Fruits>() {

		@Override
		public int compare(Fruits obj1, Fruits obj2) {
			Integer fruitQty1=obj1.getQuantity();
			Integer fruitQty2=obj2.getQuantity();
			return fruitQty1.compareTo(fruitQty2);
		}
		
	};
}