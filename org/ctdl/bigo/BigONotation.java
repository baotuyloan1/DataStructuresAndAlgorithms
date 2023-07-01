package org.ctdl.bigo;

import java.util.Scanner;

/**
 * @author BAO
 * 6/30/2023
 */

/**
 * O(1)
 * O(log(N))
 * O(Nlog(N))
 * O(n^2)
 * O(n^3)
 * O(B^N, B>1
 * O(N!)
 *
 * N là số lượng phần tử của array hoặc ma trận
 * C là thời gian thực hiện câu lẹnhe
 *
 * F(n): function ví dụ như N^3 + N^2 + N + (N*Log(n))^3 + 10 => big O của nó là N*3, thằng to nhất là big => O(N^3)
 */
public class BigONotation {
    public static void main(String[] args) {

        /**
         * 2 câu lênhj này chạy với constant time
         */
        int a = 1;
        int b = 2;


        /**
         * vòng while này cũng là 1 constant time vì số lượng nó cố định
         */
        int i = 0;
        while (i < 100) i += i;

        /**
         *
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /**
         * nó sẽ là o(n) vì chưa biết số lượng là bao nhiêu cả, và nó chạy n lần. Nó có thể tiến đến vô cùng
         */
        i = 0;
        while (i < n) {
            i += 1;
        }
        i = 0;

        /**
         * F(n) = N/5 . Vẫn là O(n) vì vô cùng chia 5 vẫn là vô cùng. Chỉ là nhanh gấp 5 lần
         */
        while (i < n) {
            i += 5;
        }

        /**
         * f(n) = n*n ->O(f(n)) =  O(n^2)
         */
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        /**
         * f(n) = (n+1) * n/2 = n^2 / 2 + n/2
         * -> O(f(n)) =  n^2
         */
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        int[] ints = new int[5];
        /**
         * Tìm 1 con số nằm ở vị trí nào trong mảng
         * f(n) = C(n) , O(f(n)) = O(n)
         */
        for (i = 0; i < ints.length; i++) {
            if (ints[i] == 4) {
                System.out.println(i);
            }

            System.out.println(-1);
        }

        /**
         * Mỗi lần thực hiện số lần thực hiện sau = số lần thực hiện trước / 2 thì nó là log2(n) === log(n)
         *
         * ví dụ như : 8 4 2 1 . log(8) = 3 , 2^3 = 8
         *
         * cứ mỗi lần vào vòng while , thì số lượng phần tử giảm đi 1 nữa => O(f(n)) = log(n)
         */
        timPhanTuTrongMangDaSapXep(ints);


        /**
         * f(n) = n* (2*n) + (3*n) = n*5n = 5*n^2 , O(f(n)) = O(n^2)
         */
        for (i = 0 ; i < n; i++){
            for (int j =0; j < 2*n;j++){

            }

            for (int j =0; j < 3*n;j++){

            }
        }


        /**
         * f(n) = n*(40 + (n^2)/2) = n^3/2 + 40n => O(f(n)) = O(n^3)
         *
         */
        for (i = 0 ; i < n; i++){
            for (int j =0; j < 40;j++){

            }

            for (int j =0; j < n*n;j = j+2){

            }
        }



    }

    private static int timPhanTuTrongMangDaSapXep(int[] ints) {
        int low = 0, hight = ints[ints.length - 1 ];
        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (ints[mid] == 4) {
                return mid;
            } else {
                if (ints[mid] < 4) {
                    low = mid + 1;
                } else {
                    hight = mid - 1;
                }
            }
        }
        return -1;
    }
}
