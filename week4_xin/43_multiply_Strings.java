public class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        String res = "";
        int[] array = new int[n+m];
        for(int i = 0; i < n; i++){
            int a = num1.charAt(n-i-1) - '0';
            for(int j = 0; j < m; j++){
                int b = num2.charAt(m-j-1) - '0';
                array[i+j] += a*b;
            }
        }
        Stack<Character> temp = new Stack<Character>();
        int carry = 0;
        for(int i = 0; i < array.length; i++){
                char s = (char)((array[i]+carry)%10 + '0');
                temp.push(s);
                carry = (array[i]+carry)/10;
        }
        while(!temp.isEmpty())
            res+=temp.pop();
        while (res.charAt(0) == '0' && res.length() >1)
            res = res.substring(1);
        return res;
        
        
    }
}