package com.DataStrcturesQueue;

import org.w3c.dom.Node;

public class QueueMain {
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.remove());

    }
}
