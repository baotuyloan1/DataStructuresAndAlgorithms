package org.ctdl.hashtable;

import org.ctdl.linkedlist.DoublyLinkedList;

import java.util.Iterator;

/**
 * @author BAO
 * 7/19/2023
 */
public class SeparateChainingHashTable <K,V> implements HashTableADT<K,V>{
    private static final int DEFAULT_CAPACITY  = 10;
    private static final double DEFAULT_LOAD_FACTOR = 0.5;

    private  double loadFactor ;
    private int  size = 0,capacity,threshold;

    private DoublyLinkedList<Node<K,V>>[] table;

    public SeparateChainingHashTable(double loadFactor, int capacity) {
        if (capacity<0)throw  new IllegalArgumentException("Capacity phai lon hon khong");
        if (loadFactor<= 0)
        this.loadFactor = loadFactor;
        this.capacity = capacity;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int hashCodeToIndex(int hashKey) {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean has(K key) {
        return false;
    }

    @Override
    public V insert(K key, V value) {
        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public Iterator<K> iterator() {
        return null;
    }
}
