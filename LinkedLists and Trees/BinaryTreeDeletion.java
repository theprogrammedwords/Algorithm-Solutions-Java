/*Problem Description
Given a binary tree, you have to delete all the leaf nodes of that tree and return the root.

Print the inorder of the binary tree thus formed.

Input format
First line contains an integer n - Number of nodes.

Second line contains n space separated integers - The value of nodes.

Next n lines contain 3 space separated integers i, l, r describing left and right child of ith node as l and r respectively.

Output format
Print the inorder traversal of the tree.

Sample Input 1
4

6 4 3 5
1 2 3
2 4 -1
3 -1 -1
4 -1 -1

Sample Output 1
4 6
*/

import java.io.*;
import java.util.*;
import crio.ds.Tree.TreeNode;



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

class BinaryTreeDeletion {

    public TreeNode binaryTreeDeletion(TreeNode root) {

        if(root == null) return null;

        if(root.left == null && root.right ==null ){
            return null;
        }
            root.left = binaryTreeDeletion(root.left);
            root.right = binaryTreeDeletion(root.right);

        return root;
    }
}
