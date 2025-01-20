package StacK_and_Queue;

import java.util.Stack;

public class LargestRectangleHistogram {

        public static int largestRectangleArea(int[] heights) {
                int n = heights.length;
                int[] prevSmaller = new int[n];
                int[] nextSmaller = new int[n];

                Stack<Integer> stack = new Stack<>();

                // Calculate Previous Smaller Elements
                for (int i = 0; i < n; i++) {
                        while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                                stack.pop();
                        }
                        prevSmaller[i] = stack.isEmpty() ? -1 : stack.peek();
                        stack.push(i);
                }

                stack.clear();

                // Calculate Next Smaller Elements
                for (int i = n - 1; i >= 0; i--) {
                        while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                                stack.pop();
                        }
                        nextSmaller[i] = stack.isEmpty() ? n : stack.peek();
                        stack.push(i);
                }

                // Calculate the Maximum Area
                int maxArea = 0;
                for (int i = 0; i < n; i++) {
                        int width = nextSmaller[i] - prevSmaller[i] - 1;
                        int area = heights[i] * width;
                        maxArea = Math.max(maxArea, area);
                }
                        return maxArea;
        }

        public static void main(String[] args) {
                int[] heights = {2, 1, 5, 6, 2, 3};
                System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights));
        }
}
