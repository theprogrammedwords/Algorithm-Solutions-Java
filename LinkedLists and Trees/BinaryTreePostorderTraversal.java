//Given a binary tree, return the postorder traversal of its nodes' values.

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
public class BinaryTreePostorderTraversal {

  public List<Long> binaryTreePostorderTraversal(TreeNode root) {
    List<Long> llnodes = new ArrayList<Long>();

        Stack<TreeNode> stk1 = new Stack<TreeNode>();
        Stack<TreeNode> stk2 = new Stack<TreeNode>();

        stk1.push(root);
        while(stk1.size() > 0){
          TreeNode temp = stk1.pop();
          stk2.push(temp);

          if(temp.left != null) stk1.push(temp.left);
          if(temp.right != null) stk1.push(temp.right);
        }

        while(stk2.size() > 0){
          TreeNode temp = stk2.pop();
          llnodes.add(temp.val);
        }

      return llnodes;

  }


}
