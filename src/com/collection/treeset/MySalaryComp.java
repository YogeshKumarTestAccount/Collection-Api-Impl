package com.collection.treeset;

import java.util.Comparator;
/*
 * 
 * @Yogesh Kumar
 */

public class MySalaryComp implements Comparator<Empl>{
 
    @Override
    public int compare(Empl e1, Empl e2) {
    	if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
