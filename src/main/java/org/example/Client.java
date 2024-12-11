package org.example;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Grapes");
        arrayList.add("Pineapple");
        Iterator<String> iterator = arrayList.iterator();


        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(iterator);
        while (iteratorEnumeration.hasMoreElements()) {
            System.out.println(iteratorEnumeration.nextElement());
        }
        Enumeration<String> enumeration = new Vector<String>(arrayList).elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
