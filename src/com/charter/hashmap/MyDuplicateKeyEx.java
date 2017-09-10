package com.charter.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MyDuplicateKeyEx {
 
    public static void main(String a[]){
         
        HashMap<PriceOverridingEqualAndHashCode, String> hm = new HashMap<PriceOverridingEqualAndHashCode, String>();
        hm.put(new PriceOverridingEqualAndHashCode("Banana", 20), "Banana");
        hm.put(new PriceOverridingEqualAndHashCode("Apple", 40), "Apple");
        hm.put(new PriceOverridingEqualAndHashCode("Orange", 30), "Orange");
        printMap(hm);
        PriceOverridingEqualAndHashCode key = new PriceOverridingEqualAndHashCode("Banana", 20);
        System.out.println("Adding duplicate key...");
        hm.put(key, "Grape");
        System.out.println("After adding dulicate key:");
        printMap(hm);
    }
     
    public static void printMap(HashMap<PriceOverridingEqualAndHashCode, String> map){
         
        Set<PriceOverridingEqualAndHashCode> keys = map.keySet();
        for(PriceOverridingEqualAndHashCode p:keys){
            System.out.println(p+"==>"+map.get(p));
        }
    }
}