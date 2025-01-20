package Interview;

public class MinimumSizeSubarraySum {

    public static void main(String[] args)
    {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int Start = 0, windowSize = Integer.MAX_VALUE, sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while(sum >= target) {
                windowSize = Math.min(windowSize, i - Start + 1);
                sum -= nums[Start++];
            }
        }

        if(windowSize == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(windowSize);
        }
    }
}
