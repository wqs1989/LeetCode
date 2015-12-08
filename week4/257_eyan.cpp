class Solution {
    vector<string> result;
    void printTree(TreeNode* root, string path="")
    {
        if (root == NULL) return;
        stringstream ss;
        ss << root->val;
        string n;
        ss >> n;
        path += n;
        if (root->left == NULL && root->right ==NULL) {
            result.push_back(path);
        }
        path += "->";
        printTree(root->left, path);
        printTree(root->right, path);
    }
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        printTree(root);
        return result;   
    }
};