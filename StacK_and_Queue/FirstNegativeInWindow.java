package StacK_and_Queue;

import java.util.*;

public class FirstNegativeInWindow {
    public static void findFirstNegativeInWindow(int[] arr, int k) {
        LinkedList<Object> deque = new LinkedList<>();

        // Process the first window of size k
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                deque.addLast(i);
            }
        }

        // Process the rest of the windows
        for (int i = k; i < arr.length; i++) {
            // Print the first negative integer of the previous window
            if (!deque.isEmpty()) {
                System.out.print(arr[(int) deque.peekFirst()] + " ");
            } else {
                System.out.print("0 "); // No negative integer in the previous window
            }

            // Remove elements that are out of the current window
            while (!deque.isEmpty() && ((int) deque.peekFirst()) <= i - k) {
                deque.removeFirst();
            }

            // Add the current element's index if it is negative
            if (arr[i] < 0) {
                deque.addLast(i);
            }
        }

        // Print the first negative integer for the last window
        if (!deque.isEmpty()) {
            System.out.print(arr[(int) deque.peekFirst()] + " ");
        } else {
            System.out.print("0 "); // No negative integer in the last window
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,-9,7,-   2,-8,3};
        int k = 2;
        findFirstNegativeInWindow(arr, k);
    }
}
