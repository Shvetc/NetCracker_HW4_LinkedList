package com.netcracker.collections.compareCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareSets {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        //performance for method add
        System.out.println("Lead time of method 'add': ");
        System.out.println("HashSet: " + add(hashSet, 80000) + ", LinkedHashSet: " + add(linkedHashSet, 80000)
                + ", TreeSet: " + add(treeSet, 80000));

        //performance for method remove
        System.out.println("Lead time of method 'remove': ");
        System.out.println("HashSet: " + remove(hashSet, 9) + ", LinkedHashSet: " + remove(linkedHashSet, 9)
                + ", TreeSet: " + remove(treeSet, 9));

    }

    public static long add(Set<Integer> set, int size) {
        long startTimeOperation = System.nanoTime();
        for (int i = 0; i < size; i++) {
            set.add(i);
        }
        return System.nanoTime() - startTimeOperation;
    }

    public static long remove(Set<Integer> set, int index) {
        long startTimeOperation = System.nanoTime();
        set.remove(index);
        return System.nanoTime() - startTimeOperation;
    }
}
