package StacK_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FreqStream {

    public static String firstFreq(String str) {
        int[] freq = new int[26]; // Use a simple array for frequency count
        Queue<Character> queue = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            freq[ch - 'a']++; // Increment frequency count

            queue.add(ch); // Add character to queue

            // Remove characters from the front of the queue until a non-repeating character is found
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            // Append the first non-repeating character or '#' if queue is empty
            if (!queue.isEmpty()) {
                ans.append(queue.peek());
            } else {
                ans.append('#');
            }
        }

        return ans.toString(); // Return the final answer after the loop
    }

    public static void main(String[] args) {
        String str = "aabc";
        String chr = firstFreq(str);
        System.out.println(chr);
    }
}
