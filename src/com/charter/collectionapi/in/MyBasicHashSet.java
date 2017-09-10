package com.charter.collectionapi.in;

import java.util.HashSet;
import java.util.Iterator;

public class MyBasicHashSet {

	public static void main(String a[]){
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet in Random Order
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));
        System.out.println("Hash Set Iterate Using Iterator");
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
        	
        	System.out.println(itr.next());
        	//hs.add("Raj");//ConcurrentModificationException
        }
        hs.add("Raj");
        // copy Set content to another HashSet
        //Check ConcurrentModificationException
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
        
        }
    }

