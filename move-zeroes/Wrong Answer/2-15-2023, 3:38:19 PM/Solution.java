// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1)
        {

        }else{
           int lastPointer = nums.length-1;
          
           for(int i =0;i<nums.length && i<lastPointer;i++)
           {    
               if(nums[i] ==0 )
               { 
                   int val = nums[i];
                int j =i+1;
                while(j<=lastPointer)
                {
                    nums[j-1]=nums[j];
                    j++;
                }
                nums[lastPointer] = val;
                lastPointer--;
                

               }
           }
           }
    }
    
}