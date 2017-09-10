package com.charter.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyObjectKeySearch {
	 
public static void main(String a[]){
         
        HashMap<PriceOverridingEqualAndHashCode, String> hm = new HashMap<PriceOverridingEqualAndHashCode, String>();
        hm.put(new PriceOverridingEqualAndHashCode("Mango", 20), "Banana");
        hm.put(new PriceOverridingEqualAndHashCode("Apple", 40), "Apple");
        hm.put(new PriceOverridingEqualAndHashCode("Orange", 30), "Orange");
        printMap(hm);
        PriceOverridingEqualAndHashCode key = new PriceOverridingEqualAndHashCode("Banana", 20);
        System.out.println("Does key available? "+hm.containsKey(key));
    }
     
    public static void printMap(HashMap<PriceOverridingEqualAndHashCode, String> map){
         
        Set<PriceOverridingEqualAndHashCode> keys = map.keySet();
        for(PriceOverridingEqualAndHashCode p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}