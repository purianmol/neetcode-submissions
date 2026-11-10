/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){
            TreeNode left = deleteNode(root.left,key);
            root.left = left;
            return root;
        }
        if(root.val < key){
            TreeNode right = deleteNode(root.right,key);
            root.right = right;
            return root;
        }
        if(root.val == key){
            if(root.right == null) return root.left;
            TreeNode curr = root.right;
            List<TreeNode> list = new ArrayList<>();
            while(curr.left != null){
                curr = curr.left;
            }
            root.val = curr.val;
            root.right = deleteNode(root.right,root.val);
        }
        return root;
    }
}