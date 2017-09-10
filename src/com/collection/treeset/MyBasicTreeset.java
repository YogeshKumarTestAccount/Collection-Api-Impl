package com.collection.treeset;

import java.util.TreeSet;

public class MyBasicTreeset {
 
    public static void main(String a[]){
         
        @SuppressWarnings("rawtypes")
		TreeSet<Comparable> ts = new TreeSet<Comparable>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Elements: "+ts);
        //check is set empty?
        System.out.println("Is set empty: "+ts.isEmpty());
        //delete all elements from set
        ts.clear();
        System.out.println("Is set empty: "+ts.isEmpty());
        ts.add(3);
        ts.add(10);
        ts.add(1);
        System.out.println("Size of the set: "+ts.size());
        //remove one string
        ts.remove(3);
        System.out.println("Elements: "+ts);
    }
}
