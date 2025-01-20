package StacK_and_Queue;


class Stack {
    int[] arr;
    int top;
    int size;

    // Constructor
    public Stack(int size1) {
        arr = new int[size1];
        size = size1;
        top = -1;
    }

    // Push an element onto the stack
    void push(int data) {
        if (size - top > 1) {
            top++;
            arr[top] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop an element from the stack
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow, can't delete element");
        } else {
            top--;
        }
    }

    // Peek at the top element
    int peek() {
        if (top == -1) {
            System.out.println("There is no element in the stack");
            return -1; // Return a default value to indicate the stack is empty
        } else {
            return arr[top];
        }
    }

    // Get the size of the stack
    int getSize() {
        return top + 1;
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return top == -1;
    }
}

public class StackCode {
    public static void main(String[] args) {
        // Create a stack with a capacity of 5
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // Output: 30
        System.out.println("Stack size: " + stack.getSize()); // Output: 3

        stack.pop();
        System.out.println("After pop, top element: " + stack.peek()); // Output: 20

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        stack.pop();
        stack.pop();
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}
