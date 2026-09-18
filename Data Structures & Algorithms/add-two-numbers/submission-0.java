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
    boolean carry = false;
    boolean first = true;
    int add(int v1,int v2){
        int val =v1+v2;
        if(carry){
            val++;
            carry = false;
        }
        if(val >= 10){
                val = val - 10;
                carry = true;
        }   
        return val;            
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode(0,null);
        ListNode l3 = new ListNode(0,curr);            
        while(l1.next != null && l2.next != null)
        {
            int val =add(l1.val,l2.val);
            if(first)
            {
                l3.val = val;
                l3.next = null;
                curr = l3;
                first = false;
            }
            else
            {
                ListNode temp = new ListNode(val,null);
                curr.next = temp;
                curr= temp;
            }
            l1=l1.next;
            l2=l2.next;
        }
        
        int val =add(l1.val,l2.val);
        if(first)
        {
            l3.val = val;
            l3.next = null;
            curr = l3;
            first = false;
        }else{
            ListNode temp = new ListNode(val,null);
            curr.next = temp;
            curr= temp;
        }
        

        if(l1.next != null)
        {   l1=l1.next;
            while(l1.next != null)
            {
                int val1 = add(l1.val,0);
                ListNode temp3 = new ListNode(val1,null);
                curr.next = temp3;
                curr= temp3;
                l1=l1.next;
            }
            int val1 = add(l1.val,0);
            ListNode temp3 = new ListNode(val1,null);
            curr.next = temp3;
            curr= temp3;
            l1=l1.next;
        }
        
        if(l2.next != null)
        {
            l2=l2.next;
            while(l2.next != null)
            {
                int val2 = add(l2.val,0);
                ListNode temp4 = new ListNode(val2,null);
                curr.next = temp4;
                curr= temp4;
                l2=l2.next;            
            }
            int val2 = add(l2.val,0);
            ListNode temp4 = new ListNode(val2,null);
            curr.next = temp4;
            curr= temp4;
            l2=l2.next;
        }
        if(carry)
        {
            ListNode temp2 = new ListNode(1,null);
            curr.next = temp2;
            curr = temp2;
        }
         
        while (curr != l3 && curr.val == 0)
        {   ListNode temp1 = l3;
            while(temp1.next != curr)
            {
                temp1 = temp1.next;
            }
            curr = temp1;
            curr.next = null;
        }
        
        return l3;
    }
}