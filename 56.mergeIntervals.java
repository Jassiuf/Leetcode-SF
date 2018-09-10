/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */


class Solution {
    
    private class intervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            if (a.start == b.start) return 0;
            if (a.start < b.start) return -1;
            return 1;
        }
    }
    
    public List<Interval> merge(List<Interval> intervals) {
        int L = intervals.size();
        List<Interval> res = new LinkedList<Interval>();
        if (L == 0) return res;
        Collections.sort(intervals, new intervalComparator());
        
        for (int i = 0 ; i < L; ) {           
            int j = i + 1;
            Interval curr = intervals.get(i);
            if (j == L) {
                res.add(curr);
                return res;
            }
            
            while (j != L && curr.end >= intervals.get(j).start) {
               curr.end = Math.max(intervals.get(j).end,curr.end );
               j++;
            }
            res.add(curr);
            i = j;
            
        }
        
        return res;
    }
}