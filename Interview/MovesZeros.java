package Interview;


import java.util.Arrays;

public class MovesZeros {

    public void Zeros(int[] nums)
    {
        if (nums == null || nums.length == 0) return;

            int slow=0,fast =0;
            while(fast<nums.length)
            {
                if(nums[fast] !=0)
                {
                    nums[slow] = nums[fast];
                    slow++;
                }
                fast++;
            }

            while(slow< nums.length)
            {
                nums[slow++] = 0;
            }

        System.out.println(Arrays.toString(nums));
    }
}


class Main
{
    public static void main(String[] args){

    int arr[] = new int[]{0, 1, 0, 3, 12};

        MovesZeros movesZeros = new MovesZeros();
        movesZeros.Zeros(arr);
    }
}
