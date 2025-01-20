package StacK_and_Queue;

import java.util.Stack;

class Smaller1 {

    public void Element(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] result = new int[n]; // Array to store results

        for (int i = 0; i < n; i++) { // Iterate from left to right
            int curr = arr[i];

            // Pop elements from the stack until we find a smaller element
            while (!stack.isEmpty() && stack.peek() >= curr) {
                stack.pop();
            }

            // If the stack is empty, there's no smaller element; otherwise, use the top of the stack
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push the current element onto the stack
            stack.push(curr);
        }

        // Print the results
        System.out.print("Previous smaller elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

public class PrevSmallerElement {
    public static void main(String[] args) {
        Smaller1 smaller = new Smaller1();
        int[] arr = {2, 1, 4, 3};
        smaller.Element(arr);
    }
}
