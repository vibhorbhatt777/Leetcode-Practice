/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if(head->next == nullptr)// base case if there is single node
            return true;
            ListNode * traverse = head;
        int count =0;
        while(traverse !=nullptr){
            traverse = traverse->next;
            count++;
        }
        count = count /2;
        traverse = head;
        int count2 =0;// traverse pointing toward second half
        while(count2 < count){
            traverse = traverse ->next;
            count2++;
        }
        ListNode * prev = nullptr;
        ListNode * curr = traverse;
        ListNode * temp = nullptr;
        while(curr != nullptr){
            temp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = temp;
        }
        bool flag = true;
        while(count>0){
            if(prev->val != head->val){
                flag = false;
                break;
            }
            head = head->next;
            prev = prev->next;
            count--;
            
        }
        return flag;
    }
};
