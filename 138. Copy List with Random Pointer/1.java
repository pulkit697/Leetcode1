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
        if (head == null)   return head;
        Node head2 = new Node(head.val);
        Node ptr = head;
        Node ptr2 = head2;
        HashMap<Node, Node> map = new HashMap();
        map.put(ptr, ptr2);
        while(ptr.next != null) {
            ptr2.next = new Node(ptr.next.val);
            map.put(ptr.next, ptr2.next);
            ptr = ptr.next;
            ptr2 = ptr2.next;
        }
        ptr2 = head2;
        ptr = head;
        while (ptr2 != null) {
            ptr2.random = map.get(ptr.random);
            ptr = ptr.next;
            ptr2 = ptr2.next;
        }
        return head2;
    }
}
