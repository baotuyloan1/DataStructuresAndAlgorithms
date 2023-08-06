package org.ctdl.chapter1.input_and_output.fundamentals;

/**
 * @author ADMIN 8/6/2023
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * an integer key and a sorted array of int values.
 *
 * <p>return index of the key if it is present in the array, -1 otherwise
 *
 * <p>It accomplishes (hoàn thành) this task by maintaining variables low and hi such that the key
 * is in a [lo..hi] if it is in the array Then into entering into a loop that tests the middle entry
 * in the interval (at index mid). If the key is equal to a[mid], return value is mid; otherwise the
 * method cút the interval size about in half, looking at the left haft if the key is less than
 * a[mid] and that the right half if the key is greater than a[mid]
 *
 * <p>The precess terminates when the key is found or the interval is empty. Binary search is
 * effective because it needs to examine just a few array entries (relative to the size of the
 * array) to find the key (or determine that it is not there)
 */
public class BinarySearch {

  /**
   *
   * @param key
   * @param a
   * @return
   */
  public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) {
        hi = mid - 1;
      } else if (key > a[mid]) {
        lo = mid + 1;
      } else return mid;
    }
    return -1;
  }

  private static int[] readInts(String array) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(array));
    ArrayList<Integer> list = new ArrayList<>();
    while (scanner.hasNextInt()) {
      list.add(scanner.nextInt());
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }

  private  static void println(int key) {
    File file = new File("tinyT.txt");
    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
    try (FileWriter fw = new FileWriter("tinyT.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw); ) {
      pw.println(key);
      pw.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    try {
      int[] whitelist = readInts("tinyW.txt");
      Arrays.sort(whitelist);
      Scanner scanner = new Scanner(System.in);
      while (scanner != null) {
        int key = scanner.nextInt();
        if (rank(key, whitelist) < 0) {
          println(key);
        }
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
