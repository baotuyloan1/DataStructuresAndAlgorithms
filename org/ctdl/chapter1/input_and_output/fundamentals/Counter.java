package org.ctdl.chapter1.input_and_output.fundamentals;
/**
 * @author ADMIN 8/6/2023
 */
public class Counter {
  private final String name;
  private int count;

  public Counter(String name) {
    this.name = name;
  }

  public void increment() {
    count++;
  }

  public int tally() {
    return count;
  }

  @Override
  public String toString() {

    return count + " " + name;
  }
}
