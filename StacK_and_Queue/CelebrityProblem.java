package StacK_and_Queue;

import java.util.Stack;

public class CelebrityProblem {

    public static void main(String[] args) {
        int[][] M = {
                {0, 1, 0,1},
                   {0, 0, 0,0},
                {0, 1, 0,1},
                {0,1,0,1}
        };
        int n = 3;
        Stack<Integer> st = new Stack<>();
        // Step 1: Push all people onto the stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        // Step 2: Discard until one candidate is left
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (M[a][b] == 1) {
                // a knows b, so a cannot be a celebrity
                st.push(b);
            } else {
                // a doesn't know b, so b cannot be a celebrity
                st.push(a);
            }
        }
        // Step 3: Verify if the remaining candidate is a celebrity
        int mightcelebrity = st.pop();
        // First loop: Check if the celebrity candidate knows no one
        for (int i = 0; i < n; i++) {
            if (i != mightcelebrity && M[mightcelebrity][i] == 1) {
                System.out.println(-1);
                return;
            }
        }
        // Second loop: Check if everyone knows the celebrity candidate
        for (int i = 0; i < n; i++) {
            if (i != mightcelebrity && M[i][mightcelebrity] == 0) {
                System.out.println(-1);
                return;
            }
        }
        // If all checks pass, print the celebrity
        System.out.println(mightcelebrity);
    }
}
