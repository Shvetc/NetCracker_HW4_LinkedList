package com.netcracker.collections.compareCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CompareMaps {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        //performance for method add
        System.out.println("Lead time of method 'put': ");
        System.out.println("HashMap: " + put(hashMap, 100000) +
                ", LinkedHashMap: " + put(linkedHashMap, 100000) +
                ", TreeMap: " + put(treeMap, 100000));

        //performance for method remove
        System.out.println("Lead time of method 'remove': ");
        System.out.println("HashMap: " + remove(hashMap, 297) +
                ", LinkedHashMap: " + remove(linkedHashMap, 297) +
                ", TreeMap: " + remove(treeMap, 297));
    }

    public static long put(Map<Integer, Integer> map, int size) {
        long startTimeOperation = System.nanoTime();
        for (int i = 0; i < size; i++) {
            map.put(i, i);
        }
        return System.nanoTime() - startTimeOperation;
    }

    public static long remove(Map<Integer, Integer> map, int valueKey) {
        long startTimeOperation = System.nanoTime();
        map.remove(valueKey);
        return System.nanoTime() - startTimeOperation;
    }
}
