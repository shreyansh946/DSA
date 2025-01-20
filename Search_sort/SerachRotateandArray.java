package Search_sort;

class BinarySearch4{

  public int pivot(int[] arr)
  {
      int s =0;
      int e = arr.length - 1;

      int mid = s + (e-s)/2;

      while(s<=e)
      {
          if(s==e)
          {
              return s;
          }
          if(mid <= e && arr[mid]> arr[mid+1])
          {
              return mid;
          }
          if(mid>=s && arr[mid-1] > arr[mid])
          {
              return mid-1;
          }
          if(arr[s]>arr[mid])
          {
              e = mid-1;
          }
          else
          {
              s = mid+1;
          }
      }
      return s;
  }
}

public class SerachRotateandArray {

    public static  void main(String args[])
    {
        BinarySearch4 bs = new BinarySearch4();

        int[] arr2 ={8,10,2,4,6}; // Test case 2
        int nummber = bs.pivot(arr2);

        System.out.print(nummber);
    }
}
