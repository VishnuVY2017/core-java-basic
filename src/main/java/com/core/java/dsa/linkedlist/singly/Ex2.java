package com.core.java.dsa.linkedlist.singly;


// Traverse the elements in Recursive Style
// Time Complexity - O(N)
public class Ex2 {

    static void displayList(Node currNode) {
        if (currNode == null)
            return;

        System.out.println(currNode.data);
        displayList(currNode.next);

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        displayList(head);
    }
}
