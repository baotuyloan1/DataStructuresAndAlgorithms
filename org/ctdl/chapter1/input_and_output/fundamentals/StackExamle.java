package org.ctdl.chapter1.input_and_output.fundamentals;
/**
 * @author ADMIN 8/6/2023
 */
import java.util.*;

/**
 * FIFO queues ( or just a queue) is a collection that is based on the first -in - first - out
 * (FIFO) policy.x
 *
 * <p>People waiting in line at a theaterx
 */
public class StackExamle {
  public static void main(String[] args) {
    int[] integers = {2, 123, 15, 123, 15, 123, 12, 5412, 312, 5, 123};
    Arrays.stream(integers).forEach(System.out::println);
    Stack<Integer> stack = new Stack<>();

    System.out.println("==========");
    Arrays.stream(integers).forEach(stack::push);
    for (int i = 0; i < stack.size(); ) {
      System.out.println(stack.pop());
    }

    System.out.println("============");
    dijkstraTwoStack();
  }

  private static void dijkstraTwoStack() {
    // arithmetic expression evaluation
    /**
     * (1 + ( (2 + 3 ) * (4*5)))
     *
     * <p>For simplicity (đơn giản), we begin with the following explicit(rõ ràng, chính xác)
     * recursive (đệ quy)definition: an arithmetic expression is either a number, or a left
     * parenthesis (ngoặc đơn) followed by an arithmetic expression followed by an operator followed
     * by another arithmetic(phep toan) expression followed by a right parenthesis. For simplicity,
     * this definition is for fully parenthesized arithmetic expressions, which specify precisely
     * which operators apply to which operands(toán hạng)
     *
     * <p>for example : 1 + 2 * 3, where we often rely on precedence(ưu tiên) rules instead of
     * parentheses We consider can handle precedence rules, but we avoid that complication.
     *
     * <p>we support the familiar binary operators *, +, - and / as well as a square-root(căn bậc 2)
     * operator sqrt that takes just one argument.
     *
     * <p>we manipulate( vận dụng) the stacks according to 4 possible cases, as follows:
     *
     * <p>- Push operands onto the operand stack - Push operators onto the operator stack - Ignore
     * left parentheses - On encountering(bắt gặp) a right parenthesis, pop an operator(toán hạng),
     * pop the requisite number of operands(toán tử) and push onto the operand stack the result of
     * applying that operator to those operands.
     *
     * <p>After the final right parenthesis has been processed, there is one value on the stack,
     * which is the value of the expression.
     */

    /** Dijkstra's Two-Stack algorithm for expression evaluation */
    Stack<String> operatorsStack = new Stack<>();
    Stack<Double> operandsStack = new Stack<>();
    String expression1 = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
    String expression = "( ( 1 + sqrt ( 5.0 ) ) / 2.0 )";
    String[] arrayString = expression.split(" ");
    for (int i = 0; i < arrayString.length; i++) {
      String s = arrayString[i];
      if (!s.equals(" ")) {
        if (s.equals("(")) {
        } else if (s.equals("+")) operatorsStack.push("+");
        else if (s.equals("-")) operatorsStack.push("-");
        else if (s.equals("*")) operatorsStack.push("*");
        else if (s.equals("/")) operatorsStack.push("/");
        else if (s.equals("sqrt")) operatorsStack.push("sqrt");
        else if (s.equals(")")) {
          double number = operandsStack.pop();
          String operator = operatorsStack.pop();
          if (operator.equals("+")) operandsStack.push(operandsStack.pop() + number);
          else if (operator.equals("-")) operandsStack.push(operandsStack.pop() - number);
          else if (operator.equals("*")) operandsStack.push(operandsStack.pop() * number);
          else if (operator.equals("/")) operandsStack.push(operandsStack.pop() / number);
          else if (operator.equals("sqrt")) operandsStack.push(Math.sqrt(number));
        } else {
          // add number
          operandsStack.push(Double.parseDouble(s));
        }
      }
    }

    System.out.println(operandsStack.get(0));
  }
}
