package com.CTCISolutions.Tree;

import com.CTCISolutions.Graphs.Node;
import com.sun.source.tree.Tree;

// create Binary Search Tree from sorted array
public class CreateBST {
    public TreeNode createMinimalBST(int array[]){
        return createMinimalBST(array,0,array.length-1);
    }
    public TreeNode createMinimalBST(int array[],int start, int end){
        if (end < start){
            return null;
        }
        int mid = end - start /2;

        TreeNode n = new TreeNode(array[mid]);
        n.left = createMinimalBST(array,start,mid-1);
        n.right = createMinimalBST(array,mid+1,end);
        return n;
    }

    public static void main(String args[]){
        int[] sortedArray = {1,2,3,4,5,6,7,8,9};
        CreateBST cb = new CreateBST();
        TreeNode resultNode = cb.createMinimalBST(sortedArray);
        System.out.println("Result Node: "+resultNode.data);
        for (int i =0; i<sortedArray.length; i++){
            System.out.println("Traversing a Tree: "+resultNode.data);
            resultNode = resultNode.left;
        }

    }
}
