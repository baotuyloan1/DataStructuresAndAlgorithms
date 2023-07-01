package org.ctdl.arraylistdemo;

/**
 * @author BAO
 * 6/30/2023
 */

import java.util.Iterator;

/**
 * dynamic array chứa static array. static array có size cố định. Khi chúng ta new  1 dynamic array thì nó tạo ra 1 static array bên trong dynamic array để nó biết đưuọc có bao nhiêu phần tử. Ví dụ như khi dynamic array khai báo 10 phần tử ban đầu, thì static  array trong dynamic array sẽ có length là 0. khi ta dùng dynamicArray.length nó sẽ lấy size của static array bên trong nó . khi thêm 1 phần tử thì static array mới sẽ được tạo ra và copy từ static array cũ sang static array mới.
 * <p>
 * các phần tử trong array phải nằm cạnh nhau. nếu trong bộ nhớ còn 8 ô cạnh không nằm cạnh nhau thì cũng không thể lưu mảng có 8 phần tử được nó sẽ tìm những vị tr có 8 ô liền kề nhau rồi insert vào. nếu thê 1 phần từ là 9 element thì nó sẽ tìm 1 chỗ có 9 element rồi nó đẩy vào
 */
public class DynamicArray<T> implements Iterable {

    private T[] arr;
    private int capacity = 0;
    private int size = 0;

    public DynamicArray() {
        this(10);
    }


    public DynamicArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Capacity can not be negative: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T element) {
        arr[index] = element;

    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    public void add(T element) {
        if (size >= capacity - 1) {
            if (capacity == 0) capacity = 1;
            else {
                capacity *= 2;
            }
            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size++] = element;
    }

    public void removeAt(int removeIndex) {
        if (removeIndex >= size || removeIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        T[] newArr = (T[]) new Object[size - 1];
        for (int oldArrayIndex = 0, newArrayIndex = 0; oldArrayIndex < size; oldArrayIndex++, newArrayIndex++) {
            if (oldArrayIndex == removeIndex) {
                newArrayIndex--;
            } else {
                newArr[newArrayIndex] = arr[oldArrayIndex];
            }
        }
        arr = newArr;
        capacity = --size;
    }

    public void remove(Object obj) {
        int removeIndex = indexOf(obj);
        removeAt(removeIndex);

    }

    public int indexOf(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj == null)
                if (arr[i] == null) return i;
                else {
                    if (obj.equals(arr[i])) {
                        return i;
                    }
                }
        }
        return -1;
    }

    public boolean contain(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public Object next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        else {
            StringBuilder stringBuilder = new StringBuilder(size);
            stringBuilder.append("[");
            for (int i = 0; i < size - 1; i++) {
                stringBuilder.append(arr[i]).append(",");
            }
            stringBuilder.append(arr[size - 1]).append("]");
            return stringBuilder.toString();
        }
    }

    public T removeAtWithoutMoving(int removeIndex) {
        if (removeIndex < 0 || removeIndex >= size) throw new IndexOutOfBoundsException();
        T item =arr[removeIndex];
        arr[removeIndex] = null;
        capacity = --size;
        return item;
    }
}
