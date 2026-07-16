class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(right<nums[i])
            right=nums[i];
        }

        while(left<right)
        {
            int mid=left+(right-left)/2;

            if(sumDivide(nums,mid,threshold))
            right=mid;

            else
            left=mid+1;
        }
        return right;
    }

    public boolean sumDivide(int nums[],int mid,int threshold)
    {
        int sum=0;
        for(int i:nums)
        {
            sum+=(int)Math.ceil((double)i/mid);
        }
        return sum<=threshold;
    }
}