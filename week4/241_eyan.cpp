class Solution {
    int compute(int a, int b, char sym) {
        if (sym == '+') return a+b;
        if (sym == '-') return a-b;
        if (sym == '*') return a*b;
        return -0x3fffffff;
    }
public:
    vector<int> diffWaysToCompute(string input) {
        vector<int> rslt;
        bool flag = false;
        for (int i = 0; i < input.size(); i++) {
            if (input[i] == '+' || input[i] == '-' || input[i] == '*') {
                flag = true;
                vector<int> left = diffWaysToCompute(input.substr(0, i));
                vector<int> right = diffWaysToCompute(input.substr(i+1, input.size()-1-i));
                for (int u = 0; u < left.size(); u++) {
                    for (int v = 0; v < right.size(); v++) {
                        rslt.push_back(compute(left[u], right[v], input[i]));
                    }
                }
            }
        }

        if (flag == false) {
            rslt.push_back(stoi(input));
        }

        return rslt;
    }
};