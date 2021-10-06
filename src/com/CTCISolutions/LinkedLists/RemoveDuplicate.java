/*Remove Dups! Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?

First approach: (1) Traverse through Linked list (2) Store each element in an array (3) Find out duplicates elements from an array and insert into a duplicate list array (4) Create a method to delete resultant set from a linked list (5) return the liked list

Second Approach: (1) Traverse through liked lists and add each element in Hashset where it will automatically remove the duplicate. Define a new linked list and add each element from hash set and replace the linked list with the newly created linked list. --> Will develop the second approach
Suppose we have LinkedListNode class

*/
package com.CTCISolutions.LinkedLists;


import java.util.HashSet;

public class RemoveDuplicate {
    void deleteDup(LinkedListNode n){
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        // iterate through the linked list
        while(n != null){
            if(set.contains(n.data)){
                // following we have removed the node by cutting the link
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }
    void deleteDupNoBuffer (LinkedListNode n){
        LinkedListNode head = n;
        // iteragte through the linked list
        while(head != null){
            LinkedListNode fastRunner = head;
            while(fastRunner.next != null){
                if(fastRunner.next.data == head.data){
                    fastRunner.next = fastRunner.next.next;
                } else{
                    fastRunner = fastRunner.next;
                }
            }
            head = head.next;
        }
    }

    public static void main(String args[]){
        LinkedListNode root = new LinkedListNode(4);
        LinkedListNode head = root;
        System.out.println("First Root"+root.data);
        for(int i = 0; i<5; i++){
            if(i==0){
                root.next = new LinkedListNode(2);
                root.next.previous = root;
                root = root.next;
            }
            if(i==1){
                root.next = new LinkedListNode(2);
                root.next.previous = root;
                root = root.next;
            }
            if(i==2){
                root.next = new LinkedListNode(1);
                root.next.previous = root;
                root = root.next;
            }
            if(i==3){
                root.next = new LinkedListNode(5);
                root.next.previous = root;
                root = root.next;
            }
            if(i==4){
                root.next = new LinkedListNode(5);
                root.next.previous = root;

            }
        }
        System.out.println("Root after adding data"+root.data);
        root = head;
        System.out.println("Print all elements in the linked list");
        while (root != null){
            System.out.println("CurrentNode"+root.data);
            root = root.next;
        }
        root = head;
        System.out.println("CurrentNode after reset"+root.data);
        RemoveDuplicate rd = new RemoveDuplicate();
        System.out.println("Calling remove duplicate method");
        rd.deleteDup(root);
        //rd.deleteDupNoBuffer(root);
        root = head;
        while (root != null){
            System.out.println("CurrentNode"+root.data);
            root = root.next;
        }
        root = head;


    }



}
