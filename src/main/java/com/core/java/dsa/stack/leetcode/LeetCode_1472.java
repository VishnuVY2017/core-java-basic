package com.core.java.dsa.stack.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;

class BrowserHistory {

    Deque<String> backwardHistory;
    Deque<String> forwardHistory;
    String currentUrl;

    public BrowserHistory(String homepage) {
        this.backwardHistory = new ArrayDeque<>();
        this.forwardHistory = new ArrayDeque<>();
        this.currentUrl = homepage;
    }

    public void visit(String url) {
        this.backwardHistory.push(this.currentUrl);
        this.currentUrl = url;
        this.forwardHistory.clear();
    }

    public String back(int steps) {

        while(steps > 0 && !backwardHistory.isEmpty()){
            this.forwardHistory.push(this.currentUrl);
            this.currentUrl = this.backwardHistory.pop();
            steps --;
        }

        return this.currentUrl;
    }

    public String forward(int steps) {

        while(steps > 0 && !forwardHistory.isEmpty()){
            this.backwardHistory.push(this.currentUrl);
            this.currentUrl = this.forwardHistory.pop();
            steps --;
        }

        return this.currentUrl;
    }
}


public class LeetCode_1472 {

    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory("vishnu.com");

        System.out.println("Current URL: "+browserHistory.currentUrl);
        System.out.println("Back History: "+browserHistory.backwardHistory);
        System.out.println("Forward History: "+browserHistory.forwardHistory);
        System.out.println("=============================");

        browserHistory.visit("sharma.com");

        System.out.println("Current URL: "+browserHistory.currentUrl);
        System.out.println("Back History: "+browserHistory.backwardHistory);
        System.out.println("Forward History: "+browserHistory.forwardHistory);
        System.out.println("=============================");

        browserHistory.visit("anu.com");
        browserHistory.visit("anvi.com");
        browserHistory.visit("akanksha.com");
        browserHistory.visit("bhaiya.com");

        System.out.println("Current URL: "+browserHistory.currentUrl);
        System.out.println("Back History: "+browserHistory.backwardHistory);
        System.out.println("Forward History: "+browserHistory.forwardHistory);
        System.out.println("=============================");

        browserHistory.back(2);

        System.out.println("Current URL: "+browserHistory.currentUrl);
        System.out.println("Back History: "+browserHistory.backwardHistory);
        System.out.println("Forward History: "+browserHistory.forwardHistory);
        System.out.println("=============================");


        browserHistory.forward(2);
        System.out.println("Current URL: "+browserHistory.currentUrl);
        System.out.println("Back History: "+browserHistory.backwardHistory);
        System.out.println("Forward History: "+browserHistory.forwardHistory);
        System.out.println("=============================");
    }

}
