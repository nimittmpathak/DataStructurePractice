package com.CTCISolutions.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class RouteBetweenTwoNodes {
    public enum State {
        UNVISITED,
        VISITED,
        VISITING;
    }

    // Traverse through a graph either with BFS or DFS method to find existance of Route
    public static boolean searchRouteBetweenTwoNodes(Graph g, Node start, Node end){
        if(start == end){
            return true;
        }
        // operates as Queeue
        LinkedList<Node> q = new LinkedList<Node>();
        //set up all nodes unvisted first
        for(Node u: g.getNodes()){
            u.state = State.UNVISITED;
        }
        //mark first node as visiting since just started
        start.state = State.VISITING;
        q.add(start);
        Node u;
        // travers the queue untill not empty
        while (!q.isEmpty()){
            u = q.removeFirst();
            if(u != null){
                for(Node v : u.getAdjacents()){
                    if(v.state == State.UNVISITED){
                        if(v==end){
                            return true; // return true if the second node found by tranversing through the first node's neighbour
                        } else {
                            v.state = State.VISITING;
                            q.add(v);
                        }
                    }
                }
                u.state = State.VISITED;
            }
        }
        return false;
    }
    public static void main(String args[]){
        // creating Node
        Node n1 = new Node("n1");
        Node n2 = new Node("n2");
        Node n3 = new Node("n3");
        Node n4 = new Node("n4");
        Node n5 = new Node("n5");
        // creating node list for each node
        ArrayList<Node> n1List = new ArrayList<Node>();
        n1List.add(n2);
        ArrayList<Node> n2List = new ArrayList<Node>();
        n2List.add(n3);
        ArrayList<Node> n3List = new ArrayList<Node>();
        n3List.add(n4);
        n3List.add(n2);
        ArrayList<Node> n4List = new ArrayList<Node>();
        n4List.add(n3);
        n4List.add(n1);
        ArrayList<Node> n5List = new ArrayList<Node>();
        n5List.add(n5);
        // assigning node list to each node
        n1.setAdjacents(n1List);
        n2.setAdjacents(n2List);
        n3.setAdjacents(n3List);
        n4.setAdjacents(n4List);
        n5.setAdjacents(n5List);
        // creating a graph object to contain all Nodes
        Graph g1 = new Graph();
        ArrayList<Node> nodeListForGraph = new ArrayList<Node>();
        //add all nodes to the arraylist of graph
        nodeListForGraph.add(n1);
        nodeListForGraph.add(n2);
        nodeListForGraph.add(n3);
        nodeListForGraph.add(n4);
        nodeListForGraph.add(n5);
        //assigne all nodes to graph by setting up an arraylist of Nodes to Graph
        g1.setNodes(nodeListForGraph);

        boolean result = searchRouteBetweenTwoNodes(g1,n1,n5);
        System.out.println("Result: "+result);
    }
}
