package com.charter.comprable.and.comprator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ArraySortingWithOutCompandComprator {
	

	public static void main(String args[])
	{
		//Short list
		List<Fruits> fruitsList = new ArrayList<Fruits>();
		fruitsList.add(new Fruits("Apple", "Apple Desc", 30));
		fruitsList.add(new Fruits("Orange", "Orange Desc", 40));
		fruitsList.add(new Fruits("Banana", "Banana Desc", 50));
		fruitsList.add(new Fruits("Coconut", "Coconut Desc", 30));
        TreeSet<Fruits> tr=new TreeSet<Fruits>();
        tr.add(new Fruits("Apple", "Apple Desc", 30));
        tr.add(new Fruits("Orange", "Orange Desc", 40));
		tr.add(new Fruits("Banana", "Banana Desc", 50));
		tr.add(new Fruits("Coconut", "Coconut Desc", 30));
		
		
		System.out.println("===========================NOTE Comparable require for Custome sorting and it can sort one property at a time ===========================");
		
		System.out.println("===========================Sorted List of Fruits based on FruitsName Using Comparable===========================");
	
		System.out.println("Sorted List Of Fruits : "+sortList(fruitsList));
	
		System.out.println("===========================Sortedo List of Fruits based on FruitsDesc and FruitQuantity Using Comprator===========================");
	
		System.out.println("Sorted List Of Fruits bsed on Desc: "+sortListComprator(fruitsList));
		System.out.println("Sorted List Of Fruits bsed on Quantity: "+SortListQuantity(fruitsList));
		
		System.out.println("===========================Sorted Fruits of  Array===========================");
		//Short Array
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"};
		//int[] fruits = new int[] {5,2, 5, 4};
	    String[] fruitsArray=sortArray(fruits);
		int i=0;
		for(String temp: fruitsArray){
			System.out.println("fruits " + ++i + " : " + temp);
		}
		
		System.out.println("===========================Fruits List can be sorted using TreeSet ===========================");
		System.out.println("===========================With Out Using Collections.sort() TreeSet implements SortedSet By Default ===========================");
		System.out.println("Sorted Set By Default implementing comprable"+tr);
		System.out.println("===========================Fruits List can be sorted using TreeSet using Comprator ===========================");
	
		   TreeSet<MyFruitCompratorclass> trcomp=new TreeSet<MyFruitCompratorclass>(new MyFruitCompratorclass());
		   trcomp.add(new MyFruitCompratorclass("Apple", "Apple Desc", 30));
		   trcomp.add(new MyFruitCompratorclass("Orange", "Orange Desc", 40));
		   trcomp.add(new MyFruitCompratorclass("Banana", "Banana Desc", 50));
		   trcomp.add(new MyFruitCompratorclass("Coconut", "Coconut Desc", 30));
		   System.out.println("Sorted Set By using Comprator"+trcomp);
	}



	public static String[] sortArray(String[] fruits)
	{
		Arrays.sort(fruits);
		return fruits;
	}
	public static List<Fruits> sortList(List<Fruits>fruitsList)
	{
		Collections.sort((fruitsList));
		return fruitsList;
	}
	
	public static List<Fruits> sortListComprator(List<Fruits>fruitsList)
	{
		Collections.sort(fruitsList,Fruits.FruitDescComparator);
		return fruitsList;
	}
	
	private static List<Fruits> SortListQuantity(List<Fruits> fruitsList) {
		Collections.sort(fruitsList,Fruits.FruitQuaComparator);
		return fruitsList;
	}
	
}
