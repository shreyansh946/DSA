package StacK_and_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {

    public static void main(String[] args) {
        // Create a queue and add elements
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println("Original Queue: " + queue);

        // Reverse the queue using a stack
        reverseQueueUsingStack(queue);

        System.out.println("Reversed Queue: " + queue);

        reverseQueueRecursively(queue);

        System.out.println("Reversed Queue: " + queue);

        int k = 4; // Number of elements to reverse
        System.out.println("Original Queue: " + queue);

        // Reverse the first k elements of the queue
        reverseFirstKElements(queue, k);

        System.out.println("Queue after reversing first " + k + " elements: " + queue);

        interleaveQueue(queue);

        System.out.println("Interleaved Queue: " + queue);
    }

    // Function to reverse a queue using a stack
    public static void reverseQueueUsingStack(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push all elements of the queue into the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Step 2: Pop all elements from the stack and add them back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }


    public static void reverseQueueRecursively(Queue<Integer> queue) {
        // Base case: If the queue is empty, return
        if (queue.isEmpty()) {
            return;
        }

        // Step 1: Remove the front element
        int front = queue.poll();

        // Step 2: Recursively reverse the remaining queue
        reverseQueueRecursively(queue);

        // Step 3: Add the removed element back to the queue
        queue.add(front);
    }


    public static void reverseFirstKElements(Queue<Integer> queue, int k) {

        if (queue == null || k > queue.size() || k <= 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int size = queue.size();

        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }

    }

    public static void interleaveQueue(Queue<Integer> queue) {
        int size = queue.size();

        // Handling even and odd cases
        int halfSize = size / 2;
        Queue<Integer> firstHalf = new LinkedList<>();

        // Step 1: Move the first half of the queue into the firstHalf queue
        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(queue.poll());
        }

        // Step 2: Interleave elements from firstHalf and the remaining second half
        Queue<Integer> secondHalf = new LinkedList<>();
        while (!queue.isEmpty()) {
            secondHalf.add(queue.poll());
        }

        // Step 3: Interleave elements from firstHalf and secondHalf
        while (!firstHalf.isEmpty() && !secondHalf.isEmpty()) {
            queue.add(firstHalf.poll());
            queue.add(secondHalf.poll());
        }

        // Step 4: If the queue had an odd number of elements, add the remaining elements from secondHalf
        while (!secondHalf.isEmpty()) {
            queue.add(secondHalf.poll());
        }
    }

}