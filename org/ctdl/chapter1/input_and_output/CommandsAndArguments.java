package org.ctdl.chapter1.input_and_output;

import java.util.Random;

/**
 * @author BAO
 * 8/5/2023
 */
public class CommandsAndArguments {
    /**
     * By convention, both Java and operating system process the arguments as strings. If we intend for an argument to be a number, we use a method susch as Integer.parseInt() to convert it from String to appropriate type;
     *
     * @param args
     */

    /**
     * javac : compile java Program javac .java file name
     * <p>
     * java: .class file name (no extension) and command-line arrguments
     *
     * @param args
     */
    public static void main(String[] args) {
        /** conversion code most frequetly are:
         * d for decimal values from Java's integer types
         * f (for floating-point values), and s (for String types), f (for floating-point values)
         */
//        int N = Integer.parseInt(args[0]);
//        double lo = Double.parseDouble(args[1]);
//        double hi = Double.parseDouble(args[2]);

        int N = Integer.parseInt("10");
        double lo = Double.parseDouble("11.2");
        double hi = Double.parseDouble("999.0");
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            double x = random.nextDouble(lo, hi);
            /**
             * The simplest type of format string begins with % ends with one letter conversion code
             *
             * Between the % and the conversion code is an integer value that specifies the field with of the converted value
             *  By default,
             * blank spaces are added on the left to make the length of the converted output equal to
             * the field width; if we want the spaces on the right, we can insert a minus sign before the
             * field width.
             *
             * If the converted output string is bigger than the field width, the field width
             * is ignored
             *
             * The most important thing to remember about using printf() is that the conversion
             * code in the format and the type of the corresponding argument must match
             *
             * each value is a String or a vlue from on of Java's primitive types.
             */
            System.out.printf("%f\n", x);
        }
    }
}
