class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        int i = n - 1;
        while(i > 0 && nums[i - 1] >= nums[i]){
            i--;
        }
        i--;
        if(i >= 0){
            
            int j = n - 1;

            while(nums[j] <= nums[i]){
                j--;
            }

            //Swapping ith and jth position:

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        
        
        
        int s = i + 1;
        int e = n - 1;
        
        while(s < e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}