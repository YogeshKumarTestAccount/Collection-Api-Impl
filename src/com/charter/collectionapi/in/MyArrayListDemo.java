package com.charter.collectionapi.in;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyArrayListDemo {

	public static void main(String args[]) {

		MyArrayListDemo listObj = new MyArrayListDemo();

		// Basic Operation of the List
		listObj.myBasicArrayList();

		// Creating duplicate object of an ArrayList instance.
		// we can done this by using clone() function.
		listObj.myArrayListClone();

		// delete all elements from my ArrayList

		listObj.clearMyArrayList();

		// Reading all elements from ArrayList by using Iterator and for Each

		listObj.arrayListIteratorandForEach();

		// Copying another collection instance objects to existing ArrayList.

		listObj.myArrayListNewCollection();

		// find does ArrayList contains all list elements or not?

		listObj.myElementCheck();

		// How to copy ArrayList to array?
		listObj.myArrayListArray();

		// How to get sub list from ArrayList?

		listObj.myArrayListSubRange();

		// Operation On Collection based on Utility Class Collections

		// Reverse ArrayList content Using Collections

		listObj.myArrayListReverseSortAndSynch();

		// Shuffle elements in ArrayList Using Collections

		listObj.myArrayListShuffle();

		// dynamically typesafe view Using Collections
		// listObj.myCheckedCollection();

		// Check there in no common element between two list objects by using
		// Collections
		listObj.myListDisjoint();

		// Create Empty List with Out Using New Operator

		listObj.emptyList();

		// fill or replace elements of a List or ArrayList?

		listObj.myListFill();

		/*
		 * //convert list to csv string format
		 * 
		 * List<String> li1 = new ArrayList<String>(){ { this.add("animal");
		 * this.add("nuts"); this.add("java"); } };
		 * System.out.println(listObj.getListAsCsvString(li1)); List<String> li2
		 * = new ArrayList<String>(){ { this.add("java"); this.add("unix");
		 * this.add("c++"); } };
		 * System.out.println(listObj.getListAsCsvString(li2));
		 */

	}

	// List Basic Operation

	public void myBasicArrayList() {

		ArrayList<String> al = new ArrayList<String>();
		// add elements to the ArrayList
		al.add("JAVA");
		al.add("C++");
		al.add("PERL");
		al.add("PHP");
		System.out.println(al);
		// get elements by index
		System.out.println("Element at index 1: " + al.get(1));
		System.out.println("Does list contains JAVA? " + al.contains("JAVA"));
		// add elements at a specific index
		al.add(2, "PLAY");
		System.out.println(al);
		System.out.println("Is arraylist empty? " + al.isEmpty());
		System.out.println("Index of PERL is " + al.indexOf("PERL"));
		System.out.println("Size of the arraylist is: " + al.size());

	}

	// Cloning Array List
	public void myArrayListClone() {

		ArrayList<String> arrl = new ArrayList<>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:" + arrl);
		ArrayList<String> copy = (ArrayList<String>) arrl.clone();
		System.out.println("Cloned ArrayList:" + copy);
	}

	// delete all elements from my ArrayList
	public void clearMyArrayList() {
		ArrayList<String> arrl = new ArrayList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:" + arrl);
		arrl.clear();
		System.out.println("After clear ArrayList:" + arrl);
	}

	// Reading all elements from ArrayList by using Iterator.

	public void arrayListIteratorandForEach() {
		ArrayList<String> arrl = new ArrayList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Result Using Iterator");
		Iterator<String> itr = arrl.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Result Using foreach Loop");
		for (String listValue : arrl) {
			System.out.println(listValue);
		}

	}
	// Copying another collection instance objects to existing ArrayList.

	public void myArrayListNewCollection() {
		ArrayList<String> arrl = new ArrayList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:" + arrl);
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		arrl.addAll(list);
		System.out.println("After Copy: " + arrl);
	}

	// find does ArrayList contains all list elements or not?

	public void myElementCheck() {
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		List<String> list = new ArrayList<String>();
		list.add("Second");
		list.add("Random");
		System.out.println("Does ArrayList contains all list elements?: " + arrl.containsAll(list));
		list.add("one");
		System.out.println("Does ArrayList contains all list elements?: " + arrl.containsAll(list));
	}

	// How to copy ArrayList to array?

	public void myArrayListArray() {
		ArrayList<String> arrl = new ArrayList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println("Actual ArrayList:" + arrl);
		String[] strArr = new String[arrl.size()];
		arrl.toArray(strArr);
		System.out.println("Created Array content:");
		for (String str : strArr) {
			System.out.println(str);
		}
	}

	// How to get sub list from ArrayList?

	public void myArrayListSubRange() {
		ArrayList<String> arrl = new ArrayList<String>();
		// adding elements to the end
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		arrl.add("Click");
		System.out.println("Actual ArrayList:" + arrl);
		List<String> list = arrl.subList(2, 4);
		System.out.println("Sub List: " + list);
	}

	// How to reverse ArrayList content?

	public void myArrayListReverseSortAndSynch() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		System.out.println("Results Before reverse and Sorting operation:");
		System.out.println(list);
		// Using Utility Class Collections
		Collections.reverse(list);
		System.out.println("Results after reverse operation:");
		for (String str : list) {
			System.out.println(str);
		}

		Collections.sort(list);
		System.out.println("Results after Sorting operation:");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("Synchronized list got created ...");
		Collections.synchronizedList(list);
		System.out.println("Now at a time one thread Object can use that list");

	}

	// How to shuffle elements in ArrayList?

	public void myArrayListShuffle() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Cric");
		list.add("Play");
		list.add("Watch");
		list.add("Glass");
		list.add("Movie");
		list.add("Girl");
		// Using Utility Class
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:");
		for (String str : list) {
			System.out.println(str);
		}

		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:");
		// Iterating Using For Each loop
		for (String str : list) {
			System.out.println(str);
		}
	}

	// dynamically typesafe view Using Checked Collection
	public void myCheckedCollection() {
		List myList = new ArrayList();
		myList.add("one");
		myList.add("two");
		myList.add("three");
		myList.add("four");
		// Collection chkList = Collections.checkedCollection(myList,
		// String.class);
		List chkList = Collections.checkedList(myList, String.class);

		System.out.println("Checked list content: " + chkList);
		// you can add any type of elements to myList object
		myList.add(10);
		// you cannot add any type of elements to chkList object, doing so
		// throws ClassCastException
		chkList.add(10); // throws ClassCastException
	}

	// Check there in no common element between two list objects by using
	// Collections
	public void myListDisjoint() {
		List<String> sl = new ArrayList<String>();
		sl.add("apple");
		sl.add("java");
		sl.add("c++");
		sl.add("unix");
		sl.add("orange");
		sl.add("airtel");
		List<String> tl = new ArrayList<String>();
		tl.add("job");
		tl.add("oracle");
		tl.add("jungle");
		tl.add("cricket");
		boolean isCommon = Collections.disjoint(sl, tl);
		if (isCommon) {
			System.out.println("Does not found any common elements" + isCommon);
		}
		tl.add("java");
		isCommon = Collections.disjoint(sl, tl);
		if (!isCommon) {
			System.out.println("Common elements found " + isCommon);
		}
	}

	// Create Empty List Using New Operator and Collections

	public void emptyList() {
		List<String> myEmptyListUsingNew = new ArrayList<>();
		Set<String> emptySetUsingCons=new HashSet<String>();
		System.out.println("Empty list Created Using New: " + myEmptyListUsingNew);
		myEmptyListUsingNew.add("Raj");
		System.out.println(" Modification List using New(Mutable List): " + myEmptyListUsingNew);
		List<String> myEmptyList = Collections.<String>emptyList();
		System.out.println("Empty list Created Using Collections: " + myEmptyList);
		
		emptySetUsingCons.add(null);
		emptySetUsingCons.add("Yogee By Constructor");
		System.out.println("Empty Set Created Using New: " + emptySetUsingCons);
		System.out.println(" Modification set using New(Mutable Set): " + emptySetUsingCons);
		List<String> myEmptySet= Collections.<String>emptyList();
		System.out.println("Empty set Created Using Collections: " + myEmptySet);
		myEmptySet.add("Raj");
		System.out.println("Empty After Modification Collections(Immutable Set) " + myEmptySet);

	}

	public void myListFill() {

		List<String> ll = new ArrayList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		System.out.println("Original List: " + ll);
		Collections.fill(ll, "TEMP_STRING");
		System.out.println("After fill: " + ll);
	}

	// How to convert list to csv string format?

	public String getListAsCsvString(List<String> list) {

		StringBuilder sb = new StringBuilder();
		for (String str : list) {
			if (sb.length() != 0) {
				sb.append(",");
			}
			sb.append(str);
		}
		return sb.toString();
	}

}
