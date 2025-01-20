package StacK_and_Queue;

import java.util.Stack;

public class StackSortRecursion {

    public static Stack<Integer> stack = new Stack<>(); // Fixed the initialization

    public static void main(String[] args) {
        stack.push(9);
        stack.push(2);
        stack.push(7);
        stack.push(4);
        stack.push(6);

        sort(); // Call the recursive sort method

        System.out.println(stack); // Output the sorted stack
    }

    // Recursive function to sort the stack
    private static void sort() {
        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop(); // Pop the top element
        sort(); // Recursively sort the remaining stack

        insertAtCorrectPosition(temp); // Insert the popped element at its correct position
    }

    // Function to insert an element in the correct position in the sorted stack
    private static void insertAtCorrectPosition(int temp) {
        // Base case: if stack is empty or the top element is smaller than temp
        if (stack.isEmpty() || stack.peek() < temp) {
            stack.push(temp);
            return;
        }
        int top = stack.pop();
        insertAtCorrectPosition(temp); // Recursive insertion of temp
        stack.push(top); // Push the popped element back
    }
}
