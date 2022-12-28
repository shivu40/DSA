class Solution {
    //Will use one Stack and one hashmap: hashmap will store num2 element
    //as key and its nge as the value;
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n2 = nums2.length;
        map.put(nums2[n2 - 1], -1);
        st.push(nums2[n2 - 1]);
        for(int i = n2 - 2; i >= 0; i--){
            //popping out all the small elements from the stack
            //until we dont find the greater element than the current element
            //or the stack is empty

            while(st.size() > 0 && st.peek() < nums2[i]) st.pop();

            if(st.isEmpty()){
                map.put(nums2[i], -1);
            }else{
                map.put(nums2[i], st.peek());
            }

            st.push(nums2[i]);    //Pushing the current element
        }

        int n1 = nums1.length;

        int[] result = new int[n1];

        for(int i = 0; i < n1; i++){
            result[i] = map.get(nums1[i]);
        }

        return result;

    }
}