class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = (n * (4 + (n - 1) * 2)) / 2;
        int sumOdd = (n * (2 + (n - 1) * 2)) / 2;
        int gcd = GCD(sumOdd, sumEven);
        return gcd;

    }

    public static int GCD(int a, int b) {
       if(b==0)
           return a;

        else
           return GCD(b,a%b);
    }
}