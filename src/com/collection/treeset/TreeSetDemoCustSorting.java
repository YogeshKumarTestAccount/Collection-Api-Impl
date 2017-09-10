package com.collection.treeset;

import java.util.TreeSet;

/*
 * 
 * @Yogesh Kumar
 */
public class TreeSetDemoCustSorting {


	public static void main(String a[]){
		
		
		System.out.println("=============By using salary Int Comparison using Comparable==============");
		TreeSet<Empl> nameComp1 = new TreeSet<Empl>();
		nameComp1.add(new Empl("Ram",3000));
		nameComp1.add(new Empl("John",6000));
		nameComp1.add(new Empl("Crish",2000));
		nameComp1.add(new Empl("Tom",2400));
		for(Empl e:nameComp1){
			System.out.println(e);
		}
		//By using name comparator (String comparison)
		System.out.println("=============By using name comparator==============");
		TreeSet<Empl> nameComp = new TreeSet<Empl>(new MyNameComp());
		nameComp.add(new Empl("Ram",3000));
		nameComp.add(new Empl("John",6000));
		nameComp.add(new Empl("Crish",2000));
		nameComp.add(new Empl("Tom",2400));
		for(Empl e:nameComp){
			System.out.println(e);
		}
		System.out.println("=============By using salary comparator==============");
		//By using salary comparator (int comparison)
		TreeSet<Empl> salComp = new TreeSet<Empl>(new MySalaryComp());
		salComp.add(new Empl("Ram",3000));
		salComp.add(new Empl("John",6000));
		salComp.add(new Empl("Crish",2000));
		salComp.add(new Empl("Tom",2400));
		for(Empl e:salComp){
			System.out.println(e);
		}
	}




	
}
