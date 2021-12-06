package com.CTCISolutions.Tree;

import com.CTCISolutions.Graphs.Node;

import java.util.ArrayList;

public class TreeNode {
    TreeNode(){}
    TreeNode(int dt){
        this.data = dt ;
    }

    public int data;
    TreeNode left;
    TreeNode right;
    public ArrayList<TreeNode> children;
}
