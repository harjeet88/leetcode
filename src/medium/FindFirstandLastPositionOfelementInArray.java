// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=getStart(nums,target);
        int e=getEnd(nums,target);
        int[] out=new int[2];
        out[0]=s;
        out[1]=e;
        if(e == -1){
            out[1]=out[0];
        }
        
        return out;
    }
    
    public int getStart(int[] nums, int target){
        int start = -1;
        int mid = nums.length/2;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[mid] == target){
                start=mid;
            }
            
            if(nums[mid]<target){
                i=mid+1;
            }else if (nums[mid] >= target){
                j=mid-1;
            }
            mid = (j+i)/2;
        }
        return start;
    }
    
    public int getEnd(int[] nums, int target){
        int end = -1;
        int mid = nums.length/2;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[mid] == target){
                end = mid;
            }
            
            if(nums[mid]<=target){
                i=mid+1;
            }else if (nums[mid] > target){
                j=mid-1;
            }
            mid = (j+i)/2;
        }
        return end;
    }
}
