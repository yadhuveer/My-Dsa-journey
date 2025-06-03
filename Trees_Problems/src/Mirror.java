import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class Mirror {

    public static boolean mirrorTree(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()){

            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left==null && right== null){
                continue;
            }

            if(left==null || right==null){
                return false;
            }

            if(left.val!=right.val){
                return false;
            }

            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }



        return true;


    }


}
