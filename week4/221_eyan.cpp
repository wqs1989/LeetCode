class Solution {
public:
    int maximalSquare(vector<vector<char>>& matrix) {
        int n=matrix.size();
        if(n==0)return 0;
        int m=matrix[0].size();
        int max=0;
       vector<vector<int>> f(n+1,vector<int>(m+1,0));
       for(int i=1;i<=n;i++)
        for(int j=1;j<=m;j++)
        {
            if(matrix[i-1][j-1]=='0')f[i][j]=0;
            else
            {

                f[i][j]=min(min(f[i-1][j],f[i][j-1]),f[i-1][j-1])+1;
                if(f[i][j]>max)max=f[i][j];
            }
        }
        return max*max;
    }
};