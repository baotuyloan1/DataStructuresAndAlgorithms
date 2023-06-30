package org.ctdl;

// quan tam đến số lượng phần tử
public class ArrayInJava {
    public static void main(String[] args) {
        //        stack < heap rất nhiều
        /**
         * static array được tạo trong vùng nhớ Stack
         * cần chỉ định số lượng phần tử khi khai báo
         */
        int[] arr = {1, 2, 3};
        System.out.print("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        /**
         * dynamic array
         *
         * được tạo trong vùng nhớ Heap
         * Không cần chỉ định số lượng phần tử khi khai báo
         */
        int[] pArr = new int[3];
        System.out.print("pArr: ");
        for (int i = 0; i < pArr.length; i++) {
            System.out.print(pArr[i] + " ");
        }

        System.out.println();
    }
}
