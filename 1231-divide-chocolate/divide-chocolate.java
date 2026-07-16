class Solution {

    public int maximizeSweetness(int[] sweetness, int k) {

        int left = Integer.MAX_VALUE;
        int right = 0;

        for (int s : sweetness) {
            left = Math.min(left, s);
            right += s;
        }

        // Maximum possible minimum sweetness
        right /= (k + 1);

        int ans = left;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (canDivide(sweetness, mid, k + 1)) {
                ans = mid;
                left = mid + 1;     // Try for a larger minimum sweetness
            } else {
                right = mid - 1;    // Need a smaller minimum sweetness
            }
        }

        return ans;
    }

    private boolean canDivide(int[] sweetness, int target, int piecesNeeded) {

        int pieces = 0;
        int current = 0;

        for (int s : sweetness) {

            current += s;

            if (current >= target) {
                pieces++;
                current = 0;
            }
        }

        return pieces >= piecesNeeded;
    }
}
