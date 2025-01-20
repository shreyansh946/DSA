package Search_sort;

class B{
     public int SQ(int arr)
     {
        int target = arr;
        int s =0;
        int e=arr;
        int ans =1;
        while(s<=e)
        {
            int mid = s +(e-s)/2;
            if(mid*mid == target)
            {
                return mid;
            }
            if(mid*mid > target)
            {
                e = mid-1;
            }
            else
            {
                ans = mid;
                s=mid+1;
            }

        }
        return ans;
     }

}
public class Squreroot {
    public static  void main(String args[]) {
        B bs = new B();

        int arr2 = 10;// Test case 2
        int nummber = bs.SQ(arr2);

        System.out.print(nummber);
    }
}
