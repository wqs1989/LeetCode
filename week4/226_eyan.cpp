int firstBadVersion(int n) 
{
    int s = 1, e = n, m = 0;
    while (s <= e)
    {
        m = s + (e - s)/2;
        if ( (isBadVersion(m) && s == m) || (isBadVersion(m) && !isBadVersion(m-1)))
            break;
        else if (isBadVersion(m))
            e = m-1;
        else
            s = m + 1;
    }

    return m;
}