package String;
import java.util.*;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();

        // Convert timePoints to total minutes
        for (String time : timePoints) {
            int hours = Integer.parseInt(time.substring(0, 2));
            int mins = Integer.parseInt(time.substring(3, 5));
            int totalMinutes = hours * 60 + mins;
            minutes.add(totalMinutes);
        }

        // Sort the list of minutes
        Collections.sort(minutes);

        int mini = Integer.MAX_VALUE;
        int n = minutes.size();

        // Find the minimum difference
        for (int i = 0; i < n - 1; i++) {
            int diff = minutes.get(i + 1) - minutes.get(i);
            mini = Math.min(diff, mini);
        }
        //catch here
        // Check the difference between the first and last times (circular)
        int lastDiff = (minutes.get(0) + 1440) - minutes.get(n - 1);
        mini = Math.min(mini, lastDiff);

        return mini;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> timePoints = Arrays.asList("23:59", "00:00", "12:34");
        System.out.println(solution.findMinDifference(timePoints)); // Output: 1
    }
}
