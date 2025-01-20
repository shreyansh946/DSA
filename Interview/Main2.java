package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Sum {

    public int[] value(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int value = target - array[i];
            if (map.containsKey(value)) {
                return new int[] { map.get(value), i };
            }
            map.put(array[i], i);
        }
        return new int[] {}; // Return empty array if no pair found
    }
}

public class Main2 {

    public static void main(String[] args) {
        int target = 80;
        int[] array = {72, 8, 15, 63, 17, 10, 70, 1, 2, 3, 8};

        Sum sumFinder = new Sum();
        int[] result = sumFinder.value(array, target);

        System.out.println(Arrays.toString(result));
    }
}
