package Interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindPair {
    public static void main(String[] args) {
        int[] array = {72, 8, 15, 63, 17, 10, 70, 1, 2, 3, 8};
        int targetSum = 80;
        find(array, targetSum);
    }

    public static void find(int[] array, int target) {
        HashSet<Integer> seen = new HashSet<>();
        int pairCount = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : array) {
            int complement = target - num;
            if (seen.contains(complement)) {
                map.put(num,complement);
                pairCount++;
            }
            seen.add(num);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
                System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
