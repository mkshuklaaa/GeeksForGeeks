/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static void helper(Node root, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> s) {
        if (root == null) return;
        s.add(root.data);

        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<>(s));
        }

        helper(root.left, ans, s);
        helper(root.right, ans, s);
        
        s.remove(s.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> s = new ArrayList<>();
        helper(root, ans, s);
        return ans;
    }
}
