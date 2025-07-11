package com.core.java.dsa.stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    Deque<int[]> myStack = new ArrayDeque<>();

    public MinStack() {

    }

    public void push(int element) {

        if (myStack.isEmpty()) {
            myStack.push(new int[]{element, element});
            return;
        }


        int currMin = myStack.peek()[1];
        int min = Math.min(element, currMin);

        myStack.push(new int[]{element, min});
    }

    public void pop() {
        myStack.pop();
    }

    public int top() {
        return myStack.peek()[0];
    }

    public int getMin() {

        return myStack.peek()[1];
    }
}


public class LeetCode_155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(30);
        minStack.push(5);
        minStack.push(9);

        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());


        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

}
