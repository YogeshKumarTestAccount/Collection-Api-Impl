package com.charter.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoUEObjHaveSameHashCode {
    public static void main(String[] args) {

        Map<ReturnIntHashCode, Integer> map = new HashMap<ReturnIntHashCode, Integer>();
        ReturnIntHashCode hs1=  new ReturnIntHashCode(17,"Mango");
        ReturnIntHashCode hs2=  new ReturnIntHashCode(17,"Mango");
        map.put(hs1, 17);

        map.put(hs2, 27);
        System.out.println(map);
       
   /*     Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        map1.put(1, 11);
        map1.put(4, 11);
        System.out.println(map1.hashCode());
        if (map.equals(map1)) {
            System.out.println("equal ");
        }*/
    }

}