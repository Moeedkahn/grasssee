package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> temp= new ArrayList<Integer>();
        List<Integer> temp2= new ArrayList<Integer>();
        temp.add(0,1);
        temp.add(1,2);
        temp.add(2,3);
        temp2.add(1);
        temp2.add(4);
        temp2.add(5);
        temp.addAll(0,temp2);


        NavigableSet<Integer> set=new TreeSet<Integer>();

        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);

        System.out.println(set.lower(2));


    }
}
