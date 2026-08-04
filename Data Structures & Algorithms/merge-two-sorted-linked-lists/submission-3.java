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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode s1 = list1;
        ListNode s2 = list2;
        ListNode ans = new ListNode(0);
        ListNode tail = ans;
        while(s1 != null && s2 != null){
            if(s1.val>s2.val){
                tail.next = s2;
                s2 = s2.next;
                tail = tail.next;
            }
            else{
                tail.next = s1;
                s1 = s1.next;
                tail = tail.next;
            }
        }
        if(s1 != null){
            tail.next = s1;
        }
        else{
            tail.next = s2;
        }
        return ans.next;
    }    
}