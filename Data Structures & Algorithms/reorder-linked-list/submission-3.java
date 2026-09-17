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
    public void reorderList(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == slow || slow == null || slow.next == null)
            return ;
        ListNode first = head;
        ListNode second = slow.next;
        ListNode prev = null;
        ListNode temp = second.next;
        
        slow.next = null;

        while(temp != null)
        {
            second.next = prev;
            prev = second;
            second = temp;
            temp = temp.next;
        }
        second.next = prev;
        ListNode tmp1 = first.next;
        ListNode tmp2 = second.next;
        while(second != null && second.next != null)
        {
            first.next = second;
            first = tmp1;
            second.next = first;
            second = tmp2;
            tmp1 = first.next;
            tmp2 = second.next;
        }
        first.next = second;
        second.next = tmp1;

    }
}
