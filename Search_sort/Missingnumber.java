package Search_sort;

class BinarySearch1
{
    public int missing(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            // If arr[m] matches its index, missing number is in the right half
            if (arr[m] == m+1) {
                s = m + 1;
            } else {
                e = m - 1; // Otherwise, it's in the left half
            }
        }
        return s+1; // Missing number is at the index where the discrepancy starts
    }
}

public class Missingnumber {

    public static  void main(String args[])
    {
        BinarySearch1  bs = new BinarySearch1();

        int[] arr2 = {1, 2, 3, 4, 6, 7, 8}; // Test case 2
        int nummber = bs.missing(arr2);

        System.out.print(nummber);
    }

}
