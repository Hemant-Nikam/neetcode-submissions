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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        ListNode curr1 = new ListNode();
        ListNode curr2 = new ListNode();
        if(list1.val > list2.val)
        {
            curr1 = list2;
            curr2 = list1;

        }
        else{
            curr1 = list1;
            curr2 = list2;
        }
        ListNode min = new ListNode();
        ListNode temp = new ListNode();

        ListNode head = curr1;
        temp = curr1;
        curr1 = curr1.next;

        while(curr1 != null && curr2 != null)
        {
            if(curr1.val > curr2.val)
            {
                min = curr2;
                curr2 = curr2.next;
            }
            else{
                min = curr1;
                curr1 = curr1.next;

            }
            temp.next = min;
            temp = temp.next;
            
        }
        if(curr1 == null){
            temp.next = curr2;
        }
        else if(curr2 ==  null)
        {
            temp.next = curr1;
        }
        return head;
    }
}