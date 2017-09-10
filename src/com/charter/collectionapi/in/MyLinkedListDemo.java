package com.charter.collectionapi.in;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListDemo {

	public static void main(String[] args) {

		MyLinkedListDemo llObj = new MyLinkedListDemo();
		llObj.basicOperation();
		llObj.addfirst();
		llObj.reverseIterator();
	}

	public void basicOperation() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Orange");
		ll.add("Apple");
		ll.add("Grape");
		ll.add("Banana");
		System.out.println(ll);
		System.out.println("Size of the linked list: " + ll.size());
		System.out.println("Is LinkedList empty? " + ll.isEmpty());
		System.out.println("Does LinkedList contains 'Grape'? " + ll.contains("Grape"));
	}

	public void addfirst() {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println(arrl);
		System.out.println("Adding element at first position...");
		arrl.addFirst("I am first");
		System.out.println(arrl);
		System.out.println("Adding element at first position...");
		arrl.offerFirst("I am first - 2");
		System.out.println(arrl);
	}

	public void reverseIterator() {
		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		Iterator<String> itr = arrl.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
