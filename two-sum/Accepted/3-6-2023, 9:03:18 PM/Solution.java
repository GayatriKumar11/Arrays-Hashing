// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> newNums = new  HashMap<>();
    for(int i =0; i<nums.length; i++)
    {
        newNums.put(nums[i], i);
    }  

    for(int i = 0; i<nums.length;i++)
    {
        int complement = target - nums[i];
        if(newNums.containsKey(complement) && newNums.get(complement) != i)
        {
            return new int[]{i, newNums.get(complement)};
        }
    }
    return null;
}
}