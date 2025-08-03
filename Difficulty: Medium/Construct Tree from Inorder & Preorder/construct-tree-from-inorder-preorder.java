/*
class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}
*/

class Solution {
    public static Node helper(int preorder[],int pl,int ph, int inorder[],int il,int ih){
        if(pl>ph) return null;
        Node root = new Node(preorder[pl]);
        int i = il;
        
        while(preorder[pl]!=inorder[i]) i++;
        int ls = i-il;
        
        root.left = helper(preorder,pl+1,pl+ls,inorder,il,i-1);
        root.right = helper(preorder,pl+ls+1,ph,inorder,i+1,ih);
        
        return root;
        
    
    }
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        int n = preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
        
    }
}