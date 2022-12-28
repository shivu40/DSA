class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	
    	Stack<Integer> st = new Stack<>();
    	
    	for(int i = 0; i < n ;i++){
    	    st.push(i);
    	}
    	
    	while(st.size() > 1){
    	    int cand1 = st.pop();
    	    int cand2 = st.pop();
    	    
    	    if(M[cand1][cand2] == 1){
    	        //cand1 can not be the celebrity because he knows cand2.
    	        st.push(cand2);
    	    }else{
    	        //cand2 can not be the celebrity because he is not known by cand1.
    	        st.push(cand1);
    	    }
    	}
    	
    	int cand = st.pop();
    	
    	for(int i = 0; i < n; i++){
    	    if(i != cand){
    	        if(M[i][cand] == 0  || M[cand][i] == 1) 
    	            return -1;
    	    }
    	}
    	
    	return cand;
    	
    }
}