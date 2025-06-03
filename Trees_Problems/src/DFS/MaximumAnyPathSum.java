package DFS;

import javax.swing.tree.TreeNode;

public class MaximumAnyPathSum {
     int sum=Integer.MIN_VALUE;

     public int maxPathSum(TreeNode root){
         helper(root);
         return sum;
     }
    public int helper(TreeNode root){



        if(root==null){
            return 0;
        }

        if(root.left==null && root.right==null){
            return root.val;
        }

        int left= helper(root.left);

        int right= helper(root.right);

        int newSum = left+right+root.val;

        sum = Math.max(newSum,sum);

        return root.val+Math.max(left,right);


    }
}
