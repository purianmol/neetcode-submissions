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
    int last_index;
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length ==0) return null;
        if(lists.length ==1) return lists[0];
        last_index = lists.length-1;
        mergeLists(0,lists);        
        return lists[last_index];
    }
    void mergeLists(int i,ListNode[] lists){
        if(i == last_index) return;
        ListNode head_a = lists[i];
        ListNode head_b = lists[i+1];
        mergeTwoLists(i+1,head_a,head_b,lists);
        mergeLists(i+1,lists);
    }
    void mergeTwoLists(int index,ListNode head_a,ListNode head_b,ListNode[] lists){
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        ListNode a = head_a;
        ListNode b = head_b;
        ListNode temp = head;
        while(a != null && b != null){
            if(a.val > b.val){
                temp.next = b;
                b = b.next;
            }
            else{
                temp.next = a;
                a = a.next;
            }
            temp = temp.next;
        }
        if(a != null){
            temp.next = a;
        }
        if(b!= null){
            temp.next = b;
        }
        lists[index] = head.next;
    }
}
