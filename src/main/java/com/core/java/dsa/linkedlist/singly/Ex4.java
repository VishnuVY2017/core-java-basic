package com.core.java.dsa.linkedlist.singly;

// Insert first position.
// TC - O(N)
public class Ex4 {

    public static Node insertFirst(Node headNode, int data) {

        Node temp = new Node(data);
        // List is empty
        if (headNode == null) {
            headNode = temp;
            return headNode;
        }

        // list is not empty
        temp.next = headNode;
        headNode = temp;

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
        myHead = insertFirst(myHead, 99);
        displayList(myHead);

        System.out.println("==========================");
        myHead = insertFirst(myHead, 10);
        myHead = insertFirst(myHead, 20);
        myHead = insertFirst(myHead, 30);
        myHead = insertFirst(myHead, 40);
        myHead = insertFirst(myHead, 50);
        myHead = insertFirst(myHead, 60);
        displayList(myHead);

        System.out.println("==========================");
    }
}
