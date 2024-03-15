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
    private HashMap<Node, Node> map = new HashMap();
    public Node copyRandomList(Node head) {
        if (head == null)   return head;
        Node head2 = new Node(head.val);
        map.put(head, head2);
        head2.next = copyRandomList(head.next);
        head2.random = map.get(head.random);
        return head2;
    }
}
