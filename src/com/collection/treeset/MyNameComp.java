package com.collection.treeset;

import java.util.Comparator;
/*
 * 
 * @Yogesh Kumar
 */

public class MyNameComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
        return e1.getName().compareTo(e2.getName());
    } 
}


