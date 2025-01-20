package StacK_and_Queue;


import java.util.Arrays;
import java.util.Stack;

public class NextgreaterNodeinLL {

    public static void main(String[] args)
    {
        int[] nums = {2, 7, 4, 3, 5};
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums.length;i++)
        {
            while(!st.empty() && nums[i] > nums[st.peek()])
            {
                int stackindex = st.peek();
                st.pop();
                nums[stackindex] = nums[i];
            }
            st.push(i);
        }
        while (!st.empty())
        {
            nums[st.peek()]  =0;
            st.pop();
        }

        nums[nums.length - 1] =0;
        System.out.println(Arrays.toString(nums));


    }

}
