class Solution {
    //Intuition: Water will be trapped when left side has bigger builder and 
    //right side also has bigger building.
    //Now talking about amount of water it will be minimum of the two bigger 
    //buildings(left and right side) and the current building will also affect
    //the amount of water so formula :
    //Water at current place = Min(left, right) - current;

    //Now to find left and right max one approach could be of O(n ^ 2) (Brute Force)
    //Better Approach could be to use prefix and postfix array approach.
    //Then Time Complexity: O(n),  Space Complexity : O(n).
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int waterAmount = 0;

        for(int i = 0; i < n; i++){
            waterAmount += (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        return waterAmount;

    }
}