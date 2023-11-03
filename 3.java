//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = arr[i] * arr[i];
        }
        //find max value;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        

        for(int i=max;i>0;i--){
            if(set.contains(i)){
                for(int j=0;j<n;j++){
                    if(arr[j] == max){
                        continue;
                    }
                    if(set.contains(Math.abs(i-arr[j]))){
                        return true;
                    }
                    
                }
            }
        }
        return false;
        
    }
}
