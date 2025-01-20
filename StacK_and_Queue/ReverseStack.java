package StacK_and_Queue;

import java.util.Stack;

class Reverse {
    // Insert element at the bottom of the stack
    public void insertAtBottom(Stack<Integer> stack, int target) {
        System.out.println("InsertAtBottom called with target: " + target + ", Stack: " + stack);

        if (stack.empty()) {
            stack.push(target);
            System.out.println("Inserted at bottom: " + target + ", Stack: " + stack);
            return;
        }

        int temp = stack.pop();
        System.out.println("Popped: " + temp + ", Stack: " + stack);

        insertAtBottom(stack, target);

        stack.push(temp);
        System.out.println("Pushed back: " + temp + ", Stack: " + stack);
    }

    // Reverse the stack
    public void reverseStack(Stack<Integer> stack) {
        System.out.println("ReverseStack called, Stack: " + stack);

        if (stack.empty()) {
            System.out.println("Base case reached, Stack is empty.");
            return;
        }

        int temp = stack.pop();
        System.out.println("Popped: " + temp + ", Stack: " + stack);

        reverseStack(stack);

        insertAtBottom(stack, temp);
        System.out.println("Inserted at bottom after reverse: " + temp + ", Stack: " + stack);
    }
}

public class ReverseStack {
    public static void main(String[] args) {
        Reverse reverse = new Reverse();

        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original Stack: " + stack);

        reverse.reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
