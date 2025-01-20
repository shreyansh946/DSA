package Search_sort;

class BinarySearch3{

    public int pivot(int[] arr)
    {
        int sumleft =0;
        int totalsum =0;
        for(int num:arr)
        {
            totalsum += num;
        }

        for(int i=0;i<arr.length;i++)
        {
            int rightsum = totalsum - sumleft - arr[i];

            if(sumleft == rightsum)
            {
                return i;
            }

            sumleft = sumleft + arr[i];
        }
        return -1;
    }
}

public class PivotNumber {

    public static  void main(String args[])
    {
        BinarySearch3 bs = new BinarySearch3();

        int[] arr2 ={1, 7, 3, 6, 5, 6}; // Test case 2
        int nummber = bs.pivot(arr2);

        System.out.print(nummber);
    }
}
