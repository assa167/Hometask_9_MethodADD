package com.company;
import java.util.ArrayList;


public class MethodAdd<AD> {
    private int size = 0;
    private Object[] array = new Object[9];

    public void add(AD){
        if (size == array.length) {
            grow(array.length + (array.length/ 2));
        }
        array[size++] = count;
    }

    public void grow(int newLenght) {
        Object[] newArray = new Object[newLenght];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public int size() { return size; }


}
