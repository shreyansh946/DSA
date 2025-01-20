package DP;

import java.util.*;

public class Solution {
    public int solve(int[] cost, int n, int[] dp)
    { if (n == 0) { return cost[0]; } if (n == 1)
    { return cost[1]; }
        if (dp[n] != -1) { return dp[n]; }
        dp[n] = cost[n] + Math.min(solve(cost, n - 1, dp), solve(cost, n - 2, dp));
        return dp[n];
    }


    public int minCostClimbingStairs(int[] cost)
    { int n = cost.length; int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(solve(cost, n - 1, dp), solve(cost, n - 2, dp));
    }

    public static void main(String[] args)
    {  Solution sol = new Solution();
        int[] cost = {10, 15, 20};
        int result = sol.minCostClimbingStairs(cost);
        System.out.println("Minimum cost to climb stairs: " + result);
    } }


//import java.util.*;
//
//public class Solution {
//
//    public int minCostClimbingStairs(int[] cost) {
//        int n = cost.length;
//
//        // Edge cases
//        if (n == 1) return cost[0];
//        if (n == 2) return Math.min(cost[0], cost[1]);
//
//        int[] dp = new int[n + 1];
//
//        dp[0] = 0; // starting at the ground
//        dp[1] = 0; // starting at the first step
//
//        for (int i = 2; i <= n; i++)
//        {
//            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
//        }
//
//        return dp[n]; // minimum cost to reach the top
//    }
//
//    public static void main(String[] args) {
//        // Example usage
//        Solution sol = new Solution();
//        int[] cost = {10, 15, 20};
//        int result = sol.minCostClimbingStairs(cost);
//        System.out.println("Minimum cost to climb stairs: " + result);
//    }
//}

