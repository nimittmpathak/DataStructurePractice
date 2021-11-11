package com.CollectionPractice;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueuePrac {
    public static void main(String args[]){
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(1);
        que.add(2);
        que.add(4);
        int i = que.peek();
        System.out.println("peek "+i);
        System.out.println("Que:"+que);
        int j = que.poll();
        System.out.println("poll "+j);
        System.out.println("Que:"+que);
        que.remove();
        System.out.println("After remove the Que:"+que);

        Queue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);
        pq.add(3);

        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);

        int k = st.peek();
        System.out.println("K:"+k);
        System.out.println(st);
        int h = st.pop();
        System.out.println("H: "+h);
        System.out.println(st);
    }
}
