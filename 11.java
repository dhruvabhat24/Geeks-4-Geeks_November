//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        int size = 256;
        
        int m = str1.length();
        int n = str2.length();
        
        if(m != n)
            return false;
             
        //using a boolean array to mark visited characters in str2.
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);
         
        //using map to store mapping of every character from str1 to
        //that of str2. Initializing all entries of map as -1.
        int[] map = new int[size];
        Arrays.fill(map, -1);
         
        for (int i = 0; i < n; i++)
        {
            //if current character of str1 is seen first time in map.
            if (map[str1.charAt(i)] == -1)
            {
                //if current character of str2 is already
                //seen, one to one mapping is not possible.
                if (marked[str2.charAt(i)] == true)
                    return false;
 
                //marking current character of str2 as visited.
                marked[str2.charAt(i)] = true;
 
                //storing mapping of current characters.
                map[str1.charAt(i)] = str2.charAt(i);
            }
 
            //if this isn't first appearance of current character in str1 then
            //checking if previous appearance mapped to same character of str2.
            else if (map[str1.charAt(i)] != str2.charAt(i))
            return false;
        }
        return true;
    }
              }
