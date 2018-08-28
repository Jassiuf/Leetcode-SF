
class Solution {    
    public String intToRoman(int n) {
        int[] nums   = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sym = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };
        StringBuffer b = new StringBuffer();
        while(n > 0) {
            for (int i = 0; i < nums.length; i++) {
                int v = nums[i];
                if (n/v > 0) {
                    int divisor = n/v;
                    for (int k = 0; k < divisor; k++) {
                        b.append(sym[i]);
                        n -= nums[i];
                    }                       
                    
                }
            }
        }
        return new String(b);
    }
}