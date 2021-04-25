/*
Problem Description
Given a binary tree and an integer k, you need to find whether k is present in the tree or not.

Input format
First line contains an integer n - Number of nodes.

Second line contains n space separated integers - The value of nodes.

Next n lines contains 3 space separated integers i, l, r describing the left and the right child of ith node as l and r respectively.

Last line contains an integer k - The integer you have to find.

Output format
Return true if k is present, otherwise false.

Sample Input 1
6
4 6 -2 -4 -2 2
1 2 3
2 4 5
3 6 -1
4 -1 -1
5 -1 -1
6 -1 -1

2

Sample Output 1
true
*/

import java.util.*;
import crio.ds.Tree.TreeNode;

public class TreeNode {
    public long val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (long x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Solution {
    public boolean binaryTreeSearching(TreeNode root, int k) {

    if(root == null) return false;

    if(root.val == k ) return true;

                boolean result = binaryTreeSearching(root.left, k);
                if(result) return true;

                boolean result2 = binaryTreeSearching(root.right, k);
                if(result2) return true;
    
    return false;
    }

}
