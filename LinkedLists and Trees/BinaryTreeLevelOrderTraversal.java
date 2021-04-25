/*Given a binary tree, return the level order traversal of its nodes' values.(ie, from left to right, level by level).

Input Format
First line contains one integer N denoting the number of elements in the array

Next line contains N words denoting the elements of Binary Tree where null means no element.

Constraints
1<=N<=10^5

1<=Ai<=10^9

Output Format
Print elements of each level in a separate line.

Sample Input 1
4
4 3 2 1
1 2 3
2 4 -1
3 -1 -1
4 -1 -1

Sample Output 1
4
3 2
1
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


class BinaryTreeLevelOrderTraversal {    
    public List<List<Integer>> binaryTreeLevelOrderTraversal(TreeNode root) {
        List<Integer> listInt = new ArrayList<Integer>();
        List<List<Integer>> qlist = new ArrayList<List<Integer>>();

        Queue<TreeNode> CurrQue = new LinkedList<TreeNode>();
        Queue<TreeNode> NextQue = new LinkedList<TreeNode>();

        if(root == null) return qlist;
        
        CurrQue.add(root);

           
        while(!CurrQue.isEmpty()){
 
            TreeNode temp= CurrQue.poll();
            
            if(temp.left != null){
                NextQue.add(temp.left);
            }

            if(temp.right != null){
                NextQue.add(temp.right);
            }
            listInt.add((int)temp.val);

            if(CurrQue.isEmpty()){
                CurrQue = NextQue;
                NextQue = new LinkedList<TreeNode>();
                qlist.add(listInt);
                listInt = new ArrayList();
            }
        }
        
        
        return qlist;
    }

}
