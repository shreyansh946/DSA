package Search_sort;

class BinarySearch {
    public int findFirst(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1; // Fix the end index to arr.length - 1
        int ans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2; // Correct calculation of middle index
            if (arr[m] == target) {
                ans = m;
                e = m - 1; // Continue searching in the left half
            } else if (target > arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }

    public int findlast(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1; // Fix the end index to arr.length - 1
        int ans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2; // Correct calculation of middle index
            if (arr[m] == target) {
                ans = m;
                s = m + 1; // Continue searching in the right half
            } else if (target < arr[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
}

public class FirstOccur {
    public static void main(String args[]) {
        BinarySearch bs = new BinarySearch();
        int arr[] = {1, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 6, 7, 9};
        int first = bs.findFirst(arr, 4);
        int last = bs.findlast(arr, 4);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
