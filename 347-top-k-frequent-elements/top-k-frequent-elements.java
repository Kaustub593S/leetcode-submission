class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
    //BucketSort

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer> bucket[]=new ArrayList[nums.length+1];

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(bucket[entry.getValue()]==null)
            {
                bucket[entry.getValue()]=new ArrayList<>();
            }
            bucket[entry.getValue()].add(entry.getKey()); 
        }

        int[] ans=new int[k];
        int index=0;

        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]==null)
                continue;

            for(int num:bucket[i])
            {
                ans[index++]=num;

                if(index==k)
                    return ans;
            }
        }

    return ans;

    }
}