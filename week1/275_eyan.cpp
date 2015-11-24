class Solution {
public:

    int hIndex(vector<int> citations) {
        if(citations.size() ==0||citations[citations.size() - 1]<=0) 
            return 0;
            
        int l=0,r=citations.size() - 1;
        
        while(l<r){
            int mid=(r+l)/2;
            if(citations[mid] > citations.size() - mid) 
                r=mid;
            else if(citations[mid] < citations.size()- mid) 
                l=mid+1;
            else 
                return citations.size() -mid;
        }
    return citations.size() - l;
}
};