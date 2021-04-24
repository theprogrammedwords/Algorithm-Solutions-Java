//Given a binary tree, return the inorder traversal of its nodes' values.

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
public class BinaryTreeInorderTraversalIterative {


  public List<Long> inorderTraversal(TreeNode root) {
      List<Long> llnodes = new ArrayList<Long>();

      inorder(root, llnodes);    
      return llnodes;
  }

  public List<Long> inorder(TreeNode root, List<Long> llnodes){

      if(root == null) 
        return llnodes;
    

      if(root.left == null && root.right == null){
          llnodes.add(root.val);
      }

      if(root.left != null){
          inorder(root.left, llnodes);
      }
      
      if(root.right != null || root.left != null){
          llnodes.add(root.val);
      }
    
      if(root.right != null){
          inorder(root.right, llnodes);
      }
      return llnodes;
  }

};
