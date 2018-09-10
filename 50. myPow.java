class Solution {
    
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n = n/2;
        }
        if (n < 0) {
            x = 1/x;
            n = -n;
        }
        if (n % 2 == 0) {
            double temp = myPow(x, n/2);
            return temp * temp;
        } else {
            return x * myPow(x, n - 1);
        }
    }
}