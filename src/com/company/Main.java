package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        CustomCollection<String> customCollection = new CustomCollection<>();
        customCollection.add("Samolot 1");
        customCollection.add("Samolot 2");
        customCollection.add("Samolot 3");

        Iterator<String> iterator = customCollection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
