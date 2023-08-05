package org.ctdl.self.hashtable;

/**
 * @author BAO
 * 7/18/2023
 */
public interface HashTableADT<K, V>  extends Iterable<K> {

    int size();
    boolean isEmpty();
    int hashCodeToIndex(int hashKey);
    void clear();
    boolean has(K key);
    V insert(K key, V value);
    V get(K key);
    V remove(K key);
}
