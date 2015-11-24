bool isBadVersion(int version);

class Solution {
private:
    int firstBadVersionHelper(int start, int end)
    {
        if(start == end)
            return start;
        if(end == start + 1)
        {
            if(isBadVersion(start+1))
                return start;
            else
                return end;
        }
        int middle = (end-start)/2 + start;
        if(isBadVersion(middle+1) && !isBadVersion(middle))
            return middle;
        else if(!isBadVersion(middle+1))
            return firstBadVersionHelper(middle+1, end);
        else
            return firstBadVersionHelper(start, middle-1);
    }
public:
    int firstBadVersion(int n) {
        return firstBadVersionHelper(0, n-1)+1;

    }
};