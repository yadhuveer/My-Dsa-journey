package DFS;

import javax.swing.tree.TreeNode;

public class MaxDepthOfTree {

    public static int Depth(TreeNode root,int depth){

        if(root==null){
            return depth;

        }

        int leftDepth= Depth(root.left,depth+1);
        int rightDepth= Depth(root.right,depth+1);

        return Math.max(leftDepth,rightDepth);
    }

}
