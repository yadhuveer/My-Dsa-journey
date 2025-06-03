package DFS;

import javax.swing.tree.TreeNode;

public class BinaryToLinkedList {

    public static void BinaryToLinked(TreeNode root){

        if(root==null){
            return;
        }
        if(root.left!=null) {
            TreeNode temp = root.right;

            root.right = root.left;

            TreeNode temp1 = root.right;

            while (temp1.right != null) {
                temp1 = temp1.right;
            }

            temp1.right = temp;
            root.left = null;
        }
        BinaryToLinked(root.right);
    }

}
