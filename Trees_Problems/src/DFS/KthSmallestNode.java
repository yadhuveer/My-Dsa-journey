package DFS;

import javax.swing.tree.TreeNode;

public class KthSmallestNode {

    int count=0;

    public  TreeNode helper(TreeNode root,int k){

        if(root==null){
            return null;
        }

        TreeNode left= helper(root.left,k);
        if(left!=null){
            return left;
        }

        count++;
        if(count==k){
            return root;
        }

        TreeNode right = helper(root.right,k);
        return right;


    }


}
