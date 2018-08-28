class Solution {
    
    public int myAtoi(String str) {
        if (str == null || str.trim().length() == 0) return 0;
        str = str.trim();
        int sign = 1;
        long res = 0;
        char[] c= str.toCharArray();
        int i = 0;
        if (! (Character.isDigit(c[0]) || c[0] == '+' || c[0] == '-') )  return 0;
        if (c[0] == '+' || c[0] == '-') {
            if (c[0] == '-') 
                sign = -1;
            i++;
        }

        while (i < str.length() && Character.isDigit(c[i])) {
            int num = c[i] - '0';
            res *= 10;
            res += num;
            // positive overflow
            if (sign == 1 && res > Integer.MAX_VALUE) {
                System.out.print("Positive overflow");
                return Integer.MAX_VALUE;
            } 
            // Negative overflow
            if (sign == -1 && res - 1> Integer.MAX_VALUE) {
                System.out.print("Neg overflow " +res);
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return sign * (int) res;
    }
}