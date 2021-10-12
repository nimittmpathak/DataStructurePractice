package com.CTCISolutions.LinkedLists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class LinkedListPalindrome {
    public static boolean isOdd(int linkedListSize){
        if(linkedListSize % 2 == 0){
            return false;
        } else {
            return true;
        }
    }
    public static boolean isPalindrome(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;
        while (fast != null && fast.next != null) {
            Stack<Integer> stack = new Stack<Integer>();

        }
        return true;
    }

    public static void main(String args[]){
        LinkedListNode linkedListNode = new LinkedListNode();
        linkedListNode.add(1);
        linkedListNode.add(2);
//        linkedListNode.add(3);
        linkedListNode.add(3);
        linkedListNode.add(2);
        linkedListNode.add(1);

        //remove duplicate
        Set<Integer> uniqueSet = new HashSet<Integer>();
        //System.out.println("Head: "+linkedListNode.getFirst());
        //int linkedListSize =linkedListNode.size();
        //System.out.println("Size of the Linked List:"+linkedListSize);
        //slow and fast runner technique to identify






    }
}
