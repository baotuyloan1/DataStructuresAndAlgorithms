package org.ctdl.self.stack;

/**
 * @author BAO
 * 7/1/2023
 */
public interface StackADT<T> extends Iterable<T> {
    void push(T element);
    T pop();
    T top();
    int size();
    boolean isEmpty();
}
