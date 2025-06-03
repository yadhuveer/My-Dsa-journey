package DFS;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree_Values {

    public static void InvertTree(TreeNode root){

        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }

        int temp;

        if(root.left!=null && root.right!=null){
            temp = root.left.val;
            root.left.val=root.right.val;
            root.right.val=temp;
        } else if (root.left!=null) {
            root.right=root.left;
            root.left=null;
        }else{
            root.left=root.right;
            root.right=null;
        }

        InvertTree(root.left);
        InvertTree(root.right);

    }
}
