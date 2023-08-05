package org.ctdl.self.tree;

import org.ctdl.self.stack.LinkedListBasedStack;
import org.ctdl.self.stack.StackADT;

import java.util.Iterator;

/**
 * @author BAO
 * 7/6/2023
 */
public class BinarySearchTree<T extends Comparable<T>> implements TreeADT<T> {

    private int nodeCount = 0;
    private Node root = null;

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return nodeCount;
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public boolean contains(T element) {
        return contains(root, element);
    }

    @Override
    public boolean add(T element) {
        if (contains(element)) return false;

        root = add(root, element);
        nodeCount++;
        return true;
    }

    @Override
    public boolean remove(T element) {
        if (!contains(element)) return false;
        root = remove(root, element);
        nodeCount--;
        return true;
    }

    private Node remove(Node node, T element) {
        int result = node.getData().compareTo(element);

        if (result > 0) {
            node.setRight(remove(node.getRight(), element));
        } else if (result < 0) {
            node.setLeft(remove(node.getLeft(), element));
        } else {
            if (node.getLeft() == null) {
                Node temp = node.getRight();
                node.setData(null);
                node = null;
                return temp;
            }
            if (node.getRight() == null) {
                Node temp = node.getLeft();
                node.setData(null);
                node = node;
                return temp;
            } else {
                T temp = minRight(node.getRight());
                node.setData(temp);
                node.setRight(remove(node.getRight(), temp));
            }
        }

        return node;

    }

    private T minRight(Node node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return (T) node.getData();
    }

    private T maxLeft(Node node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return (T) node.getData();
    }

    @Override
    public Iterator<T> traverse(TreeTraverseType type) {

        switch (type) {
            case PRE_ORDER -> preOrderTraverse();
            case IN_ORDER -> inOrderTraverse();
            case POST_ORDER -> postOrderTraverse();
            default -> {
                return null;
            }
        }
        return null;
    }

    private Iterator<T> levelOrderTraverse() {
        return null;
    }

    private Iterator<T> postOrderTraverse() {
        return null;
    }

    private Iterator<T> inOrderTraverse() {
        return null;
    }

    private Iterator<T> preOrderTraverse() {
        final int expectedCount = nodeCount;
        StackADT stack = new LinkedListBasedStack();
        stack.push(root);

//        return new Iterator<T>() {
//            @Override
//            public boolean hasNext() {
//                if (expectedCount !=nodeCount) throw  new ConcurrentModificationException();
//                return root !=null && stack.isEmpty();
//            }
//
//            @Override
//            public T next() {
//                return null;
//            }
//        }
        return null;
    }


    private int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
    }

    private boolean contains(Node node, T element) {
        if (node == null) return false;

        int result = element.compareTo((T) node.getData());

        if (result < 0) return contains(node.getLeft(), element);
        else if (result > 0) return contains(node.getRight(), element);
        else return true;
    }

    private Node add(Node node, T element) {
        if (node == null) return new Node(element, null, null);
        else {
            if (node.getData().compareTo(element) < 0) node.setRight(add(node.getRight(), element));
            else {
                node.setLeft(add(node.getLeft(), element));
            }
        }

        return node;
    }
}
