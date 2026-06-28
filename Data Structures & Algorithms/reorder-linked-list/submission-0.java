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
    public void reorderList(ListNode head) {
       if (head == null || head.next == null) {
            return;
        }

        ListNode s1 = head;
        ListNode s2 = head;

        while(s1 != null && s1.next != null){
            s1 = s1.next.next;
            s2 = s2.next;
        }
        // now lets reverse s2
        ListNode secondHalf = s2.next;
        s2.next = null;
        ListNode prev = null;
        ListNode curr = secondHalf;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next; 
            
            first.next = second;
            second.next = temp1;
            
            first = temp1;
            second = temp2;
        }
    }
}
