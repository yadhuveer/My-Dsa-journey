import javax.swing.tree.TreeNode;

public class Cousins {

    public static boolean IsCousins(TreeNode root, int x, int y){

        TreeNode xx = findNode(root, x);

        TreeNode yy = findNode(root, y);

        return (level(root,xx,0)==level(root,yy,0)) && (!isSibling(root,xx,yy));
    }

    public static TreeNode findNode(TreeNode root, int val){

        if(root==null){
            return null;
        }

        if(root.val==val){
            return root;
        }

        TreeNode left = findNode(root.left,val);

        if(left!=null){
            return left;
        }

        return findNode(root.right,val);

    }

    public static int level(TreeNode root, TreeNode xx, int lev){

        if(root==null){
            return 0;
        }

        if(root==xx){
            return lev;
        }

        int levValue = level(root.left,xx,lev+1);

        if(levValue!=0){
            return levValue;
        }

        return level(root.right,xx,lev+1);
    }

    public static boolean isSibling(TreeNode node, TreeNode xx, TreeNode yy){
        if(node==null){
            return false;
        }

        if((node.left==xx && node.right==yy) || (node.left==yy && node.right==xx)){
            return true;
        }

        boolean left = isSibling(node.left, xx,yy);

        if(left){
            return left;
        }


        return isSibling(node.right, xx,yy);
    }


}
