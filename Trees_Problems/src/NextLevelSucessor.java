import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;



public class NextLevelSucessor {

    public static int nextSuccessor(TreeNode root,int value){


        Queue queue = new LinkedList<>();



        queue.offer(root);


        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            if(node.left!=null){
                queue.offer(node.left);
            }

            if(node.right!=null){
                queue.offer(node.right);
            }

            if(node.val=value){
                return queue.poll().val;
            }

        }
        return -1;


    }

}
