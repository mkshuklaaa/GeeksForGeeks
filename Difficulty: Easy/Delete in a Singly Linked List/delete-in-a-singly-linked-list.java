/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp =head;
        if(x==1){
            head=head.next;
            return head;
        }
        for(int i=2;i<=x-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}