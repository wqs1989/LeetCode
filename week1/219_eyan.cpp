struct hashitem{
    int v;
    int i;
    hashitem *next;
    hashitem(int x,int y):v(x),i(y),next(NULL){}
    hashitem(){}

};

class Solution {
    void clearMem(hashitem **p,int size)
    {
        hashitem * t,*l;
        for(int i = 0;i<size;++i)
        {
            t = *(p+i);
            while(t)
            {
                l = t->next;
                delete t;
                t=l;
            }
        }
        delete[]p;
    }
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        int size = nums.size();
        #define hash_size 1000
        if(size <=1 )return false;
        hashitem ** p = new hashitem *[hash_size];
        memset(p,0,sizeof(hashitem*)*hash_size);
        for(int i = 0;i<size;++i)
        {
            int index = (nums[i]<0?nums[i]+hash_size:nums[i])%hash_size;
            if(*(p+index) == NULL)
            {
                hashitem * q = new hashitem(nums[i],i);
                *(p+index) = q;
            }
            else
            {
                hashitem * psearch = *(p+index);

                hashitem * psearch_pre = psearch;
                while(psearch)
                {
                    if(psearch->v == nums[i] && abs(psearch->i-i)<=k)
                    {
                        clearMem(p,hash_size);
                        return true;
                    }
                    //return true;
                    psearch_pre = psearch;
                    psearch=psearch->next;
                }
                hashitem * q = new hashitem(nums[i],i);
                psearch_pre->next = q;
            }
        }
        clearMem(p,hash_size);
        return false;
    }
};