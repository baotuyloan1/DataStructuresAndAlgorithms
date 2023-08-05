package org.ctdl.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BAO
 * 7/18/2023
 */
public class SortingAlgorithm {


    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println("");
    }


    /**
     * sort mảng 2 chiều giùm bubleSort
     * <p>
     * [2,5] , [5,6], [2,3] , [5,10], [6,2], [8,2] , [3,6]
     * <p>
     * [2,3] ,[2,5], [3,6] ...
     */
    public static void bubleSort2Dementional(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j][0] > a[j + 1][0]) {
                    isSorted = false;
                    int[] temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                if (a[j][0] == a[j + 1][0]) {
                    if (a[j][1] > a[j+1][1]) {
                        isSorted = false;
                        int[] temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            if (isSorted) break;
        }
    }

    /**
     * O(n^2)
     *
     * @param a
     */
    public static void bubleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                /**
                 * ta sẽ xét 2 phần từ j và j+1
                 * phải thỏa mãn điều kiện j+1 < n -i  => j < n - i - 1
                 */
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            printArray(i, a);
            if (isSorted) break;
        }
    }

    public static void bubleSortObject(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            boolean isSorted = true;
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getAge() < students.get(j + 1).getAge()) {
                    isSorted = false;
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
            if (isSorted) break;
        }
    }

    static void printf2Demention(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if(j<a[i].length - 1){
                    System.out.print(",");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 3, 4, 5, 8, 13, 9, 1};

        int a[][] = {{2, 5}, {5, 6}, {2, 3}, {5, 1}, {6, 2}, {8, 2}, {3, 6}};
        bubleSort2Dementional(a);
        printf2Demention(a);


        bubleSort(array);

        System.out.println("=========");

        Student student1 = new Student("Bao", 2);
        Student student2 = new Student("Le", 1);
        Student student3 = new Student("Hoang", 9);
        Student student4 = new Student("Long", 5);
        List<Student> studentList = new ArrayList(4);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);
        bubleSortObject(studentList);
        System.out.println(studentList);

    }
}
