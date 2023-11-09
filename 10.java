//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        int n = S.length();
        
        if(n > 8 || n == 0) return "-1";
        
        Stack<Integer> stack = new Stack<>();
        int current = 1;
        
        String number = "";
        for(char ch : S.toCharArray()) {
            stack.push(current++);
            if(ch == 'I') {
                while(!stack.isEmpty()) {
                    number += stack.pop();
                }
            }
        }
        stack.push(current);
        while(!stack.isEmpty()) {
            number += stack.pop();
        }
        return number;
    }
    
}
