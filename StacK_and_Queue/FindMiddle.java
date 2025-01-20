package StacK_and_Queue;

import java.util.Stack;

class Middle {

    // Recursive method to find the middle element
    public void Element(Stack<Integer> s, int n) {
        System.out.println("Current Stack: " + s);
        System.out.println("Stack Size: " + s.size());

        // Base case: if the size is the middle index
        if (s.size() == n / 2 + 1) {
            System.out.println("Middle Element Found: " + s.peek());
            return;
        }

        // Pop the top element and hold it
        int temp = s.pop();
        System.out.println("Popped: " + temp);

        // Recursive call to reach the middle
        Element(s, n);

        // Push the element back to restore the stack
        s.push(temp);
        System.out.println("Pushed Back: " + temp);
    }
}

public class FindMiddle {

    public static void main(String[] args) {
        Middle middle = new Middle();

        // Initialize stack
        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Find and print the middle element
        middle.Element(stack, stack.size());
    }
}
