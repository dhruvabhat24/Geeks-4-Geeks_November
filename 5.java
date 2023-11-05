//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    class Pair {
        int key, val;
        Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public int[] topK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = nums.length-1; i >= 0; i--) map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        ArrayList<Pair> list = new ArrayList<>();
        for(int key: map.keySet()) list.add(new Pair(key, map.get(key)));
        Collections.sort(list, (a, b)->{
            if(a.val == b.val) return b.val*b.key - a.val*a.key;
            else return b.val - a.val;
        });
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) ans[i] = list.get(i).key;
        return ans;
    }
}
