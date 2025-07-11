package com.core.java.dsa.linkedlist.singly;


// Traverse the elements
// Time Complexity - O(N)
public class Ex1 {

    static void displayList(Node headNode){
       Node currentNode = headNode;
       while (currentNode != null){
           System.out.println(currentNode.data);
           currentNode = currentNode.next;
       }
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
