class Solution {
public:
ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
    ListNode *pA = headA;
    ListNode *pB = headB;
    int lenA = 0;
    int lenB = 0;
    while (pA) {++lenA;  pA = pA->next; }
    while (pB) {++lenB;  pB = pB->next; }
    for (int diff = abs(lenA - lenB); diff > 0; --diff) {
        if (lenA > lenB) {
            headA = headA->next;
        }
        else {
            headB = headB->next;
        }
    }
    while (headA && headB) {
        if (headA == headB) {
            return headA;
        }
        headA = headA ->next;
        headB = headB ->next;
    }
    return NULL;
}
};