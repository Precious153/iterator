package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        HashSet<String> names = new HashSet<String>();
        names.add("Precious");
        names.add("Olusayo");
        names.add("Favour");
        names.add("Adebayo");

        System.out.println(names.getClass().getSimpleName());

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            String userNames = namesIterator.next();
            System.out.println(userNames);
        }
    }
}
