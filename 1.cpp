//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std; 

// } Driver Code Ends

class Solution{
    public:
    void frequencyCount(vector<int>& arr,int N, int P)
    { 
        for (int i = 0; i < N; i++){
            arr[i]--;
             int j = arr[i]%P;
             if (j < N){
                 arr[j] += P;
             }
        }
        for (int i = 0; i < N; i++) 
             arr[i] /= P;
    }
};

//{ Driver Code Starts.

int main() 
{ 
	long long t;
	
	//testcases
	cin >> t;
	
	while(t--){
	    
	    int N, P;
	    //size of array
	    cin >> N; 
	    
	    vector<int> arr(N);
	    
	    //adding elements to the vector
	    for(int i = 0; i < N ; i++){
	        cin >> arr[i]; 
	    }
        cin >> P;
        Solution ob;
        //calling frequncycount() function
		ob.frequencyCount(arr, N, P); 
		
		//printing array elements
	    for (int i = 0; i < N ; i++) 
			cout << arr[i] << " ";
	    cout << endl;
	}	
	return 0; 
}





// } Driver Code Ends
