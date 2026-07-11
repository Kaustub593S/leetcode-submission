class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
    //Minheap Solution

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            minHeap.offer(entry);

            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }
        int ans[]=new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=minHeap.poll().getKey();
        }
        return ans;
    }
}