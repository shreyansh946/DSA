package Search_sort;
class BinarySearch2
{
    public int peak(int[] arr)
    {
     int s =0;
     int e = arr.length -1;

     while(s < e)
     {
         int m = s+ (e-s)/2;
         if(arr[m] < arr[m+1])
         {
             s = m+1;
         }
         else
         {
             e = m;
         }
     }
     return s;
    }
}

public class PeakElment {
    public static  void main(String args[])
    {
        BinarySearch2  bs = new BinarySearch2();

        int[] arr2 = {0,10,11,5,2}; // Test case 2
         int nummber = bs.peak(arr2);

        System.out.print(nummber);
    }
}
