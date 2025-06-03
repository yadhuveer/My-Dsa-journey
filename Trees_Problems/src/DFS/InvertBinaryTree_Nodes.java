package DFS;

public class InvertBinaryTree_Nodes {

    public static TreeNode InvertTree1(TreeNode root){
        if(root==null){
            return root;

        }
        if(root.left==null && root.right==null){
            return root;
        }

        TreeNode left = InvertTree1(root.left);
        TreeNode right = InvertTree1(root.right);

        TreeNode temp = left;

        root.left=right;
        root.right=temp;

        return root;

    }

}
