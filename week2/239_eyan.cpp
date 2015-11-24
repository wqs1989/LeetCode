class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        vector<int> ret;
        queue<int> q;
        deque<int> maxnum;
        int sz = nums.size();
        if(sz == 0) return {};
        if(sz <= k) {
            int retnum = INT_MIN;
            for(int i=0; i<sz; i++) retnum = max(retnum, nums[i]);
            return {retnum};
        }

        int idx = 0;
        for(; idx<k; idx++) {
            q.push(nums[idx]);
            while(!maxnum.empty() && maxnum.back()<nums[idx]) maxnum.pop_back();
            maxnum.push_back(nums[idx]);
        }
        while(idx<=sz) {
            ret.push_back(maxnum.front());
            if(idx == sz) break;
            int num = q.front();
            if(num == maxnum.front()) maxnum.pop_front();
            q.pop();
            q.push(nums[idx]);
            while(!maxnum.empty() && maxnum.back()<nums[idx]) maxnum.pop_back();
            maxnum.push_back(nums[idx]);
            idx++;
        }
        return ret;
    }
};