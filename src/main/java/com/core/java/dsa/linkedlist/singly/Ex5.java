package com.core.java.dsa.linkedlist.singly;

// Insert Last position.
// TC - O(N)
public class Ex5 {

    public static Node insertLast(Node headNode, int data) {

        Node temp = new Node(data);
        // 1. List is empty
        if (headNode == null) {
            headNode = temp;
            return headNode;
        }

        // List is not empty
        // Go to Last Node
        Node currNode = headNode;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = temp;

        return headNode;
    }

    static void displayList(Node headNode) {
        Node currentNode = headNode;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {

        Node myHead  = null;
        myHead = insertLast(myHead, 99);
        displayList(myHead);

        System.out.println("==========================");
        myHead = insertLast(myHead, 10);
        myHead = insertLast(myHead, 20);
        myHead = insertLast(myHead, 30);
        myHead = insertLast(myHead, 40);
        myHead = insertLast(myHead, 50);
        myHead = insertLast(myHead, 60);
        displayList(myHead);

        System.out.println("==========================");
    }
}
