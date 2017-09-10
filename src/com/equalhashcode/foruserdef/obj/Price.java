package com.equalhashcode.foruserdef.obj;

public class Price {
	
	  
    private String item;
    private int price;
     
    public Price(String itm, int pr){
        this.item = itm;
        this.price = pr;
    }
     
    public int hashCode(){
        int hashcode = 0;
        hashcode = price*20;
        System.out.println("item.hashCode"+item.hashCode()+"price is"+price);
        hashcode += item.hashCode();
        System.out.println("hashcode of "+this.item+" "+hashcode);
        return hashcode;
    }
     
    public boolean equals(Object obj){
        if (obj instanceof Price) {
            Price pp = (Price) obj;
            System.out.println("pp"+pp);
            System.out.println("In equals Return Value Is "+(pp.item.equals(this.item) && pp.price == this.price));
              
            
            return (pp.item.equals(this.item) && pp.price == this.price);
        } else {
        	System.out.println("Object Not Matching");
        	return false;
        }
    }
     
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
     
    public String toString(){
        return "item: "+item+"  price: "+price;
    }

}
