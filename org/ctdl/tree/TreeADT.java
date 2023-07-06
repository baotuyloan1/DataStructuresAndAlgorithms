package org.ctdl.tree;

/**
 * @author BAO
 * 7/5/2023
 */

import java.util.Iterator;

/**
 * Tree , mỗi node kếu nối đên nhiều node khác nhau
 *
 * 2 node cùng cha thì gọi là sibling
 *
 * ancestor(tổ tiên): 1 đường nào đo đi từ root đến con cháu, các node nằm trên đường đó gọi là tổ tiên của con cháu(tính cả root)
 *
 * descendant(con cháu):
 *
 * root là level 0 , con của root là level 1, con của level là level 2.... chia tầng ra
 *
 * depth: khoảng cách từ root đến node đó : a - b -c -d depth a đến d là 3
 *
 * height: khoảng cách từ node đó đến node thấp nhất trong nhánh đó.
 * height của tree là khoảng cách từ node thấp nhất(lá) đến root.
 * nếu chỉ có 1 root duy nhất thì height của nó = 0;
 *
 * size của 1 node chỉ là tổng số node con cháu của node đó + thêm node đó
 *
 * skew tree: là tree mà mỗi node chỉ có 1 node con giống như linkedlist
 * các node chỉ có node con nằm bên trái: left skew tree
 * các node chỉ có node con nằm bên phải: right skew tree
 */
public interface TreeADT<T  extends Comparable<T>> {
    boolean isEmpty();

    int size();

    int height();

    boolean contains(T element);
    boolean add(T element);
    boolean remove (T element);
    Iterator<T> traverse(TreeTraverseType type);

}
