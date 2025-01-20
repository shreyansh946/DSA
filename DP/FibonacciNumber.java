package DP;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {

    public static void main(String[] args) {
        int n = 10;
        List<Integer> dp = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            dp.add(0);
        }

        dp.set(0, 0);
        dp.set(1, 1);

        for (int i = 2; i <= n; i++) {
            dp.set(i, dp.get(i - 1) + dp.get(i - 2));
        }
        System.out.println(dp);
    }

}
        // Initialize list with -1
//        for (int i = 0; i <= n; i++) {
//            dp.add(-1);
//        }
//
//        fib(n, dp);
//
//        // Print the final dp list
//        System.out.println("Final dp list: " + dp);
//    }

//    public static int fib(int n, List<Integer> dp) {
//        if (n <= 1) {
//            dp.set(n, n);
//            return n;
//        }
//
//        if (dp.get(n) != -1) {
//            return dp.get(n);
//        }
//
//        dp.set(n, fib(n - 1, dp) + fib(n - 2, dp));
//        System.out.println("dp[" + n + "] = " + dp.get(n));
//        return dp.get(n);
//    }

