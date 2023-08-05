package org.ctdl.self.stackDemo;

/**
 * @author BAO
 * 6/30/2023
 */

import java.util.Iterator;

/**
 * stack : LIFO
 */
public interface StackADT<T> extends Iterator<T> {
    void push(T element);
    T pop();
    T top();
    int size();
    boolean isEmpty();
}
