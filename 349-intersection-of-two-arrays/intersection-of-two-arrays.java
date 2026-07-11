class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        for(int i:nums1)
        {
            set.add(i);
        }
        HashSet<Integer> set1=new HashSet<>();

        for(int j=0;j<nums2.length;j++)
        {
            if(set.contains(nums2[j]))
            set1.add(nums2[j]);
        }
        int[] ans=new int[set1.size()];
        int index=0;

        for(int num:set1) 
        {
            ans[index++]=num;
        }

        return ans;

    }
}