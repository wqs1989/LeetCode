public class Solution {
    public String addBinary(String a, String b) {
        int n = Math.max(a.length(), b.length())+1 ;
        int[] ans = new int[n];
        int k = a.length();
        int j = b.length();
        for(int i = 0; i < n; i++){
            int ai = 0, bj = 0;
            if(i < k)
                ai = a.charAt(k-1-i) -'0';
            if(i < j)
                bj = b.charAt(j-1-i) - '0';
            ans[i] = ai+bj;
        }
        int carry = 0;
        String res = "";
        Stack<Character> s = new Stack<>();
        for(int i = 0; i <n; i++){
            char temp =(char) ((ans[i]+carry)%2 +'0');
            s.push(temp);
            carry = (ans[i]+carry)/2;
            //System.out.println("temp = "+temp+" carry = "+carry +" ans = "+ans[i]);
        }
        while(!s.isEmpty())
            res+=s.pop();
        while(res.charAt(0) == '0' && res.length()>1)
            res = res.substring(1);
        return res;
        
    }