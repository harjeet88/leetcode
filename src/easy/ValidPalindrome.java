class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int e=s.length() -1;
        s= s.toLowerCase();
    
        while(start<e){
            //System.out.println(s.charAt(start));
            //System.out.println(s.charAt(e));
            //System.out.println("=================");
            
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start +=1;
                continue;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(e))){
                e -=1;
                continue;
            }
            if(s.charAt(start) != s.charAt(e)){
                return false;
            }
            start += 1;
            e -= 1;
        }
        return true;
    }
}
