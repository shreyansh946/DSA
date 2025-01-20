package StacK_and_Queue;

import java.util.Stack;

class Bottom {

    // Recursive method to insert the target element at the bottom
    public void solve(Stack<Integer> stack, int target) {
        if (stack.empty()) {
            stack.push(target); // Insert the target when the stack is empty
            return;
        }

        int topElement = stack.pop();
        solve(stack, target);
        stack.push(topElement);
    }

    // Wrapper method to process the stack
    public void insertAtBottom(Stack<Integer> stack, int target) {
        solve(stack, target); // Call the recursive function to insert the target
    }
}

public class InsertAtBottom {

    public static void main(String[] args) {
        Bottom bottom = new Bottom();

        // Initialize stack
        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Print the stack before insertion
        System.out.println("Stack before inserting at the bottom: " + stack);

        // Insert an element at the bottom
        bottom.insertAtBottom(stack, 5);

        // Print the stack after insertion
        System.out.println("Stack after inserting at the bottom: " + stack);
    }
}
