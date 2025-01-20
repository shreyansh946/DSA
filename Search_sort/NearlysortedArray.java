package Search_sort;

class Nearly
{
    public int value(int[] arr,int target)
    {
        int s =0;
        int e = arr.length-1;

        while(s<=e)
        {
            int m = s +(e-s)/2;
            if(arr[m] == target)
                    return m;
            if(arr[m-1] == target)
            {
                    return m-1;
            }
            if(arr[m+1] == target)
            {
                return m+1;
            }

            if(target > arr[m])
            {
                s=m+2;
            }
            else
            {
                e = m-2;
            }
        }

        return -1;
    }

}


public class NearlysortedArray {

    public static  void main(String args[])
    {
        Nearly  near = new Nearly();
        int arr[] = {10,3,40,20,50,80,70};
        int index = near.value(arr,70);

        System.out.print(index);
    }

}
