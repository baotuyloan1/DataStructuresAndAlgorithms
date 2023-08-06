package org.ctdl.chapter1.input_and_output.fundamentals;
/**
 * What is Java bytecode?
 *
 * <p>- A low-level version of your program that runs on Java virtual machine. This level of
 * abstractions makes it easier for the developers of Java to ensure that our programs run on a
 * broad of variety of devices.
 *
 * <p>It seems wrong that Java should just let ints overflow and give bad values. Shouldn't Java
 * automatically check overflow?
 *
 * <p>- THe short answer is that the lack of such checking is one reason such types are called
 * primitive data types. A little knowledge can go a long way in avoiding such problems.We use the
 * int type for small numbers (less than ten decimal digits), and the long type when values run into
 * the billions or more - > 9 chữ số dùng int, 10 chữ số dùng long
 *
 * <p>What is the value of Math.abs(-2147483648)? int giới hạn từ -2147483648 to 2147483647 long ->
 * integer overflow
 *
 * <p>-2147483648 -> giới hạn âm là -2147483648 nên khi chuyển no về dương 2147483648 nó bị overflow
 * integer
 *
 * <p>Q. How can I initialize a double variable to infinity?
 *
 * <p>Java has built-in constants available for this purpose: Double.POSITIVE_INFINITY and
 * Double.NEGATIVE_INFINITY.
 *
 * <p>Can you compare a double to an int?
 *
 * <p>Not(không) without(nếu không) doing a type conversion, but remember that Java usually does the
 * requisite type conversion automatically. For example, if x is an int with the value 3, then the
 * expression (x < 3.1) is true - Java converts x to double (because 3.1 is a double literal) before
 * performing the comparison.
 *
 * <p>What happens if I use a variable before initializing it to a value?
 *
 * <p>Java will report a compile-time error if there is any path through your code that would lead
 * to use of an uninitialized variable
 *
 * <p>Q. What are the values of 1/0 and 1.0/0.0 as Java expressions?
 *
 * <p>A. The first generates a runtime exception for division by zero (which stops your program
 * because the value is undefined); the second has the value Infinity
 *
 * <p>Q. Can you use < and > to compare String variables?
 *
 * <p>No. Those operators are defined only for primitive types.
 *
 * <p>Q. What is the result of division and remainder for negative integers?
 *
 * <p>A. The quotient (phần nguyên) a/b rounds toward 0; the remainder a % b is defined such that (
 * a/b) * b + a%b is always equal to a. For example, -14/3 and 14/-3 are both -4, but -14 % 3 is -2
 * and 14% -3 is 2
 *
 * <p>Q. Why do we say (a && b) and not (a & b)?
 *
 * <p>THe operators & , |, and ^ are bitwise logical operations for integer types that do, and, or,
 * and exclusive or (respectively) on each bit position. THe operators && and || are valid only in
 * boolean expressions are included separately because of short-circuiting an expression is
 * evaluated left-to-right and the evaluation stops when the value is known.
 *
 * <p>Why do array indices start at 0 instead of 1?
 *
 * <p>This convention originated with machine-language programming, where the address of an array
 * element would be computed by adding the index to the address of the beginning of an array.
 * Starting indices at 1 would entail either a waste of space at the beginning of the array or a wast of time to subtract the 1.
 *
 */
public class QuestionAnswerInterview {
  public static void main(String[] args) {
    System.out.println(Math.abs(-2147483648));
    System.out.println(Double.POSITIVE_INFINITY);
    System.out.println(Double.NEGATIVE_INFINITY);
  }
}
