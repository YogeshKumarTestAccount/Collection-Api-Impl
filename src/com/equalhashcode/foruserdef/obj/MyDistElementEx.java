 package com.equalhashcode.foruserdef.obj;

import java.util.LinkedHashSet;

public class MyDistElementEx {
	public static void main(String a[]){
        
        LinkedHashSet<Price> lhm = new LinkedHashSet<Price>();
        
	        lhm.add(new Price("Banana", 20));
	        lhm.add(new Price("Apple", 30));
	        lhm.add(new Price("Orange", 40));
        //System.out.println(lhm.add(new Price("Banana", 20))+" "+lhm.hashCode());
        //System.out.println(lhm.add(new Price("Apple", 30))+" "+lhm.hashCode());
        //System.out.println( lhm.add(new Price("Orange", 40))+" "+lhm.hashCode());
        for(Price pr:lhm){
            System.out.println(pr);
        }
        Price duplicate = new Price("Banana", 20);
        Price nonDuplicate = new Price("Mango", 50);
        System.out.println("inserting duplicate object...");
       // System.out.println("lhm.add(duplicate)"+lhm.add(duplicate)+" "+lhm.hashCode());
        System.out.println("lhm.add(duplicate)"+lhm.add(duplicate));
        System.out.println("lhm.add(nonDuplicate)"+lhm.add(nonDuplicate));
        System.out.println("After insertion:");
        for(Price pr:lhm){
            System.out.println(pr);
        }
    }

}
