package com.DataStructuresStack;

public class StackMain {

    public static void main(String[] args) {
	// write your code here
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
