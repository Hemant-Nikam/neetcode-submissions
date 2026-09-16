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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = null;
        ListNode nxt = null;

        if(head == null || head.next == null)
            return head;
        else
        {
            curr = head;
            nxt = curr.next;
        }
        while(nxt != null)
        {
            curr.next = prev;
            prev = curr;
            curr = nxt;
            nxt = curr.next;                      
        }
        curr.next = prev;
        head = curr;
        return head;
    }
}
