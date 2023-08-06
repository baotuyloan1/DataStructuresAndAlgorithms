package org.ctdl.chapter1.input_and_output.fundamentals;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author ADMIN 8/6/2023
 */
public class QueueExample {
  public static void main(String[] args) {
    int[] integers = {2, 123, 15, 123, 15, 123, 12, 5412, 312, 5, 123};

    Queue<Integer> queue = new PriorityQueue<>();
    /*
    enqueue
     */
    Arrays.stream(integers)
        .forEach(
            number -> {
              System.out.println(number);
              queue.add(number);
            });
    int N = queue.size();

    System.out.println("=========");
    for (int i = 0; i < N; i++) {
      /** dequeue */
      System.out.println(queue.poll());
    }
  }
}
