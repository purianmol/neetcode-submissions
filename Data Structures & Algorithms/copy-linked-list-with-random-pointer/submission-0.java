/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node dummy = new Node(0);
        Node curr = dummy;
        Node node = head;
        while(node!= null){
            map.put(node,new Node(node.val));
            curr.next = map.get(node);
            node = node.next;
            curr = curr.next;
        }
        Node ptr = head;
        while(ptr!= null){
            map.get(ptr).random = map.get(ptr.random);
            ptr = ptr.next;
        }
        return dummy.next;
    }
}
