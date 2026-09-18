/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node root = null;
        Node ocurr = head;
        Node ncurr = null;

        HashMap<Node,Node> map = new HashMap<>();
        while(ocurr != null)
        {
            Node temp = new Node(ocurr.val);
            if(root == null)
            {
                root = temp;
                ncurr = root;
            }
            else
            {
                ncurr.next = temp;
                ncurr = temp;
            }
            map.put(ocurr,temp);  
            ocurr = ocurr.next;     
        }
        ncurr = root;
        ocurr = head;
        while(ncurr != null)
        {
            ncurr.random = map.get(ocurr.random);
            ncurr = ncurr.next;
            ocurr = ocurr.next;
        }
        return root;
    }
}
