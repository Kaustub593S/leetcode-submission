class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums)
        set.add(num);

        int longest=0;
        int n=nums.length;

        for(int i: set)
        {
            if(!set.contains(i-1))
            {
                int length=1;
                int current=i;
                while(set.contains(current + 1))
                {
                    current++;
                    length++;
                }
                 longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}