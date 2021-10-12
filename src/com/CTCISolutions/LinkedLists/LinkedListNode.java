package com.CTCISolutions.LinkedLists;

public class LinkedListNode {
        com.CTCISolutions.LinkedLists.LinkedListNode next = null;
        com.CTCISolutions.LinkedLists.LinkedListNode previous = null;
        int data;
        public LinkedListNode(){};
        public LinkedListNode(int d){
            this.data = d;
        }
        public void add(int d){
                this.data = d;
        }
}
