/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public int height(Node root){
        if(root==null || root.left==null&&root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(Node root) {
        // code here
        if(root==null) return true;
        int lh = height(root.left);
        if(root.left!=null) lh++;
        int rh = height(root.right);
        if(root.right!=null) rh++;
        int d = lh-rh;
        if(d<0) d=-d;
        if(d>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
}