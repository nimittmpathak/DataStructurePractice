package com.CTCISolutions.Graphs;

import java.util.ArrayList;


public class Node {
    public String name;
    Node(){}
    Node(String nm){
        this.name = nm;
    }
    public ArrayList<Node> adjacents;
    RouteBetweenTwoNodes.State state;
    public ArrayList<Node> getAdjacents(){
        return adjacents;
    }
    public void setAdjacents(ArrayList adjacentList){
            this.adjacents = adjacentList;
    }

}
