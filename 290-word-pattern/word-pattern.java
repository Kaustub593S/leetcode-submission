class Solution {
    public boolean wordPattern(String pattern, String s) {

        String str[]=s.split(" ");
        
        if(pattern.length()!=str.length)
        return false;

        HashMap<Character,String> map=new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {

            char ch=pattern.charAt(i);
            String word=str[i];

            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(word))
                return false;
            }
            else
            {
                if(map2.containsKey(word))
                {
                    return false;
                }
                map.put(ch,word);
                map2.put(word,ch);
            }

        }
        return true;
    }
}