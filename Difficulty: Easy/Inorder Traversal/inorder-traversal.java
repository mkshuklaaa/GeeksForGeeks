/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    void helper(ArrayList<Integer> ans,Node root){
        if(root==null) return;
        helper(ans,root.left);
        ans.add(root.data);
        helper(ans,root.right);
    }
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ans = new ArrayList<>();
        helper(ans,root);
        return ans;
    }
}