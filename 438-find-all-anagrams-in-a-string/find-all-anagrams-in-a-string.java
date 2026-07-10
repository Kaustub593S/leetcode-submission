class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int freq1[]=new int[26];
        int freq2[]=new int[26];

        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length())
        return ans;
        for(int i=0;i<p.length();i++)
        {
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        int start=0;

        
        if(Arrays.equals(freq1,freq2))
        {
            ans.add(start);
        }

        for(int end=p.length();end<s.length();end++)
        {
            freq2[s.charAt(end)-'a']++;
            freq2[s.charAt(start)-'a']--;
            start++;

            if(Arrays.equals(freq1,freq2)==true)
            {
                ans.add(start);
            }
        }

        return ans;
    }
}