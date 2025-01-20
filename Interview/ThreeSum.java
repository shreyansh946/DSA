package Interview;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        Arrays.sort(array); // Sort the array first
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < array.length - 2; i++) {
            // Skip duplicate values for 'i'
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = array.length - 1;

            while (j < k) {
                int sum = array[i] + array[j] + array[k];
                if (sum == target) {
                    s.add(Arrays.asList(array[i], array[j], array[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        // Add the unique triplets to output
        output.addAll(s);
        System.out.println(output);
    }
}
