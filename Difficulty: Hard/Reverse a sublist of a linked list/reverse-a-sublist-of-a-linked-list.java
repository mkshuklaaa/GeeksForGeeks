// User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution {
    public static Node reverse(Node head){
        Node prev = null, curr = head;
        while(curr!=null){
            Node agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }

    public static Node reverseBetween(int a, int b, Node head) {
        if(head==null || a==b) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        
        for(int i=1;i<a;i++) prev = prev.next;

        Node start = prev.next;        
        Node end = start;
        for(int i=a;i<b;i++) end = end.next;

        Node nextPart = end.next;      
        end.next = null;               

        Node newHead = reverse(start); 

        prev.next = newHead;           
        start.next = nextPart;         

        return dummy.next;
    }
}
