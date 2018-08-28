class Solution {
    
    public int maxArea(int[] h) {
        int lo = 0, hi = h.length - 1, max = 0;
        while (lo < hi) {
            int vol = (hi - lo ) * Math.min(h[lo] , h[hi]);
            if (h[lo] <= h[hi]) 
                lo++;
            else 
                hi--;
            max = Math.max(max, vol);
        }
        return max;
    }
}