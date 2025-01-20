package StacK_and_Queue;

import java.util.ArrayList;
import java.util.List;

class MinStack {
    private final List<Pair> stack;

    // Constructor
    public MinStack() {
        stack = new ArrayList<>();
    }

    // Push a value onto the stack
    public void push(int val) {
        if (stack.isEmpty()) {
            stack.add(new Pair(val, val));
        } else {
            int currentMin = Math.min(val, stack.getLast().min);
            stack.add(new Pair(val, currentMin));
        }
    }

    // Pop the top value from the stack
    public void pop() {
        if (!stack.isEmpty()) {
            stack.removeLast();
        }
    }

    // Get the top value from the stack
    public int top() {
        if (!stack.isEmpty()) {
            return stack.getLast().value;
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Get the minimum value in the stack
    public int getMin() {
        if (!stack.isEmpty()) {
            return stack.getLast().min;
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Pair class to hold value and current minimum
    private static class Pair {
        int value;
        int min;

        Pair(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }

    // Main method to demonstrate MinStack functionality
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum: " + minStack.getMin()); // Output: -3
        minStack.pop();
        System.out.println("Top: " + minStack.top());        // Output: 0
        System.out.println("Minimum: " + minStack.getMin()); // Output: -2
    }
}
