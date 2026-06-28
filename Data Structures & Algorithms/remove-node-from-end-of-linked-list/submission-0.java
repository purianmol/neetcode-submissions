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
        ListNode prev = null;
        ListNode curr = head;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        if(n==1){
            ListNode newHead = prev.next;
            prev = newHead;
        }
        else{
            ListNode node = prev;
            for(int i = 0;i<n-2;i++){
                if(node == null){
                    break;
                }
                node = node.next;
            }
            if (node != null && node.next != null) {
                node.next = node.next.next;
            }
        }
        ListNode prev2 =null;
        ListNode curr2 = prev;
        while(curr2!= null){
            ListNode temp2 = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = temp2;
        }
        return prev2;

    }
}
