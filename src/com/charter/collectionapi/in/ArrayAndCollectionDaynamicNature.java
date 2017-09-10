package com.charter.collectionapi.in;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayAndCollectionDaynamicNature {

	public static void main(String[] args) throws Exception {

		int arr[] = new int[3];
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter all the elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			System.out.println("At Position of" + i + "Item is" + arr[i]);
		}
		
		//LinkedList collectionOfInteger=new LinkedList();
		
		ArrayList myCollection=new ArrayList();
		
		System.out.println("Please Enter all the elements into the Collection:");
		for (int i = 0; i < 9; i++) {
			myCollection.add("Raj"+s.nextInt());
		}
		
		System.out.println("Collection Size:"+myCollection.size());
		System.out.println("Collection Capacity:"+getArrayListCapacity(myCollection));
		System.out.println("List Is:"+myCollection);
		 myCollection.add(3, "Yogee");
		 myCollection.add(4, "Kmr");
		
		System.out.println("List After Adding New Value:"+myCollection);
		System.out.println("Collection capacity After Adding Value: " 
				+ getArrayListCapacity(myCollection) + 1);
	}
	
	
	
private static int getArrayListCapacity(ArrayList collection) throws Exception{
		
		//get the elementData field from ArrayList class
		Field arrayField = ArrayList.class.getDeclaredField("elementData");
		
		/*
		 * Since the elementData field is private, we need 
		 * to make it accessible first 
		 */
		arrayField.setAccessible(true);
		
		//now get the elementData Object array from our list
		Object[] internalArray = (Object[])arrayField.get(collection);
		
		//Internal array length is the ArrayList capacity!
		return internalArray.length;
	
		
		
		
	}
	

}
