package org.ctdl.hashtable;

/**
 * @author BAO
 * 7/19/2023
 */
public class Node <K,V>{
    private int hash;
    private K key;
    private V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.hash = key.hashCode();
    }


    public boolean equals(Node<K, V>other){
        if (other.hash != hash)return false;
        return key.equals(other.key);
    }
    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
