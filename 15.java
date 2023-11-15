//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();

            Solution obj = new Solution();
            String ans = obj.betterString(str1, str2);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    // Function to calculate the number of distinct subsequences
    static int countDistinctSubsequences(String str) {
        int MOD = 1000000007;
        int n = str.length();
        int[] lastOccurrence = new int[256];
        Arrays.fill(lastOccurrence, -1);

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % MOD;

            if (lastOccurrence[str.charAt(i - 1)] != -1) {
                dp[i] = (dp[i] - dp[lastOccurrence[str.charAt(i - 1)] - 1] + MOD) % MOD;
            }

            lastOccurrence[str.charAt(i - 1)] = i;
        }

        return dp[n] - 1; // Subtract 1 to exclude the empty subsequence
    }

    // Function to find the better string
    static String betterString(String str1, String str2) {
        int count1 = countDistinctSubsequences(str1);
        int count2 = countDistinctSubsequences(str2);

        if (count1 >= count2) {
            return str1;
        } else {
            return str2;
        }
    }

    public static void main(String[] args) {
        String str1 = "gfg";
        String str2 = "ggg";

        String result = betterString(str1, str2);
        System.out.println("Output: " + result);
    }
}

          
