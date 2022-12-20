class Solution {
    // public int maxSubArray(int[] nums) {
    //     int max = nums[0];
    //     int sum = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         sum += nums[i];
    //         if(sum > max) max = sum;
    //         if(sum < 0) sum = 0;
    //     }
        
    //     return max;
    // }

    //Alternative Approach:
    // if previous sum is negative then start new array
    //else if get attached to the previous array.(Its that simple)
     public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            if(sum >= 0){
                sum += nums[i];
            }else{
                sum = nums[i];
            }

            if(sum > maxSum) maxSum = sum;
        }

        return maxSum;
    }
}