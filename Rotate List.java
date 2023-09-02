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
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null) {
            return head;
        }
          int size=1;
        ListNode last=head;
        while (last.next!=null){
            last=last.next;
            size++;
        }
        last.next=head;
        int roatations=k%size; 
        int skip=size-roatations;
        ListNode newLast=head;
        for (int i = 0; i < skip-1; i++) {
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;
        return head;
    }
}
