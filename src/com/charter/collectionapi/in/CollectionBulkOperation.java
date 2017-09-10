package com.charter.collectionapi.in;


import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class CollectionBulkOperation {
   public static void main(String args[]) {

   // create an empty array list1 with an initial capacity
   Collection<Integer> arrlist = new ArrayList<Integer>();
	
   arrlist.add(20);
   arrlist.add(45);

   // let us print all the elements available in list1
   System.out.println("Printing list1:");
   for (Integer number : arrlist) {
   System.out.println("Number = " + number);
   }

   // create an empty array list2 with an initial capacity
   ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);
	
   // use add() method to add elements in list2
   arrlist2.add(25);
   arrlist2.add(30);
   arrlist2.add(31);
   arrlist2.add(35);

   // let us print all the elements available in list2
   System.out.println("Printing list2:");
   for (Integer number : arrlist2) {
   System.out.println("Number = " + number);
   }

   // inserting all elements, list2 will get printed after list1
   arrlist.addAll(arrlist2);
   //arrlist.remove(12);
   System.out.println("Printing all the elements for List one and two");
   // let us print all the elements available in list1
   for (Integer number : arrlist) {
   System.out.println("Number = " + number);
   }
   
   arrlist.removeAll(arrlist2);
   System.out.println("Printing all the elements after removing list-2");
   // let us print all the elements available in list1
   if(arrlist.contains(454))
   {
	   System.out.println("Yes Number is Exist " );
   }
   else
   {
	   System.out.println(" Number is Not Exist " );
   }
   for (Integer number : arrlist) {
	   
   System.out.println("Number = " + number);
   }
   }
}