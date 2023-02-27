// https://leetcode.com/problems/intersection-of-two-arrays-ii

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        if(nums1.length>nums2.length)
        {
            for(int x: nums1)
            {
               if(!map.containsKey(x))
               {
                   map.put(x,1);
               }else{
                   map.put(x, map.get(x)+1);
               }
            }
        }else{
            for(int x: nums2)
            {
               if(!map.containsKey(x))
               {
                   map.put(x,1);
               }else{
                   map.put(x, map.get(x)+1);
               }
            }
        }


        if(nums1.length>nums2.length)
        {
            for(int x: nums2)
            {
                if(map.containsKey(x) && map.get(x)>0)
                {
                    result.add(x);
                    map.put(x, map.get(x)-1);
                }
            }
        }
        else{
             for(int x: nums1)
            {
                if(map.containsKey(x) && map.get(x)>0)
                {
                    result.add(x);
                    map.put(x, map.get(x)-1);
                }
            }
        }

        int arr[] = new int[result.size()];
        int countx = 0;
        for(Integer x: result)
        {
         arr[countx++]=x;        }

         return arr;
    }


}