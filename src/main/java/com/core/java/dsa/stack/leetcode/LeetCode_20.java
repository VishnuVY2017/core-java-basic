package com.core.java.dsa.stack.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_20 {

     private Map<Character, Character> map;

    public LeetCode_20(){
        this.map = new HashMap<>();
        this.map.put('{', '}');
        this.map.put('(', ')');
        this.map.put('[', ']');
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                char close = map.get(open);
                if(ch != close){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{([)}";
        LeetCode_20 l = new LeetCode_20();
        System.out.println(l.isValid(s));
    }
}
