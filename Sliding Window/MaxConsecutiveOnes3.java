class Solution {
    //This problem can be compared to Longest Substring without repeating characters.
    //It is to find a subarray with at most k zeroes.
    //Brute force will be to find all those subarrays with at most k zeroes and then 
    //maximizing the length.    O(n ^ 3)

    //But in brute force we are doing unnecessary operations. So to remove them we can 
    // use sliding window algorithm same as Longest Substring without repeating characters.
    
    //Coding the Optimal Solution:
    //Time Complexity : O(n + n) = O(n).
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zeroCount = 0;
        int maxLen = 0;
        
        int left = 0;
        int right = 0;

        while(right < n){
            if(nums[right] == 0) zeroCount++;

            while(zeroCount > k){
                if(nums[left] == 0) zeroCount--;
                left++;
            }

            int len = right - left + 1;
            maxLen = Math.max(maxLen, len);
            right++;
        }
            
        return maxLen;
    }
}