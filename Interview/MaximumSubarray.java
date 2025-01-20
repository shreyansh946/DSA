package Interview;

public class MaximumSubarray {

    public static void main(String[] array)
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int ans = nums[0];
        int sum =0;

        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            ans = Math.max(sum,ans);

            if(sum <0)
            {
                sum =0;
            }
        }

        System.out.println(ans);
    }

}
