/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = slow.next;
        slow.next = null;
        ListNode cur = fast.next;
        ListNode rightHead = new ListNode(0);
        rightHead.next = fast;
        while(cur!= null){
            fast.next = cur.next;
            cur.next = rightHead.next;
            rightHead.next = cur;
            cur = fast.next;
        }
       //System.out.println(rightHead.next.val + ","+ rightHead.next.next.val);
        //ListNode dummyHead = new ListNode(0);
        //dummyHead.next = head;
        ListNode temp = head, temp2 = rightHead.next;
        while(head != null && temp2 != null){
            temp = head.next;
            head.next = temp2;
            temp2 = temp2.next;
            head.next.next = temp;
            head = temp;
        }
        return;
        
    }
}