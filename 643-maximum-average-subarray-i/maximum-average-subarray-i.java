class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum =0;
        int start=0;
        double maxAvg=Double.NEGATIVE_INFINITY;
        for(int end=0;end <nums.length;end++)
        {
            sum+=nums[end];
            if(end-start+1==k)
            {
                double avg=sum/k;
                maxAvg=Math.max(maxAvg,avg);
                sum-=nums[start];
                start++;
            }
        }
        
        return maxAvg;
        
    }
 }