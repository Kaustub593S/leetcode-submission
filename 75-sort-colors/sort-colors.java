class Solution {
    public void sortColors(int[] nums) {
        int slow=0;
        int fast=nums.length-1;
        int i=0;

        while(i<=fast)
        {
            if(nums[i]==0)
            {
                int temp=nums[i];
                nums[i]=nums[slow];
                nums[slow]=temp;
                slow++;
                i++;
            }
            else if(nums[i]==2)
            {
                int temp=nums[i];
                nums[i]=nums[fast];
                nums[fast]=temp;
                fast--;
            }
            else
            i++;
        }
    }
}