class Solution {
    //Brute force Solution: Sort the array.
    public int longestConsecutive(int[] nums) {
        //Optimized Solution:
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxCount = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i] - 1)){
                continue;
            }else{
                int count = 1;
                while(set.contains(nums[i] + count)){
                    count++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        
        return maxCount;
    }
}