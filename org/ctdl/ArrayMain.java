package org.ctdl;

import org.ctdl.arraylistdemo.DynamicArray;

/**
 * @author BAO
 * 6/30/2023
 */
public class ArrayMain {

    public static void main(String[] args) {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("A");
        dynamicArray.add("B");

        System.out.println(dynamicArray.toString());
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.get(5));


    }
}
