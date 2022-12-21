class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[n - 1]);
        int maxSoFar = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if(maxSoFar == arr[i]) result.add(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}