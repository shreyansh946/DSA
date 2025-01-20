package Interview;

public class Pivotsum {

    public  static  void main(String[] args)
    {
        int[] array = {1,7,3,6,5,6};
        // find the middle value here left sum equal too right sum of it.

        int totalSum=0;
        for(int i=0;i<array.length;i++)
        {
            totalSum += array[i];
        }

        int lsum =0,rsum= totalSum;
        for(int i=0;i<array.length;i++)
        {
            rsum = rsum - array[i];

            if(lsum == rsum)
            {
                System.out.println(i);
            }
            lsum += array[i];
        }
    }
}
