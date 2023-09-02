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
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null)
         return head;
        Stack<ListNode>stack=new Stack<>();
        stack.push(head);
        ListNode traverse=head.next;
        while(traverse!=null){
            ListNode next=traverse.next;
            while(!stack.isEmpty() && stack.peek().val<traverse.val)
            stack.pop();
            if(stack.isEmpty())head=traverse;
            else stack.peek().next=traverse;
               stack.push(traverse);
                 traverse=next;
        }
        return head;
    }
}
