class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        prefix[i]=prefix[i-1]+nums[i];

        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int num:prefix)
        {
            if(map.containsKey(num-k))
            {
                count+=map.get(num-k);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
}