class Solution {
    // public boolean isValid(String s) {
    //     Stack<Character> st = new Stack<>();
        
    //     for(int i = 0; i < s.length(); i++){
    //         char ch = s.charAt(i);
    //         if(ch == '(' || ch == '[' || ch == '{'){
    //             st.push(ch);
    //         }else if(ch == ')'){
    //             if(st.size() > 0 && st.peek() == '('){
    //                 st.pop();
    //             }else{
    //                 return false;
    //             }
    //         }else if(ch == '}'){
    //             if(st.size() > 0 && st.peek() == '{'){
    //                 st.pop();
    //             }else{
    //                 return false;
    //             }
    //         }else if(ch == ']'){
    //             if(st.size() > 0 && st.peek() == '['){
    //                 st.pop();
    //             }else{
    //                 return false;
    //             }
    //         }            
    //     }
        
    //     if(st.size() > 0) return false;
        
        
    //     return  true;
    // }

    //Shorter way:
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                st.push(')');
            }else if(ch == '{'){
                st.push('}');
            }else if(ch == '['){
                st.push(']');
            }else if(st.size() == 0 || st.pop() !=  ch){
                return false;
            }
        }

        if(st.size() > 0) return false;

        return true;        
    }
}