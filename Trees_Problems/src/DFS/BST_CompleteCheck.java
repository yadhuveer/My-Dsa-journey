package DFS;

public class BST_CompleteCheck {

    public static boolean BSTTreeComplete(TreeNode root, int max, int min){

        if(root==null){

           return true;
        }

        if(root.left!=null){
            if(!(root.val>root.left.val)|| !(root.left.val>min)){
                return false;
            }
        }


        if(root.right!=null){
            if(!(root.value<root.right.val) || !(root.right.val<max)){
                return false;
            }
        }

        boolean left = BSTTreeComplete(root.left,root.val,min);
        if(!left){
            return left;
        }
        boolean right = BSTTreeComplete(root.right,max,root.val);
        return right;
    }




}
