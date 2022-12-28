class Solution {

    //We are repeating the array one more time so that we can consider 
    // it circularly. The Approach is same as NGE 1.

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];

        for(int i = 2 * n - 1; i>= 0; i--){
            while(st.size() > 0 && st.peek() <= nums[i % n]) st.pop();

            if(st.size() == 0) 
                result[i % n] = -1;
            else
                result[i % n] = st.peek();

            st.push(nums[i % n]);

        }


        return result;

    }
}