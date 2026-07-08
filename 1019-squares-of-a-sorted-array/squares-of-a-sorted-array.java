class Solution {
    public int[] sortedSquares(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int in=arr.length-1;
        int result[]=new int[arr.length];
        while(i<=j)
        {
            int leftsquare=arr[i]*arr[i];
            int rightsquare=arr[j]*arr[j];
            if(leftsquare>rightsquare)
            {
                result[in]=leftsquare;
                i++;
            }
            else if(leftsquare<rightsquare)
            {
                result[in]=rightsquare;
                j--;
            }
            else
            {
                result[in]=rightsquare;
                j--;
            }
            in--;
        }
        return result;
        
    }
}