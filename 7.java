//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.sumTriangles(matrix,n);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int mat[][], int n)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int a = 0;
        int b = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<=i) a+=mat[i][j];
                if(j>=i) b+=mat[i][j];
            }
        }
        al.add(b);
        al.add(a);
        return al;
    }
}
