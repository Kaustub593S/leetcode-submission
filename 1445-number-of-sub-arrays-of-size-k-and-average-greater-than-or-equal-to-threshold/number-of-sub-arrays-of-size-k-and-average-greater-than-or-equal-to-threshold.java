class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        
        double sum =0;
        int start=0;
        int count=0;
        for(int end=0;end <nums.length;end++)
        {
            sum+=nums[end];
            if(end-start+1==k)
            {
                double avg=sum/k;
                if(avg>=threshold)
                count++;
                
                sum-=nums[start];
                start++;
            }
        }
        
        return count;
        
    }
}