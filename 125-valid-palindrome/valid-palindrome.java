class Solution {
    public boolean isPalindrome(String str) {
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        int low=0;
        int high=str.length()-1;
        while(low<=high)
        {
            if(Character.toLowerCase(str.charAt(low))!=Character.toLowerCase(str.charAt(high))
            )
            return false;
            
            low++;
            high--;
        }
        return true;
    }
}