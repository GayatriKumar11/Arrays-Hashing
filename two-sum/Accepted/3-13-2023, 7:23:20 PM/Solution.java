// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> val = new HashMap<>();
    int result[] = new int[2];
    for(int i = 0; i<nums.length;i++)
    {
        int complement = target-nums[i];
        if(val.containsKey(complement))
        {
            result[0]=i;
            result[1]= val.get(complement);
            return result;
        }else{
            val.put(nums[i], i);
        }
    }
    return result;
}
}