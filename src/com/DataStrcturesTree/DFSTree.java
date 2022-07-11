package com.DataStrcturesTree;
import com.DataStrcturesTree.Node;

import java.util.Stack;

public class DFSTree {
    /*Depth-first search (DFS) is a traversal algorithm used for both Tree and Graph data structures. The depth-first search goes deep in each branch before moving to explore another branch.
 There are three different orders for traversing a tree using DFS:
        Preorder Traversal
        Inorder Traversal
        Postorder Traversal
        In preorder traversal, we traverse the root first, then the left and right subtrees.
        We can simply implement preorder traversal using recursion:
     * */
    public void traversePreOrder(Node node) {
        if (node != null) {
            visit(node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePreOrderWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        stack.push(root);
        while(!stack.isEmpty()) {
            current = stack.pop();
            visit(current.value);

            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }

    private void visit(int value) {
        System.out.println("Value: "+value);
    }

}
