


class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        
        Set<Character> set = new HashSet<Character>();
        char[] a = s.toCharArray();
        int lo = 0, hi = 0, max = 1;

        while (hi != s.length()) {
            if (set.contains(a[hi])) {
                char duplicate = a[hi];
                while (a[lo] != duplicate) {
                    set.remove(a[lo++]);
                }
                lo = lo + 1;
            }
            max = Math.max(max, hi - lo + 1);
            set.add(a[hi++]);

        }
        return max;
    }
        
}