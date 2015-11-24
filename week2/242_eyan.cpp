class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length()){
            return false;
        }
        
        int letter[26] = {0};
        
        for (int i = 0 ; i < s.length(); ++ i){
            letter[s[i] - 'a'] ++ ; 
            letter[t[i] - 'a'] -- ;
        }
        
        for (int i = 0; i < 26 ; ++ i){
            
            cout << i;
            
            if(letter[i] != 0){
                return false;
            }
            
        }
        
        return true;
    }
};