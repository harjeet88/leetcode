// https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int maxArea =0;
        //int start=0;
        //int end=0;
        
        int len=height.length;
        for(int i=0, j=len-1; i<j;){
            int currArea= (j-i)* Math.min(height[i],height[j]);
            if(currArea>maxArea){
                maxArea = currArea;
                //start=i;
                //end=j;
            }else{
                if(height[i]<=height[j]){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return maxArea;
    }
}
