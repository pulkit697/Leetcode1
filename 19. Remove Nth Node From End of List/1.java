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
        int m = 0;
        ListNode ptr = head;
        while (ptr != null) {
            ptr = ptr.next;
            m++;
        }
        int k = m - n;
        if (k == 0) return head.next;
        ptr = head;
        while (ptr != null) {
            k--;
            if (k == 0) {
                ptr.next = ptr.next.next;
                break;
            }
            ptr = ptr.next;
        }
        return head;
    }
}
