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
    public ListNode lastNode(ListNode head)
    {
        if(head == null)
            return head;
        ListNode slast = head;
        while(head.next != null)
        {
            slast = head;
            head = head.next;
        }
        slast.next = null;
        return head;
    }
    public void reorderList(ListNode head) {
        ListNode curr = head;
        int cnt = 0;
        ListNode last = curr;
        ListNode temp = curr;


        while(curr != null)
        {
            cnt++;
            curr = curr.next;
        }
        curr = head;
        for(int i = 0;i < cnt / 2 ; i++)
        {
            temp = curr.next;
            curr.next = last = lastNode(temp);
            if(last == temp)
            {
                curr.next = temp;
            }
            last.next = temp;
            curr = temp;
            
        }
        temp.next = null;

    }
}
