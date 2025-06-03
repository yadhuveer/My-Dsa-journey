package DFS;

import javax.swing.tree.TreeNode;

public class BST_Check {

    public static boolean BSTTree_Check(TreeNode root){

        if(root==null){
            return true;
        }

        if(root.left!=null) {
            if (!(root.value > root.left.value)) {
                return false;
            }
        }

        if(root.right!=null) {
            if (!(root.value < root.right.value)) {
                return false;
            }
        }


        boolean left = BSTTree_Check(root.left);
        if(!left){
            return left;
        }
        boolean right = BSTTree_Check(root.right);
        return right;
    }
}
