class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<quantities.length;i++)
        {
            if(max<quantities[i])
            max=quantities[i];
        }


        int left=1;
        int right=max;

        while(left<right)
        {
            int mid=left+(right-left)/2;

            if(storesNeeded(quantities,mid,n))
            right=mid;

            else
            left=mid+1;

        }
        return right;
    }
    public boolean storesNeeded(int nums[],int mid,int n)
    {
        int k=0;
        for(int i:nums)
        {
            k+=Math.ceil((double)i/mid);
        }

        return k<=n;
    }
}