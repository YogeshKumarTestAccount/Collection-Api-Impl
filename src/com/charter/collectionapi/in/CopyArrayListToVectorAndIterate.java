package com.charter.collectionapi.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CopyArrayListToVectorAndIterate {

	public static void main(String[] args) {
		//create an ArrayList object
	    ArrayList arrayList = new ArrayList();
	   
	    //Add elements to Arraylist
	    arrayList.add("1");
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    arrayList.add("4");
	    arrayList.add("5");
	    arrayList.add("6");
	    arrayList.add("7");
	    
	    System.out.println(arrayList.get(0));
	    
	   ListIterator itr=arrayList.listIterator(arrayList.size());
	   System.out.println("List Iterate Using ListIterator");
	   while(itr.hasPrevious())
	   { 
		   System.out.println(itr.previous());
		   
	   }
	   
	   
	   Iterator itr1=arrayList.iterator();
	   System.out.println("List Iterate Using Iterator");
	   while(itr1.hasNext())
	   {
		   System.out.println(itr1.next());
	   }
	    
	   
	   System.out.println("ArrayList Iterating Using forEach Loop");
	   for(Object listObj:arrayList)
	   {
		   
		   System.out.println(listObj);
		   
		   int i=Integer.parseInt((String) listObj);
		   
		   
		   if(i%2==0)
		   {
			   System.out.println("No. "+" "+ i +" Is Even"+" At Index Of"+arrayList.get(i-1));
		   }
			  
		   else
		   {
			   System.out.println("No. "+" "+ i +" Is Odd"+" At Index"+arrayList.get(i-1)); 
		   }
		   
	   }
	    //create a Vector object
	    Vector v = new Vector();
	   
	    //Add elements to Vector
	    v.add("A");
	    v.add("B");
	    v.add("D");
	    v.add("E");
	    v.add("F");
	    v.add("G");
	    v.add("H");
	    
	    Iterator itr2=v.iterator();
		   System.out.println("Vector Iterating Using Iterator");
		   while(itr2.hasNext())
		   {
			   
			   System.out.println(itr2.next());
			   
		   }
		   
		   
		   Enumeration enu =v.elements();
		   System.out.println("Vector Iterating Using Enumeration");
		   while(enu.hasMoreElements())
		   {
			   
			   System.out.println((String)enu.nextElement());
			   
		   }
		   
		  
		   System.out.println("Vector Iterating Using forEach Loop");
		   for(Object s:v)
		   {
			   
			   System.out.println(s);
		   }
	  
	   // System.out.println("Before copy, Vector Contains : " + v);
	   
	    //copy all elements of ArrayList to Vector using copy method of Collections class
	   // Collections.copy(v,arrayList);
	   
	    //System.out.println("After Copy, Vector Contains : " + v);  
	  }

	}

