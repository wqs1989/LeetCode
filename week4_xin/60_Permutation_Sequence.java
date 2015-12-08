public class Solution {
    public String getPermutation(int n, int k) {
        String res = "";
        int[] result = new int[n];
        int factorial = 1;
        for(int i = n; i > 1; i--)
            factorial *= i;
        if(k > factorial)
            return res;
        for(int i = 1; i <= n; i++)
            result[i-1] = i;
        for(int i = 0; i < n; i++){
            factorial /= (n-i);
            int d = k/factorial;
            int y = k%factorial;
            if( d >= 1){
                int num = d+i;
                if( y == 0){
                    k -= factorial*(d-1);
                    num = num-1;}
                else
                    k -= factorial*d;
                int temp = result[num];
                for(int j = num; j > i; j--){
                    result[j] = result[j-1];
                }
                result[i] = temp;
                
            } else if(d > 0)
                k -= factorial;
                
        }
        for(int i = 0; i < n; i++){
            res+=result[i];
        }
        return res;
    }
}