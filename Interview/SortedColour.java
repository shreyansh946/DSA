package Interview;

public class SortedColour {

    public static void main(String[] args)
    {
        int[] nums = {2,0,1,2,0,0,1};

        int l=0,m=0,h=nums.length-1;

        while(m<=h)
        {
            if(nums[m] == 0)
            {
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m]= temp;
                l++;
                m++;
            }
            else if(nums[m] == 1)
            {
                m++;
            }
            else
            {
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
    }

}
