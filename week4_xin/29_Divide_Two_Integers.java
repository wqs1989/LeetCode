public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0)
            return Integer.MAX_VALUE;
        boolean negtive = false;
        int res = 0;
        if((dividend < 0 && divisor > 0) ||
           (dividend > 0 && divisor < 0)){
            negtive = true;
        }
        if(divisor == Integer.MIN_VALUE){
            if(dividend == Integer.MIN_VALUE)
                return 1; 
            else
                return res;
        }
        else if(dividend == Integer.MIN_VALUE){
            if(divisor == -1)
                return Integer.MAX_VALUE;
            else if(divisor == 1)
                return Integer.MIN_VALUE;
            dividend+= Math.abs(divisor);
            res++;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        //System.out.println("dividend: "+dividend+" divisor: "+ divisor);

        if(dividend == 0)
            return res;
        //if(divisor ==1)
         //   return negtive? -dividend:dividend;
        int digit = 0;
        while((dividend>>1) >= divisor){
            digit++;
            divisor <<= 1;
        }
        while(digit >= 0){
            while(dividend >= divisor){
                res += 1<<digit;
                dividend -= divisor;
            }
            digit--;
            divisor>>=1;
        }
        
        return negtive? -res: res;
        
        
    }
}