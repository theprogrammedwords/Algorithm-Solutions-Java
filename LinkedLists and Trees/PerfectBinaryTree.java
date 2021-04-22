/*
Create a perfect binary tree with given depth and return the root. The value of nodes should be equal to the depth of that node. Print the inorder traversal of the formed tree from the root.

A Binary tree is a Perfect Binary Tree if all the internal nodes have two children and all leaf nodes are at the same level.
*/

import java.util.*;
import crio.ds.Tree.TreeNode;

/*
Definition of TreeNode
class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

Use new TreeNode(data) to create new Node
*/
class PerfectBinaryTree {

    public TreeNode perfectBinaryTree(int depth) {
        TreeNode root = new TreeNode(0);
        
        int index = 1;
        while(index <= depth){
            root = addRecursive(root, index);
            index++;
        }
    return root;
    }

    public TreeNode addRecursive(TreeNode current, long value){
        if(current == null){
            return new TreeNode(value);
        }else{
            if(current.val < value){
                current.left = addRecursive(current.left, value);
                current.right = addRecursive(current.right, value);
            }
        }
    return current;
    }
}
