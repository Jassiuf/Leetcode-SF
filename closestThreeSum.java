class Solution {
    
    public int threeSumClosest(int[] a, int target) {
        if (a.length < 3) return -1;
        Arrays.sort(a);
        int res = 0, min = Integer.MAX_VALUE, temp = 0, result = 0;
        
        
        for (int i = 0; i < a.length - 2; i++) {
            int lo = i+1, hi = a.length - 1;
            
            while (lo < hi) {
                if (Math.abs(target - a[i] + a[lo] + a[hi]) < min) {
                    min = Math.abs(target - temp);
                    result = temp;
                }
                if (temp == target) return target;
                if (temp > target)  hi--;
                else lo++;
            }            
        }
        return result;
    }
}