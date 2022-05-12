package com.netcracker.collections.creationLinkedList.testMain;

import com.netcracker.collections.creationLinkedList.MyLinkedList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        System.out.println("Testing of methods realized linked list:\n");

        addAndOutputElements(myLinkedList);

        deletingElementByIndex(myLinkedList);

        addElement(myLinkedList);

        getIndexOfElem(myLinkedList);

        convertToArray(myLinkedList);

        setElement(myLinkedList);

        clearLinkedList(myLinkedList);
    }

    static void addAndOutputElements(MyLinkedList<Integer> theLinkedList) {
        System.out.println("Adding and output elements: ");
        for (int i = 0; i < 10; i++) {
            theLinkedList.add(i);
        }
        System.out.println(theLinkedList);
        System.out.println("\n");
    }

    static void deletingElementByIndex(MyLinkedList<Integer> theLinkedList) {
        System.out.println("Deleting an element by index: ");
        theLinkedList.remove(4);
        System.out.println(theLinkedList);
        System.out.println("\n");
    }

    static void addElement(MyLinkedList<Integer> theLinkedList) {
        System.out.println("Adding an element to a specific position: ");
        theLinkedList.add(4, 15);
        System.out.println(theLinkedList);
        System.out.println("\n");
    }

    static void getIndexOfElem(MyLinkedList<Integer> theLinkedList) {
        System.out.println("Get index of current the element = 8: ");
        System.out.println(theLinkedList.indexOf(8));
        System.out.println("\n");
    }

    static void convertToArray(MyLinkedList<Integer> theLinkedList) {
        System.out.println("Convert myLinkedList to Array");
        Integer[] listArray = new Integer[10];

        theLinkedList.toArray(listArray);
        for (int i = 0; i < listArray.length; i++) {
            System.out.print(listArray[i]);
            if (i != listArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }

    static void setElement(MyLinkedList<Integer> theLinkedList) {
        System.out.println("Set the element (= 24)  in the end of the current linked list:");
        theLinkedList.set(10, 24);
        System.out.println(theLinkedList);
        System.out.println("\n");
    }

    static void clearLinkedList(MyLinkedList<Integer> theLinkedList) {
        System.out.println("Clear full the current linked list");
        theLinkedList.clear();
        System.out.println(theLinkedList);
    }
}
