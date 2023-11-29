//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minStep(n));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int minStep(int n){
        int steps = 0;
        while(true){
            if(n == 1) break;
            if(n%3 == 0) n = n/3;
            else n = n-1;
            
            steps ++;
        }
        
        return steps;
    }
}
