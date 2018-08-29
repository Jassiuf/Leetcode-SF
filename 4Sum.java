class Solution {
    
    public List<List<Integer>> fourSum(int[] a, int target) {
        List<List<Integer>> res = new LinkedList<>();
        int n = a.length;
        if (n < 4) 
            return res;
        Arrays.sort(a);
        
        for (int f = 0; f < n - 3; f++) {
                     
            // too big, all the other numbers will be larger
            if(a[f] + a[f+1] + a[f+2] + a[f+3] > target) break;         
            //too small
            if(a[f] +a[n-1] + a[n-2] + a[n-3] < target) continue;                    
            // no duplicate
            if (f > 0 && a[f] == a[f-1]) continue; 
            
            for (int s = f + 1; s < n - 2; s++) {
            
                // too big
                if (a[s] + a[f] + a[s+1] + a[s+2] > target) break;                    
                 // too small
                if (a[s] + 2 * a[n-1] < target - a[f]) continue;  
                // no duplicate
                if (s > f+1  && a[s] == a[s-1]) continue;   
                
                int lo = s + 1, hi = n - 1;
                while (lo < hi) {
                    
                    int sum = a[f] + a[s] + a[lo] + a[hi] ;
                    if (sum == target) {
                        res.add(Arrays.asList(a[f], a[s], a[lo], a[hi]));
                        while(lo < hi && a[hi] == a[hi - 1]) hi--;
                        while (lo < hi && a[lo] == a[lo +1]) lo++;
                        lo++;
                        hi--;
                    } else if (sum > target) {
                         
                         hi = hi - 1;
                    } else {
                        
                        lo = lo + 1;
                    }
                    
                }
            }
        }
        
        return res;
    }
}