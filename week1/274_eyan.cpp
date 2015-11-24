class Solution {
public:
    int hIndex(vector<int>& citations) {
        int n = citations.size();
        vector<int> counter(n + 1, 0);
        
        for (int i : citations){
            if(i < n){
                ++ counter[i];
            }
        }
        
        int increaseCount = 0;
        int hindex = 0;
        
        for(int i = n ;i >= 1 ; -- i){
            counter[i] += increaseCount;
            increaseCount = counter[i];
            hindex = max(hindex, min(i, counter[i]));
        }
   
        return hindex;
    }
};