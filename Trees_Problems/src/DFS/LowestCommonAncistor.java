package DFS;

import javax.swing.tree.TreeNode;

public class LowestCommonAncistor {

    public static TreeNode LCA(TreeNode root, TreeNode p,TreeNode q){

        if(root==null){
            return root;
        }

        if(root==p || root==q){
            return root;
        }

        TreeNode left = LCA(root.left, p,q);

        TreeNode right = LCA(root.right, p,q);

        if(left!=null && right!=null){
            return root;
        }

        if(left!=null){
            return left;
        }

        if(right!=null){
            return right;
        }

        return null;
    }
}
