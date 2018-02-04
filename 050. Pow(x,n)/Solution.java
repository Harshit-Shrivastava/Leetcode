class Solution {
    public double myPow(double x, int n) {
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n < 0){
            //if n is Integer.MIN_VALUE, the code will have overflow error, check for it
            if(n == Integer.MIN_VALUE){
                ++n;
                n = -n;
                x = 1/x;
                return x*x*myPow(x*x, n/2);
            }
            n = -n;
            x = 1/x;
        }
        return (n % 2 == 0)? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}

class OtherSolution {
    public double myPow(double x, int n) {
        double res = 1;
        long a = Math.abs((long)n);
        while(a>0)
        {
            if((a & 1)==1) res *= x;
            a >>= 1;
            x *= x;
        }
        return (n>0)? res : 1/res;
    }
}