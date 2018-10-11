package com.example.lib;

import java.util.ArrayList;

public class MyClass {

    public MyClass() {

    }

    /**
     * Creates a list with as many elements as provided
     * in the elementCount {@link int} parameter.
     * @param count {@link int} elements to be added
     * @return {@link ArrayList <String>} list of elements
     */
    public ArrayList<String> createList(int count) {

        ArrayList<String> elements = new ArrayList<>(count);
        for(int i=0; i<count; i++) {
            elements.add("Element " + i);
        }
        return elements;
    }
}
