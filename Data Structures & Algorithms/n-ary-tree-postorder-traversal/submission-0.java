/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> post = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        post(root);
        return post;
    }
    void post(Node node){
        if(node == null) return;
        for(Node nei:node.children){
            post(nei);
        }
        post.add(node.val);
    }
}