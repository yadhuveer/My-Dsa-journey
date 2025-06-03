package DFS;

public class MaxDepthOfTree3 {

    public static int depth1(TreeNode root){
        if(root==null){
            return 0;

        }



        int left = depth1(root.left);
        int right = depth1(root.right);

        return 1+Math.max(left,right);
    }

}
