package com.core.java.dsa.linkedlist.singly;


// Count the node
// Time Complexity - O(N)
public class Ex3 {

    static int displayList(Node headNode){
       Node currentNode = headNode;
       int count = 0;
       while (currentNode != null){
           currentNode = currentNode.next;
           count++;
       }
       return count;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
       // head.next.next.next.next = new Node(50);

        System.out.println(displayList(head));
    }
}
