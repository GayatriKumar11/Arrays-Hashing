// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
    
    List<Integer> result = new ArrayList<>();
    int n = digits.length;
    int carry=0;
    int newValue =0;
    int flag = 0;
    for(int i =n-1; i>=0; i--)
    {
       int value = digits[i];
       if(flag == 0)
       {
       newValue = value+carry+1;
       flag = 1;
       }
       else{
           newValue = value+carry;
           
       }

       if(newValue == 10)
       {
           newValue = 0;
           carry = 1;
           result.add(newValue);

       }

       else{
           result.add(newValue);
           carry = 0;
       }
        
    }

    if(carry == 1 )
    {
        result.add(1);
    }
   
    int newResult[] = new int[result.size()];
    int count = 0;

    for( int i = result.size()-1; i>=0;i--)
    {
        newResult[count] = result.get(i);
        count++;
    }
   
   return newResult;

    }
}