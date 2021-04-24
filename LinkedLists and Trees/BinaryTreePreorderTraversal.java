
//Given a binary tree, return the preorder traversal of its nodes' values.

import java.util.*;
import crio.ds.Tree.TreeNode;

/*
// Definition of TreeNode
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

Use new TreeNode(data) to create new Node
*/
public class BinaryTreePreorderTraversal {
  public List<Long> binaryTreePreorderTraversal(TreeNode root) {
  List<Long> llnodes = new ArrayList<Long>();

//      inorder(root, llnodes);    
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode curr = root;

        while(curr != null || stk.size() >0){
            while(curr != null){
                llnodes.add(curr.val);
                stk.push(curr);
                curr = curr.left;
            }
            curr = stk.pop();
            curr = curr.right;
        }



  
      return llnodes;


  }

}
