// https://leetcode.com/problems/move-zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        
            int intialPointer =0;
            for(int n:nums)
            {
                if(n!=0)
                {
                    nums[intialPointer]=n;
                    intialPointer++;
                }
            }

            while(intialPointer<nums.length)
            {
                nums[intialPointer]=0;
                intialPointer++;
            }
    }
    
}