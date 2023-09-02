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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;//head cannot be null bcz if head lost we lost all info
            // in java null and in c++ ->NULL 
        }
        ListNode Newnode = head;
        while (Newnode != null) {
            if (Newnode.next != null && Newnode.next.val == val) {
                Newnode.next = Newnode.next.next;
            } else {
                Newnode = Newnode.next;
            }
        }
        // checking the head node
        if (head.val == val) {
            head = head.next;
        }
        return head;
        

    }
}
