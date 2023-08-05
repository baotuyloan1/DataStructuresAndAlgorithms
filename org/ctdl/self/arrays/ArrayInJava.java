package org.ctdl.self.arrays;

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

        // making an array in a Java program involves where distinct(riêng biệt) steps:
        /**
         * Declare the array name and type.
         *
         * Create the array
         * Initialize the array values.
         */
        double[] a;
/**
 *
 *   The reason that we need to explicitly create arrays at run time is that the java compuler cannot know how much space to reserve for the array at compile time
 *
 *   Note carefully that an array name refers to the whole array—if we assign one
 *  * array name to another, then both refer to the same array, as illustrated in the following
 *  * code fragment.
 */

        /**
         * Once we create an array, its size is fixed.
         */
        a = new double[4];
        System.out.println(a[2]);

        double[] b = new double[5];


        int[] c = {1, 32, 4, 125123};

        /**
         * aliasing
         * . If your intent is to make
         * a copy of an array, then you need to declare, create, and initialize a new array and then
         * copy all of the entries in the original array to the new array
         */
        int[] d = c;

        // two-demensinal arrays
        /**
         * The first demension is the number of rows and the second is the number of columns
         * Default initialization of two demensinal arrays is useful because it masks
         */

        double[][] e = new double[3][4];
        System.out.println("e " + e[2][2]);


    }

    // typical(tiêu biểu) array-processing code

    /**
     * Find the maximum of the array values
     */
   private static double findMax(int[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
