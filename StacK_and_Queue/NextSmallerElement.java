package StacK_and_Queue;

import java.util.Stack;

class Smaller {

    public void Element(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] result = new int[n]; // Array to store results

        for (int i = n - 1; i >= 0; i--) {
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
        System.out.print("Next smaller elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

public class    NextSmallerElement {
    public static void main(String[] args) {
        Smaller smaller = new Smaller();
        int[] arr = {2, 1, 4, 3};
        smaller.Element(arr);
    }
}
