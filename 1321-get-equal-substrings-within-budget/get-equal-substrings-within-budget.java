class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int ans[]=new int[s.length()];

        for(int i=0;i<s.length();i++)
        {
            ans[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }

        int start=0;
        int length=0;
        int sum=0;
        for(int end=0;end<ans.length;end++)
        {
            sum+=ans[end];
            while(sum>maxCost)
            {
                sum-=ans[start];
                start++;
            }
            length=Math.max(length,end-start+1);
        }
        return length;
    }
}