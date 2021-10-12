package com.CTCISolutions.LinkedLists;

import jdk.jshell.EvalException;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LInkedLIstPractice {
    public static void main(String args[]){
        LinkedList<Integer> intLinkedList = new LinkedList<Integer>();
        intLinkedList.add(4);
        intLinkedList.add(5);
        intLinkedList.add(2);
        intLinkedList.add(7);
        intLinkedList.add(8);
        //Iterator<Integer> itr = intLinkedList.iterator();
        ListIterator<Integer> itr = intLinkedList.listIterator();
        int val = 0;
        while (itr.hasNext()){
            if(itr.next() == 2){
//                val = (int)itr.next();
                val = (int)itr.previous();
                System.out.println(itr.next());
                System.out.println(itr.previous());
                System.out.println(itr.nextIndex());
                System.out.println(itr.previousIndex());
                break;
            }
        }
        System.out.println("Val: "+val);
    }
}
