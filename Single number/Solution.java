// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
     // x^x=0;
     //X^0 = X;
     int result = 0;
       for(int x: nums)
       {
           result = x^result;
       }

       return result;
    }
}