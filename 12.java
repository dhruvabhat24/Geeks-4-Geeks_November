//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() != str2.length()){
            return false;
        }
        int n = str1.length();
        String first = str2.substring(2) + str2.substring(0, 2);
        String second = str2.substring(n-2) + str2.substring(0, n-2);
        
    //    System.out.println(first + "  " +second);
        if(str1.equals(first))
        return true;
        if(str1.equals(second))
        return true;
        
        return false;
    }
    
          }
