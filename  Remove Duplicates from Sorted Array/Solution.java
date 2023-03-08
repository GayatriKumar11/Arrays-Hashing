// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        int currentElemtn = nums[0];
        int pointer = 0;
        if(nums.length == 1)
        {
            return 1;
        }

        for(int i =1;i<nums.length;i++)
        {
            while(i<nums.length && currentElemtn == nums[i] )
            {
                i++;
            }
            if(i<nums.length){
            currentElemtn = nums[i];
            nums[++pointer] = nums[i];
            }
        }

        return pointer+1;

    }
}