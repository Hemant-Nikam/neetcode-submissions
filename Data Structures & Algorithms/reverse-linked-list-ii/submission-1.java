/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode curr = head;
        if(curr == null || curr.next == null)
            return head;
        ListNode nxt = head.next;
        ListNode tempLeft = null;
        ListNode tempLeft2 = null;

        int lcnt = 1;
        while(lcnt != left)
        {
            tempLeft = curr;
            curr = curr.next;
            tempLeft2 = curr;
            lcnt++;
        }
        if(tempLeft2 == null)
        {
            tempLeft2 = curr;
        }
        nxt = curr.next;
        int rcnt = lcnt;
        while( rcnt != right)
        {
            curr.next = prev;
            prev = curr;
            curr = nxt;
            nxt = curr.next;
            rcnt += 1;
        }
        curr.next = prev;
        if(tempLeft == null)
        {
            head = curr; 
        }else{
            tempLeft.next = curr;
        }
        tempLeft2.next = nxt;

        return head;
    }
}