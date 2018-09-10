// O(n2) solution with linear space 

class Solution1 {
    public boolean canJump(int[] n) {
        int L = n.length;
        if (L == 0 || L == 1) return true;
        boolean[] jump = new boolean[L];
        jump[jump.length - 1] = true;
        for (int i = L - 2; i >= 0; i--) {
            int reach = Math.min(i + n[i], L -1);
            for (int in = reach; in >= i; in--) {
                    if (jump[in]) {
                        jump[i] = true;
                        break;
                    }
                }
            
        }
        return jump[0];
    }
}

// O (n) solution with no extra space
// why do we need to remember all the indexes that can reach the end,
// just check whether the first can reach the leftmost index which has a path. 
// start from right to left 

class Solution {
    public boolean canJump(int[] n) {
        int last = n.length - 1;
        for (int i = n.length - 2; i >= 0; i--)  {
            if (i + n[i] >= last) {
                last = i;
            }
        }
        return last == 0;
    }
}