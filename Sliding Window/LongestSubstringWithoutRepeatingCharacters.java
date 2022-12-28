class Solution {
    // public int lengthOfLongestSubstring(String str) {
    //     int len = 0;

	// 	HashMap<Character, Integer> map = new HashMap<>();

	// 	int i = -1; 
	// 	int j = -1;

	// 	while(true){
	// 		boolean f1 = false;
	// 		boolean f2 = false;
	// 		//Acquire:
	// 		while(i < str.length() - 1){
	// 			f1 = true;
	// 			i++;
			
	// 			char ch = str.charAt(i);
	// 			map.put(ch, map.getOrDefault(ch, 0) + 1);

	// 			if(map.get(ch) == 2){
	// 				break;
	// 			}else{
	// 				int plen = i - j;
				
	// 				if(plen > len){
	// 					len = plen;
	// 				}
	// 			}

			

	// 		}

	// 		// Release
	// 		while(j < i){
	// 			f2 = true;
	// 			j++;
	// 			char ch = str.charAt(j);
	// 			map.put(ch, map.get(ch) - 1);
				
	// 			if(map.get(ch) == 1){
	// 				break;
	// 			}
						
	// 		}

	// 		if(f1 == false && f2 == false){
				
	// 			break;
	// 		}
	// 	}


	// 	return len;
    // } 
    
    // public static boolean checkForDuplicate(String str, int start, int end){
    //     HashSet<Character> set = new HashSet<>();

    //     for(int i = start; i <= end; i++){
    //         char ch = str.charAt(i);

    //         if(set.contains(ch)) return true;

    //         set.add(ch);
    //     }

    //     return false;
    // }

    //Brute Force:
    // public int lengthOfLongestSubstring(String str) {
       
    //    int n = str.length();
    //    int maxLen = 0;
    //    for(int i = 0; i < n; i++){
    //        for(int j = i; j < n; j++){
    //            if(checkForDuplicate(str, i, j) == false){
    //                int len = j - i + 1;
    //                maxLen = Math.max(maxLen, len);
    //            }
    //        }
    //    }
		
    //    return maxLen;
    // }

     //Optimal (Using the concept of Sliding Window):
     // In the brute force we were checking for duplicacy in the strings which
     //definitely had duplicates. In the optimal solution We will remove the need
     //to check duplicacy for those strings which definitely has duplicates.


    public int lengthOfLongestSubstring(String str) {
       HashMap<Character, Integer> map = new HashMap<>();
       int n = str.length();
       int maxLen = 0;
       int left = 0;
       int right = 0;

       while(right < n){
           char rc = str.charAt(right);
           map.put(rc, map.getOrDefault(rc, 0) + 1);
           
           while(map.get(rc) > 1){
               char lc = str.charAt(left);              
               map.put(lc, map.get(lc) - 1);
               left++;
           }
           
           int curLen = right - left + 1;           
           maxLen = Math.max(maxLen, curLen);
           right++;
       }
	
       return maxLen;
    }
}