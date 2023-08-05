package org.ctdl.self.stack;

/**
 * @author BAO
 * 7/1/2023
 */
public class StackTest {
    public static void main(String[] args) {

        int numberOfOperation = 10000000;

        //        ArraybasedStack
        StackADT<Integer> arrayBasedStack = new ArrayBasedStack<>(100);
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperation; i++) {
            arrayBasedStack.push(i);
        }
        for (int i = 0; i < numberOfOperation; i++) {
            arrayBasedStack.pop();
        }
        long endTime = System.nanoTime();
        System.out.println("Array based with init size = 100 stack took: " + (endTime - startTime));


//        ArraybasedStack
        StackADT<Integer> arrayBasedStack1 = new ArrayBasedStack<>(numberOfOperation);
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperation; i++) {
            arrayBasedStack1.push(i);
        }
        for (int i = 0; i < numberOfOperation; i++) {
            arrayBasedStack1.pop();
        }
        endTime = System.nanoTime();
        System.out.println("Array based with init size = numberOfOperation stack took: " + (endTime - startTime));

        StackADT<Integer> linkedBasedStack = new LinkedListBasedStack<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfOperation; i++) {
            linkedBasedStack.push(i);
        }
        for (int i = 0; i < numberOfOperation; i++) {
            linkedBasedStack.pop();
        }

        endTime = System.nanoTime();

        System.out.println("Linked List stack took: " + (endTime - startTime));
    }
}
