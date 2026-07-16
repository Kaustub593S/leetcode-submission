class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int maxWeight=weights[0];
        int minWeight=weights[0];
        for(int i=1;i<weights.length;i++)
        {
            maxWeight+=weights[i];
            if(minWeight<weights[i])
            minWeight=weights[i];
        }

        int left=minWeight;
        int right=maxWeight;

        while(left<right)
        {
            int mid=left+(right-left)/2;

            if(canCarry(mid,weights,days))
            right=mid;

            else
            left=mid+1;
        }
        return right;
    }
    public boolean canCarry(int m,int weights[],int days)
    {
        int current=0;
        int daysUsed=1;
        for(int i:weights)
        {
            current+=i;

            if(current>m){
                daysUsed++;
                current=i;
            }
        }
        return daysUsed<=days;
    }
}