class Solution {
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> value :map.entrySet())
        {
            if(value.getValue()>nums.length/2)
            return value.getKey();
        }
        return 0;
    }
}