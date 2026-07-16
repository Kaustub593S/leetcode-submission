class Solution {
    public int splitArray(int[] nums, int k) {
        int minSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            maxSum+=nums[i];
            if(minSum<nums[i])
            minSum=nums[i];

        }
        int left=minSum;
        int right=maxSum;
        while(left<right)
        {
            int mid=left+(right-left)/2;

            if(minSubSum(nums,mid,k))
            right=mid;

            else
            left=mid+1;
        }
        return right;
    }
    public boolean minSubSum(int nums[],int mid,int k)
    {
        int number=1;
        int current=0;
        for(int i:nums)
        {
            current+=i;
            if(current>mid)
            {
                number++;
                if(number>k)
                return false;

                current=i;

            }

        }
        return true;
    }
}