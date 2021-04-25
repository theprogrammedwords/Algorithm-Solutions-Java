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

class BinaryTreeInsertion {
    public TreeNode binaryTreeInsertion(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        TreeNode curr = root;

        while(!q.isEmpty()){
        

            if(curr.left == null && curr.right != null){
                curr.left = new TreeNode(0);
                q.add(curr.right);
            }
           
            else if(curr.left != null && curr.right ==null){
                curr.right = new TreeNode(0);
                q.add(curr.left);
           }
           
           else if(curr.left != null && curr.right != null){
               q.add(curr.left);
               q.add(curr.right);
           }
            q.remove();

            if(!q.isEmpty())
                curr = q.peek();
            else   
                curr = null;
        }

    return root;
    }

    
}
