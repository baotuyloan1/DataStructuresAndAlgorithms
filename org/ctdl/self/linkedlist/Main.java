package org.ctdl.self.linkedlist;

/**
 * @author BAO
 * 7/1/2023
 */
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DefaultDoublyLinkedList<>();
        doublyLinkedList.add("Bao ne");
        doublyLinkedList.add("ahih");
        doublyLinkedList.add("ahih1");
        doublyLinkedList.add("hello");

        System.out.println(doublyLinkedList + "- " + doublyLinkedList.contains("Bao ne 1"));
        doublyLinkedList.removeAt(0);
        System.out.println(doublyLinkedList);
        System.out.println(doublyLinkedList.indexOf("ahih1"));
        System.out.println(doublyLinkedList.toString());
    }
}
