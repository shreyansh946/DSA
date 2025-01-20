package Interview;

public class MissingNumber {
    public static void main(String[] args)
    {
        int[] nums = {3,0,1};


        int n = nums.length;
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans ^ i;
        }
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }

        System.out.println(ans);
    }

}
