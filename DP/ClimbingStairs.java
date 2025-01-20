package DP;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args)
    {
        int n =2;
        int[] dp =  new int[n+1];
        Arrays.fill(dp,-1);
        int reuslt = solve(n,0,dp);
        System.out.println(reuslt);
    }
    public static int solve(int n, int i, int[] dp)
    {
            if(n == i)
            {
                return 1;
            }
            if(i>n)
            {
                return 0;
            }
            if(dp[i] != -1)
            {
                return dp[i];
            }
            dp[i] = solve(n,i+1,dp) + solve(n,i+2,dp);
            return dp[i];
    }
}

//public class Solution {
//
//    public int climbStairs(int n) {
//        if (n <= 1) {
//            return 1;
//        }
//
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//
//        for (int i = 2; i <= n; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//
//        return dp[n];
//    }
//}

