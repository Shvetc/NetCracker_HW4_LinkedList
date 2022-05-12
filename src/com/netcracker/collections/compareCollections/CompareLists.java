package com.netcracker.collections.compareCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //performance for method add
        System.out.println("lead time of method 'add': ");
        System.out.println("ArrayList: " + add(arrayList, 100000) +
                ", LinkedList: " + add(linkedList, 100000));

        //performance for method remove
        System.out.println("lead time of method 'remove': ");
        System.out.println("ArrayList: " + remove(arrayList, 185) +
                ", LinkedList: " + remove(linkedList, 185));
    }

    public static long add(List<Integer> list, int size) {
        long startTimeOperation = System.nanoTime();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return System.nanoTime() - startTimeOperation;
    }

    public static long remove(List<Integer> list, int index) {
        long startTimeOperation = System.nanoTime();
        list.remove(index);
        return System.nanoTime() - startTimeOperation;
    }
}
