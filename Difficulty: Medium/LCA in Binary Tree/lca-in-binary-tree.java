/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    // Function to return the lowest common ancestor in a Binary Tree.
    boolean contains(Node root,int node){
        if(root==null) return false;
        if(root.data==node) return true;
        return contains(root.left,node) || contains(root.right,node);
    }
    
    Node lca(Node root, int n1, int n2) {
        // Your code here
        if(n1==root.data || n2==root.data) return root;
        if(n1==n2) return new Node(n1);
        
        boolean leftp= contains(root.left,n1);
        boolean rightq= contains(root.right,n2);
        
        if(leftp && rightq || !leftp && !rightq ) return root;
        if(!leftp && rightq) return lca(root.right,n1,n2);
        return lca(root.left,n1,n2);
    }
}