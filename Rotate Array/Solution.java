class Solution {
    public void rotate(int[] nums, int k) {

        // k= k%nums.length;
        // int prev, temp;

        // for(int i=0; i<k;i++){
        //     prev = nums[nums.length -1];
        //     for(int j=0;j<nums.length;j++){
        //         temp = nums[j];
        //         nums[j] = prev;
        //         prev = temp;
        //     }
        // }

        int newArr[] = new int[nums.length];

        for(int i=0; i< nums.length;i++){
            newArr[(k+i)%nums.length] = nums[i];
        }

        for(int i=0; i< nums.length;i++){
            nums[i]=newArr[i];
        }
    }
}