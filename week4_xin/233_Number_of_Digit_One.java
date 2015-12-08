public class Solution {
    public int countDigitOne(int n) {
        int res = 0;
        for(long k = 1; k <= n; k*=10){
            long r = n/k;
            res+= (r+8)/10*k+ ((r%10==1)?n%k+1:0);
        }
        return res;
    }
}