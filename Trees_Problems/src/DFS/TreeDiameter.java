package DFS;

import javax.swing.tree.TreeNode;

public class TreeDiameter {

    public int diameter=0;

    public  int DiameterCalculate(TreeNode root){

        helper(root);
        return diameter;
    }

    public int helper(TreeNode node){

        if(node==null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        int newDiameter= left+right;
        diameter=Math.max(diameter,newDiameter);
        return Math.max(left,right)+1;
    }



}
