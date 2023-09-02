/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;// store the head bcz head not loss
        ListNode l2=headB;
        int c1=0,c2=0;
        while(l1!=null){//condition that link list cannot be null
           c1++;
           l1=l1.next;
        }
        while(l2!=null){//same for l2
            c2++;
            l2=l2.next;
        }
        l1=headA;
        l2=headB;
        if(c2>c1){
            int c=c2-c1;
            for(int i=0;i<c;i++){
                l2=l2.next;
            }
        }
        else{
            int c=c1-c2;
            for(int i=0;i<c;i++){
                l1=l1.next;
            }
        }
        while(l1!=null){
            if(l1==l2){
                return l1;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return null;
    }
}
