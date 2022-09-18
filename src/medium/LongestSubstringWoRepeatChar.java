/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/
class Solution {
    public int lengthOfLongestSubstring(String input) {
        	Map<String,Integer> seen = new HashMap<String,Integer>();
	int maxLen=0;
	int len=0;
	int start =0;
	//int end=0;
	for(int i=0; i<input.length();i++) {
		String curr=Character.toString(input.charAt(i));
        //System.out.println(seen);
		if(!(seen.containsKey(curr))) {
			seen.put(curr,i);
			len=len+1;
			//System.out.println(curr +" "+len);
			maxLen=Math.max(maxLen, len);
			System.out.println(curr +" "+maxLen);
		}else {
            int old= seen.get(curr);
            System.out.println("else old : "+old);
            seen.put(curr,i);
			//int matchIndex=seen.get(curr);
			start = old;
			len = i-old;
            if((i-len)> old){
                continue;
            }
			//System.out.println("else "+curr +" "+len);
			maxLen=Math.max(maxLen, len);
            //len=maxLen;
            System.out.println("else "+curr +" "+maxLen);
		}
	}
	
	
	return maxLen;
    }
}
