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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode i = head;
        ListNode j = head;
        ListNode prev = null;
        while(cnt < (n -1)){
            j = j.next;
            cnt++;
        }
        if(i == j && j.next == null)
        {
            return null;
        }
        if(j.next == null)
        {
            return i.next;
        }
        while(j.next != null)
        {
            prev = i;
            i = i.next;
            j = j.next;
        }
        if(i == j )
            prev.next = null;
        else
            prev.next = i.next;

        return head;
    }
}
