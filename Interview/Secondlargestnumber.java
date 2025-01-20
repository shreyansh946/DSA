package Interview;

public class Secondlargestnumber {

    public static int findSecondLargest(int[] array) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : array)
        {
            if(num > largest)
            {
                second = largest;
                largest = num;
            }
            else if(num > second && num < largest)
            {
                second = num;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] array = {72, 8, 15, 63, 17, 10, 70, 1, 2, 3, 8};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second Largest: " + secondLargest);
    }
}
