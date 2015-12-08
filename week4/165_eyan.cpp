class Solution {
public:
    int compareVersion(string version1, string version2) {
        if(version1 == version2) {
            return 0;
        }
        int index1 = 0;
        int index2 = 0;
        int start1 = 0;
        int start2 = 0;
        while(index1 < version1.size() || index2 < version2.size()) {
            while(version1[index1] != '.' && index1 < version1.size()) {
                ++index1;
            }
            while(version2[index2] != '.' && index2 < version2.size()) {
                ++index2;
            }
            int num1 = index1 > version1.size() ? 0 : stoi(version1.substr(start1, index1 - start1));
            int num2 = index2 > version2.size() ? 0 : stoi(version2.substr(start2, index2 - start2));
            if(num1 > num2) {
                return 1;
            }
            else if(num1 < num2) {
                return -1;
            }
            else {
                ++index1;
                ++index2;
                start1 = index1;
                start2 = index2;
            }
        }
        return 0;
    }
};