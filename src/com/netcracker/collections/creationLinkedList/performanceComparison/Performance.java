package com.netcracker.collections.creationLinkedList.performanceComparison;

import com.netcracker.collections.creationLinkedList.MyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Performance {
    public static void main(String[] args) {
        System.out.println("The time work my linked list is: " + performanceOfMyCollection());
        System.out.println("The time work of Java linked list is: " + performanceOfJavaCollection());
    }

    private static long performanceOfMyCollection() {
        long timeStart;
        timeStart = System.nanoTime();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        for (int i = 1; i <= 100000; i++) myLinkedList.add(i);
        myLinkedList.indexOf(989);
        myLinkedList.set(440, 1101);
        myLinkedList.remove(570);
        myLinkedList.clear();
        return System.nanoTime() - timeStart;
    }

    private static long performanceOfJavaCollection() {
        long timeStart;
        timeStart = System.nanoTime();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 100000; i++) linkedList.add(i);
        linkedList.indexOf(989);
        linkedList.set(440, 1101);
        linkedList.remove(570);
        linkedList.clear();
        return System.nanoTime() - timeStart;
    }
}
