class Solution {
public:
    int computeArea(int A, int B, int C, int D, int E, int F, int G, int H)  {
        int area1 = (C - A) * (D - B), area2 = (G - E) * (H - F);
        int x_min = std::max(A,E), x_max = std::min(C,G);
        if (x_min >= x_max)
            return area1 + area2;
        int y_min = std::max(B,F), y_max = std::min(D,H);
        if (y_min >= y_max)
            return area1 + area2;
        return area1 - (x_max - x_min) * (y_max - y_min) + area2;
    }
};
