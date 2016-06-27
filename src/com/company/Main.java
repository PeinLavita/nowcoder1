package com.company;

import java.util.*;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection<Integer> c = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        c.addAll(Arrays.asList(moreInts));

        Collections.addAll(c, 11,12,13);
        Collections.addAll(c, moreInts);

        List<Integer> list = Arrays.asList(16,17);
        list.set(1,99);



        for (int i:c) {
            System.out.println(i);
        }
    }
}
